package simple.learning;

import java.util.ArrayList;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.inference.TTest;

import simple.data.Network;

import simple.simulation.Simulator;

public class Learner {

	// H_0 there are less than 95% healthy nodes on average
	// H_1 There are more than 95% of healthy nodes on average

	// We want to be confident that the average proportion of healthy nodes is above
	// 95%
	private static final double HEALTH_REQUIREMENT_PROPORTION = 0.95;
	private static final int BATCH_REPS = 30;
	private int timeHorizon;
	private static final int MAX_REPS = 300;
	private double pValue;

	public Learner(int timeHorizon, double pValue) {
		super();
		this.timeHorizon = timeHorizon;
		this.pValue = pValue;
	}

	private boolean neededReconfiguration = false;

	public boolean isNeededReconfiguration() {
		return neededReconfiguration;
	}

	public double learnProportionHealthy(Network system) {

		ArrayList<Double> averages = new ArrayList<Double>();
		// double[] averages = new double[MAX_REPS];
		Mean calculatorMean = new Mean();
		TTest ttest = new TTest();
		Simulator s = new Simulator(false); // Not Plotting

		int reps = 0;
		boolean undecided = true;
		while (reps < MAX_REPS && undecided) {
			// go for the first batch
			for (int i = 0; i < BATCH_REPS; i++) {
				double[] results = s.simulate(system, timeHorizon);
				averages.add(calculatorMean.evaluate(results, 0, results.length));
				// Plotter.PlotResults(results);
				System.out
						.println("Simulation number " + reps + " average number of healthy is: " + averages.get(reps));
				reps++;
			}

			// Check if The H0 can be rejected
			double[] auxAvg = ArrayUtils.toPrimitive(averages.toArray(new Double[averages.size()]));
			// First check if the sample mean is lower than the 0.95. In such case, we
			// accept H_0 -> too many are infected
			if (calculatorMean.evaluate(auxAvg, 0, auxAvg.length) < HEALTH_REQUIREMENT_PROPORTION) {
				undecided = false;
				neededReconfiguration = true;
			} else {

				// Get significance level -- p-value . From
				// https://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/stat/inference/TTest.html#tTest(double,%20double[])
				// Returns the observed significance level, or p-value, associated with a
				// one-sample, two-tailed t-test comparing the mean of the input array with the
				// constant mu.
				// The number returned is the smallest significance level at which one can
				// reject the null hypothesis that the mean equals mu in favor of the two-sided
				// alternative that the mean is different from mu. For a one-sided test, divide
				// the returned value by 2.

				if (ttest.tTest(HEALTH_REQUIREMENT_PROPORTION, auxAvg, pValue * 2.0)) {
					// rejected H0, everything OK with the infected
					undecided = false;
					neededReconfiguration = false;

				}
			}
			double calcSignificance = ttest.tTest(HEALTH_REQUIREMENT_PROPORTION, auxAvg) / 2.0;
			System.out.println(
					"Calculated significance is (small values is that it is clear that is on one side or other): "
							+ calcSignificance);
		}
		if (undecided) {
			neededReconfiguration = true;// We couldn't reject the H0. The loop left because it reached the MAX
		}

		return calculatorMean.evaluate(ArrayUtils.toPrimitive(averages.toArray(new Double[averages.size()])), 0,
				averages.size());

	}

	public void improve(Network n) {
		while(isNeededReconfiguration()) {
			//get random node
			//for each neighbor
				//if is same type, keeps more than two links, and does not break the connection
				//remove neighbor (also from the other!)
				//calculate probability and maybe it will not be needed to remove more
			
			//If it was not possible to remove anything and still does not meet requirements --> failed improvement
		}
		
	}

}

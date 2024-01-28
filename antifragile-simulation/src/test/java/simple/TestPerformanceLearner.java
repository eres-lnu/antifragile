package simple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import simple.data.Network;
import simple.exceptions.NoSatisfyingImprovementFoundException;
import simple.learning.Learner;
import simple.simulation.Simulator;
import org.apache.commons.math3.stat.descriptive.moment.Mean;

class TestPerformanceLearner {

	@BeforeEach
	void setLearner() {
		l = new Learner(5000, 5, 0.05);
		n = new Network();
		s = new Simulator(false);
		
	}

	Learner l;
	Network n;
	Simulator s;

	// We test a system from 100, 200, .... 10.000 nodes (100 executions) where
	// there is 10% of software types and 20% of neighbors.
	// The probability of attack is fixed 0.005 and the healthy time is 2.5. These
	// two themselves, without propagation possible already
	// create a 0.5% of infected nodes, in average. That's the theoretical limit
	// without any edge between two nodes of the same type, 99.5%
	private int startNodes = 100;
	private int endNodes = 10000;
	private int increment = startNodes;

	@Test
	void testPerformance() {
		long timeStart, timeEnd; 
		long totalTime=0;

		for (int i = startNodes; i <= endNodes; i = i + increment) {
			// 10 iterations for each system size
			for (int j = 0; j < 10; j++) {
				n.createSystem(i, i / 10, i / 5, 0.005, 2.5, null);
				System.out.println("Size i=" + i + " Iteration j=" +j + " Average proportion of healthy nodes is: " + l.learnProportionHealthy(n));
				int initialNumberOfTotalNeighbors = n.countAllNeighbors();
				
				if (l.isNeededReconfiguration()) {
					try {
						timeStart=System.currentTimeMillis();
						l.improve(n);
						timeEnd=System.currentTimeMillis();
						totalTime=totalTime+timeEnd-timeStart;
						//System.out.println(n.toString());
						System.out.println("Total number of edges was: " + initialNumberOfTotalNeighbors + " and now is: "
								+ n.countAllNeighbors() + " with a proportion of healthy of " +  l.learnProportionHealthy(n) +  " and it took milliseconds=" + (timeEnd-timeStart));
					} catch (NoSatisfyingImprovementFoundException e) {
						System.out.println("Impossible to improve");
						e.printStackTrace();
					}
				}
				else {
					System.out.println("Size i=" + i + " Iteration j=" +j + "It was not needed a reconfiguration!");
				}

			}
		}


	}
	
	@Test
	void test1000nodes() {
		long timeStart, timeEnd; 
		long totalTime=0;

		for (int i = 1000; i <= 1000; i = i + increment) {
			// 10 iterations for each system size
			for (int j = 0; j < 10; j++) {
				n.createSystem(i, i / 10, i / 5, 0.005, 2.5, null);
				System.out.println("System created");
				double[] results = s.simulate(n, 5000);
				System.out.println("Size i=" + i + " Iteration j=" +j + " Average proportion of healthy nodes is: " + (new Mean()).evaluate(results, 0, results.length) );
				int initialNumberOfTotalNeighbors = n.countAllNeighbors();
				l.learnProportionHealthy(n);
				if (l.isNeededReconfiguration()) {
					try {
						timeStart=System.currentTimeMillis();
						l.improve(n);
						timeEnd=System.currentTimeMillis();
						totalTime=totalTime+timeEnd-timeStart;
						//System.out.println(n.toString());
						System.out.println("Total number of edges was: " + initialNumberOfTotalNeighbors + " and now is: "
								+ n.countAllNeighbors() + " with a proportion of healthy of" +  l.learnProportionHealthy(n) +  " and it took milliseconds=" + (timeEnd-timeStart));
					} catch (NoSatisfyingImprovementFoundException e) {
						System.out.println("Impossible to improve");
						e.printStackTrace();
					}
				}
				else {
					System.out.println("Size i=" + i + " Iteration j=" +j + "It was not needed a reconfiguration!");
				}

			}
		}


	}
	
	@Test
	void testModestSize() {
		long timeStart, timeEnd; 
		long totalTime=0;

		for (int i = 20; i <= 200; i = i + 10) {
			// 10 iterations for each system size
			for (int j = 0; j < 10; j++) {
				n.createSystem(i, i / 10, i / 5, 0.005, 2.5, null);
				System.out.println("System created");
				double[] results = s.simulate(n, 5000);
				System.out.println("Size i=" + i + " Iteration j=" +j + " Average proportion of healthy nodes is: " + (new Mean()).evaluate(results, 0, results.length) );
				int initialNumberOfTotalNeighbors = n.countAllNeighbors();
				l.learnProportionHealthy(n);
				if (l.isNeededReconfiguration()) {
					try {
						timeStart=System.currentTimeMillis();
						l.improve(n);
						timeEnd=System.currentTimeMillis();
						totalTime=totalTime+timeEnd-timeStart;
						//System.out.println(n.toString());
						System.out.println("Total number of edges was: " + initialNumberOfTotalNeighbors + " and now is: "
								+ n.countAllNeighbors() + " with a proportion of healthy of" +  l.learnProportionHealthy(n) +  " and it took milliseconds=" + (timeEnd-timeStart));
					} catch (NoSatisfyingImprovementFoundException e) {
						System.out.println("Impossible to improve");
						e.printStackTrace();
					}
				}
				else {
					System.out.println("Size i=" + i + " Iteration j=" +j + "It was not needed a reconfiguration!");
				}

			}
		}


	}

}

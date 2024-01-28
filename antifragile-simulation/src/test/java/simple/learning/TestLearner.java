package simple.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.math3.stat.inference.TTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import simple.data.Network;
import simple.exceptions.NoSatisfyingImprovementFoundException;

class TestLearner {

	@BeforeEach 
	void setLearner() {
		l = new Learner(24*365, 0.05);
		n = new Network();
	}
	
	Learner l;
	Network n;
	
	@Test
	void testAllNodesAlmostGood() {
		n.createSystem(100, 20, 4, 0.01, 2.5, "file");	//With so many types of software, it's more difficult to propagate
		System.out.println("TEST end: average proportion of healthy nodes is: " + l.learnProportionHealthy(n));
	}
	
	@Test
	void testNeedsReconfigurationTooManyNeighbors() {
		n.createSystem(100, 10, 20, 0.005, 2.5, "file");	//With so many types of software, it's more difficult to propagate
		int initialNumberOfTotalNeighbors = n.countAllNeighbors();
		System.out.println("Average proportion of healthy nodes is: " + l.learnProportionHealthy(n));
		if(l.isNeededReconfiguration()) {
			try {
				l.improve(n);
				System.out.println(n.toString());
				System.out.println("Total number of edges was: " +initialNumberOfTotalNeighbors + " and now is: " + n.countAllNeighbors());
			} catch (NoSatisfyingImprovementFoundException e) {
				System.out.println("Impossible to improve");
				e.printStackTrace();
			}
		}
	}
	
	
	@Test
	void testTTest() {
		double[] highValues = {	0.99, 0.98, 0.99, 0.98,0.99, 0.98,0.99, 0.98, 
								0.99, 0.98, 0.99, 0.98,0.99, 0.98,0.99, 0.98,
								0.99, 0.98, 0.99, 0.98,0.99, 0.98,0.99, 0.98};
		
		double[] lowValues = {	0.7, 0.75, 0.7, 0.75, 0.7, 0.75, 0.7, 0.75, 0.7, 0.75,
								0.7, 0.75, 0.7, 0.75, 0.7, 0.75, 0.7, 0.75, 0.7, 0.75,
								0.7, 0.75, 0.7, 0.75, 0.7, 0.75, 0.7, 0.75, 0.7, 0.75};
		
		double[] intermediateValues = {0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 
										0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 
										0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9};
		
		double[] intermediateValuesTowardsReject = {0.8, 0.9, 0.9, 0.9, 0.8, 0.9, 0.9, 0.9, 0.8, 0.9, 0.9, 0.9, 0.8, 0.9, 0.9, 0.9 };
		double[] intermediateValuesTowardsAccept = {0.8, 0.93, 0.8, 0.91, 0.8, 0.92, 0.8, 0.91, 0.8, 0.9, 
													0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 
													0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9, 0.8, 0.9};
		
		
		TTest ttest = new TTest();
		
		System.out.println("Significance for high values is " +  ttest.tTest(0.95, highValues));
		System.out.println("----The sample mean < mu at the 95% level for high values is: " + ttest.tTest(0.95, highValues, 0.05*2.0));
		System.out.println("----The t value of high is: " + ttest.t(0.95, highValues));
		
		System.out.println("Significance for low values is " +  ttest.tTest(0.95, lowValues));
		System.out.println("----The sample mean < mu at the 95% level for low values is: " + ttest.tTest(0.95, lowValues, 0.05*2.0));
		System.out.println("----The t value of low values is: " + ttest.t(0.95, lowValues));
		
		System.out.println("Significance for intermediate values is " +  ttest.tTest(0.85, intermediateValues));
		System.out.println("----The sample mean < mu at the 95% level for intermediate values is: " + ttest.tTest(0.85, intermediateValues, 0.05*2.0));
		System.out.println("----The t value of intermediate is: " + ttest.t(0.85, intermediateValues));
		
		System.out.println("Significance for intermediate values towards reject is " +  ttest.tTest(0.85, intermediateValuesTowardsReject));
		System.out.println("----The sample mean < mu at the 95% level for intermediate values towards reject is: " + ttest.tTest(0.85, intermediateValuesTowardsReject, 0.05*2.0));
		System.out.println("----The t value of intermediate values towards reject is: " + ttest.t(0.85, intermediateValuesTowardsReject));
		
		System.out.println("Significance for intermediate values towards accept is " +  ttest.tTest(0.85, intermediateValuesTowardsAccept));
		System.out.println("----The sample mean < mu at the 95% level for intermediate values towards accept is: " + ttest.tTest(0.85, intermediateValuesTowardsAccept, 0.05*2.0));
		System.out.println("----The t value of intermediate values towards accept is: " + ttest.t(0.85, intermediateValuesTowardsAccept));
	}

}

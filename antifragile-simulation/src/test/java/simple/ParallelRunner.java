package simple;

import simple.data.Network;
import simple.exceptions.NoSatisfyingImprovementFoundException;
import simple.learning.Learner;

public class ParallelRunner implements Runnable {

	public ParallelRunner(int i, int j, Learner l, Network n, long[][] allTimes, long[] totalTimes) {
		super();
		this.i = i;
		this.j = j;
		this.l = l;
		this.n = n;
		this.allTimes = allTimes;
		this.totalTimes = totalTimes;
	}

	private int i, j;
	private Learner l;
	private Network n;
	private long[][] allTimes;
	private long[] totalTimes;

	@Override
	public void run() {
		long timeStart, timeEnd;

		int initialNumberOfTotalNeighbors = n.countAllNeighbors();
		l.learnProportionHealthy(n);
		if (l.isNeededReconfiguration()) {
			try {
				timeStart = System.currentTimeMillis();
				l.improve(n);
				timeEnd = System.currentTimeMillis();
				System.out.println("Size i=" + n.getNumberOfNodes() + " Iteration j=" +j + " Total number of edges was: " + initialNumberOfTotalNeighbors + " and now is: "
						+ n.countAllNeighbors() + " with a proportion of healthy of " +  l.learnProportionHealthy(n) +  " and it took millisecond=" + (timeEnd-timeStart));
				totalTimes[i] = totalTimes[i] + timeEnd - timeStart;
				allTimes[i][j]=timeEnd-timeStart;
			} catch (NoSatisfyingImprovementFoundException e) {
				System.out.println("Impossible to improve");
				e.printStackTrace();
			}

		}
		else {
			System.out.println("Size i=" + n.getNumberOfNodes() + " Iteration j=" +j + "It was not needed a reconfiguration!");
		}
	}

}

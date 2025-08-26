package simple.data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import simple.data.Network;
import simple.plot.Plotter;
import simple.simulation.Simulator;

class TestNetwork {

	protected static final Logger log = LogManager.getLogger(TestNetwork.class);

	Network l;

	@BeforeEach
	void createNetwork() {
		l = new Network();
	}

	@Test
	void testLoad10() {

		l.createSystem(10, 4, 1.5, 0.01, 10.0, "file");
		System.out.println(l.toString());
	}

	@Test
	void testClone() {
		l.createSystem(10, 4, 1.5, 0.01, 10.0, "file");
		Network cloned = l.cloneNetwork();
		Assertions.assertTrue(cloned.equals(l));
		cloned.getNeighbors(0).set(0, cloned.getNeighbors(0).get(0) + 1);
		Assertions.assertFalse(cloned.equals(l));
	}

	@Test
	void testRestoreLink() {
		l.createSystem(10, 4, 2, 0.01, 10.0, "file");

		/*
		 * Should exist the neighbor 1-0 from the way that the network is connected when
		 * it is created
		 */
		log.debug("Trying to restore 1-0");
		Assertions.assertFalse(l.restoreNeighbor(1, 0));

		log.debug("Trying to remove 1-0");
		Assertions.assertTrue(l.removeNeighbor(1, 0));

		// False when removing again
		log.debug("Trying to restore again 0-1");
		Assertions.assertFalse(l.removeNeighbor(0, 1));

		log.debug("Trying to restore 0-1");
		Assertions.assertTrue(l.restoreNeighbor(0, 1));

		// False restoring again
		log.debug("Trying to restore again 1-0");
		Assertions.assertFalse(l.restoreNeighbor(1, 0));

		/* Find one that is not neighbor */
		// Try to remove it
		// Try to restore it
		/* For all possibilitis of node 4 */
		int n = 4;
		for (int i = 0; i < 10; i++) {
			// Impossible to restore something not removed
			Assertions.assertFalse(l.restoreNeighbor(n, i));
			// If it existed, restore twice...
			if (l.removeNeighbor(n, i)) {

				// Try to remove it again
				Assertions.assertFalse(l.removeNeighbor(i, n));
				// Try to restore it
				Assertions.assertTrue(l.restoreNeighbor(i, n));
				// Try to restore it again
				Assertions.assertFalse(l.restoreNeighbor(n, i));

			} else {
				// Did not exist should not restore
				Assertions.assertFalse(l.restoreNeighbor(i, n));
			}
		}

		/* Find one that is neighbor */
		// Try to restore it
		// Try to remove it
		// Try to restore it
		// Try to restore it

	}

	@Test
	void testSimulate10() {
		Simulator s = new Simulator(false); // No plotting
		l.createSystem(10, 4, 1.5, 0.01, 10.0, "file");
		double[] results = s.simulate(l, 100);
		System.out.println(Arrays.toString(results));

	}

	@Test
	void testSimulate10plotting() throws IOException {
		Simulator s = new Simulator(true); // Plotting
		l.createSystem(10, 4, 1.5, 0.01, 10.0, "file");
		double[] results = s.simulate(l, 100);
		System.out.println(Arrays.toString(results));
		s.saveFile("simulate10plotting");
		(new Scanner(System.in)).nextLine();

	}

	@Test
	void testSimulate10Time10000PlotEnd() throws IOException {
		Simulator s = new Simulator(false); // Plotting
		l.createSystem(10, 4, 1.5, 0.01, 10.0, "file");
		double[] results = s.simulate(l, 10000);
		System.out.println(Arrays.toString(results));
		Plotter.PlotResults(results);
		(new Scanner(System.in)).nextLine();
	}

	@Test
	void test10IterationsSimulate10NodesTime10000PlotEnd() throws IOException {
		for (int i = 0; i < 10; i++) {
			Simulator s = new Simulator(false); // Plotting
			l.createSystem(10, 4, 1.5, 0.01, 10.0, "file");
			double[] results = s.simulate(l, 10000);
			System.out.println(Arrays.toString(results));
			Plotter.PlotResults(results);
		}

		(new Scanner(System.in)).nextLine();

	}

	@Test
	void test10IterationsSameSystemSimulate10NodesTime10000PlotEnd() throws IOException {

		Simulator s = new Simulator(false); // Plotting
		l.createSystem(10, 4, 1.5, 0.01, 10.0, "file");
		for (int i = 0; i < 10; i++) {
			double[] results = s.simulate(l, 10000);
			System.out.println(Arrays.toString(results));
			Plotter.PlotResults(results);
		}

		(new Scanner(System.in)).nextLine();

	}

	@Test
	void testConvergence10IterationsSameSystem100NodesTime10000PlotEnd() throws IOException {

		double[][] results = new double[10][];
		Simulator s = new Simulator(false); // Plotting
		l.createSystem(100, 10, 20, 0.005, 2.5, "file");
		for (int i = 0; i < 10; i++) {
			results[i] = s.simulate(l, 10000);
			System.out.println(Arrays.toString(results[i]));
			Plotter.PlotResults(results[i]);
			convertToAverageUpToT(results[i]);

		}
		saveMatrixFile(results, "convergence10itartionsSameSystem100Nodes10000Steps.csv", ";");
		(new Scanner(System.in)).nextLine();

	}

	private void convertToAverageUpToT(double[] ds) {
		double average = 0.0;
		for (int i = 0; i < ds.length; i++) {

			average = (average * ((double) i) + ds[i]) / ((double) (i + 1.0));
			ds[i] = average;
		}

	}

	private void saveMatrixFile(double[][] m, String filename, String separator) {
		try {
			FileWriter wr = new FileWriter(filename);

			for (int numSim = 0; numSim < m.length; numSim++) {
				for (int timestamp = 0; timestamp < m[numSim].length; timestamp++) {
					wr.write("" + m[numSim][timestamp] + ";");

				}
				wr.write(System.getProperty("line.separator"));
			}
			wr.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}

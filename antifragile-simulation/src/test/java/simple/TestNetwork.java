package simple;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import simple.data.Network;
import simple.plot.Plotter;
import simple.simulation.Simulator;

class TestNetwork {

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
}

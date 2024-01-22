package simple;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import simple.data.Network;
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
		Simulator s = new Simulator();
		l.createSystem(10, 4, 1.5, 0.01, 10.0, "file");
		double[] results = s.simulate(l, 100);
		System.out.println(Arrays.toString(results));
		
	}
	
}

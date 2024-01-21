package simple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNetwork {

	@Test
	void testLoad10() {
		Network l = new Network();
		l.createSystem(10, 4, 1.5, 0.01, 0.005, "file");
		System.out.println(l.toString());
	}

}

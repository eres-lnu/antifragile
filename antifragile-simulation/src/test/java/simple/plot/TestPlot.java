package simple.plot;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.jfree.ui.RefineryUtilities;
import org.junit.jupiter.api.Test;

class TestPlot {

	@Test
	void test() {
			double[] data = {1.0, 0.5, 0.4, 1.0, 0.9, 0.75, 
							1.0, 0.5, 0.4, 1.0, 0.9, 0.75,
							1.0, 0.5, 0.4, 1.0, 0.9, 0.75};
			      Plotter chart = new Plotter(
			         "Network simulation" ,
			         "Proportion of healthy nodes");
			      chart.addDataset(data, 0, data.length);

			      chart.pack( );
			      RefineryUtilities.centerFrameOnScreen( chart );
			      chart.setVisible( true );
			      Scanner scanner = new Scanner(System.in); 
			      scanner.nextLine();
			   
	}

}

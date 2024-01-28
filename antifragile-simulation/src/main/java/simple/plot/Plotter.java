package simple.plot;

import org.jfree.chart.ChartPanel;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Plotter extends ApplicationFrame {

	private static final long serialVersionUID = 1L;
	private ChartPanel chartPanel;
	private JFreeChart lineChart;

	public Plotter(String applicationTitle, String chartTitle) {
		super(applicationTitle);

		lineChart = ChartFactory.createLineChart(chartTitle, "Time", "Percentage of heal",
				createDataset(new double[1], 0, 1), PlotOrientation.VERTICAL, true, true, false);

		chartPanel = new ChartPanel(lineChart);
		// Check chartPanel.setChart later.
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
		setContentPane(chartPanel);

	}

	//

	/**
	 * @param proportions is the array with the proportion of healthy nodes in each
	 *                    step
	 * @return a dataset with a line for the current percentage of healthy and
	 *         another line with the average up to the moment
	 */
	private DefaultCategoryDataset createDataset(double[] proportions, int start, int end) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		double average = 0.0;
		for (int i = start; i < end; i++) {
			dataset.addValue(proportions[i], "healty-nodes", Integer.valueOf(i));
			average = (average * ((double) i) + proportions[i]) / ((double) (i + 1.0));
			dataset.addValue(average, "average", Integer.valueOf(i));
		}
		data = dataset;
		return dataset;
	}

	private DefaultCategoryDataset data;

	public void addValueToDataset(double[] result, int start, int end) {

		chartPanel.setChart(ChartFactory.createLineChart(lineChart.getTitle().getText(), "Time", "Percentage of heal",
				createDatasetQuick(result[end], end),
				// createDataset(result, start, end),
				PlotOrientation.VERTICAL, true, true, false));
		setContentPane(chartPanel);
		pack();
		RefineryUtilities.centerFrameOnScreen(this);
		setVisible(true);

	}

	public void addDataset(double[] result, int start, int end) {

		chartPanel.setChart(ChartFactory.createLineChart(lineChart.getTitle().getText(), "Time", "Percentage of heal",
			    createDataset(result, start, end),
				PlotOrientation.VERTICAL, true, true, false));
		setContentPane(chartPanel);
		pack();
		RefineryUtilities.centerFrameOnScreen(this);
		setVisible(true);

	}
	
	private CategoryDataset createDatasetQuick(double d, int position) {
		data.addValue(d, "healty-nodes", Integer.valueOf(position));
		double average = 0.0;
		if (position > 0) {
			average = (double) data.getValue("average", Integer.valueOf(position - 1));
		}
		average = (average * ((double) position) + d) / ((double) (position + 1.0));
		data.addValue(average, "average", Integer.valueOf(position));

		return data;
	}

	public void save(String filename) throws IOException {

//		int width = 640; /* Width of the image */
//		int height = 480; /* Height of the image */

//		File filejpeg = new File("target/" + filename+".jpeg" );
//		System.out.println("Chart bounds are: " + chartPanel.getBounds().toString());
//		ChartUtilities.saveChartAsPNG(filepng, lineChart, chartPanel.getWidth(), chartPanel.getHeight());
//		ChartUtilities.saveChartAsJPEG(filejpeg, lineChart, chartPanel.getWidth(), chartPanel.getHeight());
		Rectangle rec = chartPanel.getBounds();
		BufferedImage img = new BufferedImage(rec.width, rec.height, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		chartPanel.paint(g);
		File filepng = new File("target/" + filename + ".png");
		ImageIO.write(img, "png", filepng);

	}

	public static void PlotResults(double[] results) {
		(new Plotter("Network simulation", "Proportion of healthy nodes")).addDataset(results, 0, results.length);
		
	}

}

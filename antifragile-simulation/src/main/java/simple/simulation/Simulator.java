package simple.simulation;

import simple.data.Network;

public class Simulator {

	public double[] simulate(Network system, int timeSteps) {
		
		double[] result = new double[timeSteps];
		
		for(int t=0; t<timeSteps; t++) {
			result[t] = simulateStep(system);
		}
		return result;
	}

	/**
	 * @param system the network to simulate
	 * @param attack the known attacks
	 * @return the percentage of infected nodes after the step
	 */
	private double simulateStep(Network system) {
		//First propagate infected
		propagateInfection(system);
		//Create new outbreak infections
		createOutbreaks(system);
		//Self-heal
		healNodes(system);
		//Count infected and create proportion		
		return calculateProportionInfected(system);
	}

	private double calculateProportionInfected(Network system) {
		return system.calculateProportionInfected();
	}

	private void healNodes(Network system) {
		system.healNodes();
	}

	private void createOutbreaks(Network system) {
		system.createOutbreaks();
	}

	private void propagateInfection(Network system) {
		system.propagateInfections();
		
	}
	
}

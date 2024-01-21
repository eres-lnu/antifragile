package simple;

import java.util.ArrayList;
import java.util.Random;

public class Network {

//An array for the types and an array for the nodes
	private ArrayList<Integer>[] neighbors;
	private int[] type;
	private boolean[] isInfected;
	private double meanHealingT; // all nodes have the same healtime

	private VulnerabilityExploit[] exploits;

	private Random r = new Random();

//Creates a single vulnerability for each type of sofware
	public void createSystem(int nnodes, int nsoftware, double avgNeighbors, double avgProbAttack, double meanHealT,
			String filename) {

	
		exploits = new VulnerabilityExploit[nsoftware];
		type = new int[nnodes];
		neighbors = new ArrayList[nnodes];
		isInfected = new boolean[nnodes];
		meanHealingT = meanHealT;
		// fill exploits
		fillExploits(nsoftware, avgProbAttack);
		fillType(nnodes, nsoftware);
		fillNeighbor(nnodes, avgNeighbors);
		fillInfected(nnodes);

	}

	private void fillInfected(int nnodes) {
		for (int i = 0; i < nnodes; i++) {
			isInfected[i] = false;
		}
	}

	private void fillNeighbor(int nnodes, double avgNeighbors) {
		for (int i = 0; i < nnodes; i++) {
			neighbors[i] = new ArrayList<Integer>();
		}

		// Since each neighbor counts double, the avgNeignobrs is divided by 2.
		double neigForNode = avgNeighbors / 2.0;
		double probabilityAnotherNeigh = (neigForNode - 1.0) / neigForNode;
		for (int i = 0; i < nnodes; i++) {

			// Create the first (to a previous node) and then create the rest to any that is
			// not our neighbor.
			// If node is 0, we do not create the first to a previous

			int neigh;
			if (!allPreviousAreNeighbors(i)) {
				neigh = r.nextInt(i); // Creates a random between 0 (incl) and i (excl)
				int count = 0;
				int indexSearchNodes = 0;

				// find the neighbor. Not the "neigh" because it may be already a neighbor
				while (count < neigh) {
					if (!isAlreadyNeighbor(indexSearchNodes, i)) {
						count++;
					}
					indexSearchNodes = (indexSearchNodes + 1) % i;
				}
				addNeighbor(indexSearchNodes, i);
			} else {// create the first neighbor between i and nnodes
				if (i < nnodes - 1) {
					neigh = r.nextInt(nnodes - 1 - i); // TODO: this may be called with a 0 if we are in the last node
					addNeighbor(i + 1 + neigh, i);
				}
			}

			// First created
			while (r.nextDouble() < probabilityAnotherNeigh) {
				neigh = r.nextInt(nnodes - 1);
				addNeighbor(searchIthNodeNotNeighborYet(neigh, i, nnodes), i);
			}
		}

	}

	private int searchIthNodeNotNeighborYet(int ithNotNeighbor, int nodeIndex, int nnodes) {
		int count = 0;
		int indexSearched = 0;
		while (count < ithNotNeighbor) {
			if (!isAlreadyNeighbor(indexSearched, nodeIndex)) {
				count++;
			}
			indexSearched = (indexSearched + 1) % nnodes;
		}
		return indexSearched;
	}

	private boolean allPreviousAreNeighbors(int i) {
		for (int j = 0; j < i; j++) {
			if (!isAlreadyNeighbor(j, i)) {
				return false;
			}
		}
		return true;
	}

	private boolean isAlreadyNeighbor(int node, int neigh) {
		if (node == neigh) {
			return true;
		}
		return neighbors[node].contains(neigh);
	}

	private void addNeighbor(int j, int i) {
		neighbors[j].add(i);
		neighbors[i].add(j);

	}

	private void fillType(int nnodes, int differents) {
		for (int i = 0; i < nnodes; i++) {
			type[i] = (int) Math.floor(Math.random() * differents);

		}

	}

	private void fillExploits(int nsoftware, double avgProbAttack) {
		for (int i = 0; i < nsoftware; i++) {
			exploits[i] = new VulnerabilityExploit(i, avgProbAttack, i);
		}
	}

	@Override
	public String toString() {
		String result = "";

		for (int i=0; i<neighbors.length; i++) {
			result +="Node " + i+"- Neighbors: ";
			for(Integer n : neighbors[i]) {
				result+=n+", ";
			}
			result+=System.getProperty("line.separator") ;
		
					
		}
	return result;
	}
	
}

package simulation;

import org.eclipse.emf.ecore.resource.ResourceSet;

import model.nodes.NetworkedSystem;
import model.nodes.Node;
import model.nodes.NodesFactory;
import model.nodes.NodesPackage;

public class Loader {

	private static final NodesFactory factory = NodesFactory.eINSTANCE;
	private static ResourceSet rs;

	public void createModel(int nnodes, int nsoftware, double avgBeighbours, String filename){
		NodesPackage justForInit = NodesPackage.eINSTANCE;
		NetworkedSystem ns = setupNetworkedSystem();
		
		Node nodes[] = new Node[nnodes];
		
		for(int i=0; i<nsoftware; i++) {
			ns.getSofware().add(factory.createSoftwareType());
		}
		
		for(int i = 0 ; i<nnodes; i++) {
			nodes[i]=factory.createNode();
			nodes[i].setNodeID("node-"+i);
			nodes[i].setInstalledSoftware(null); /// one of the installed software
		}
		
		
		
		
	}

	private NetworkedSystem setupNetworkedSystem() {
		NetworkedSystem ns = factory.createNetworkedSystem();
		ns.setVectors(factory.createAttackVectors());
		return ns;
	}

}

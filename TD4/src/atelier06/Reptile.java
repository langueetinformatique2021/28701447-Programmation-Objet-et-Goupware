package atelier06;
/** Création et gestion de Reptile */

public class Reptile extends Animal {
// ajout d'attributs propres à la sous-classe
	protected boolean sauvage = false;
		
	/**
	* le constructeur de Reptile fait appel au constructeur de la sur-classe Animal
	*/
	
	public Reptile(String type) { // les Reptiles ont 4 pattes
		super(type, 4);
	}

	
	/** présentation des caractéristiques du Reptile */
	public void présente() {

//appel de la méthode de la sur-classe
		super.présente();
		String etat = (sauvage) ? "domestique" : "sauvage";
		System.out.println("je suis vraiment un animal " + etat);
	}






	/** cri du Reptile */
	public void crie() {
		System.out.println("Je crie donc je suis");
		
	}
}

package atelier06;

public class Crocodile extends Reptile implements Sauvage  { 
	String nom;
	
	public Crocodile() {
		super("crocodile");
	}

	public void Sauvager(String nom) {
		sauvage = true;
		this.nom = nom;
	}

	public String nom() {
		return nom;
	}
	
	public void présente() {
		super.présente();
		if (sauvage == true)
			System.out.println("Je m'appelle " + nom());
	}

	public void crie() {
		if (sauvage== true)
			System.out.print("Je miaule donc je suis");
		else
			super.crie();
	}


}



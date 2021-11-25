package TD5;

/* 
 * 
 * @author peng HAO
 * 
 */
public class Etudiant {
	
	private String Nom_, Prenom_, Option_, Niveau_;
	private int NumeroEtudiant_;
	
	/**
	 * determiner les attributs correspondant
	 * 
	 * @param Nom_
	 * @param Prenom_
	 * @param Option_
	 * @param NumeroEtudiant_
	 */

	public String getPrenom_() {
		return Prenom_;
	}

	public void setPrenom_(String prenom_) {
		Prenom_ = prenom_;
	}

	public String getNom_() {
		return Nom_;
	}

	public void setNom_(String nom_) {
		Nom_ = nom_;
	}
	
	public String getOption_() {
		return Option_;
	}

	public void setOption_(String option_) {
		Option_ = option_;
	}

	public int getNumeroEtudiant_() {
		return NumeroEtudiant_;
	}

	public void setNumeroEtudiant_(int numeroEtudiant_) {
		NumeroEtudiant_ = numeroEtudiant_;
	}

	public String getNiveau_() {
		return Niveau_;
	}

	public void setNiveau_(String niveau_) {
		Niveau_ = niveau_;
	}

		
		

}

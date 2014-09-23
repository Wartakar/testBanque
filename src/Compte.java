
public class Compte {
	
	private int numCompte;
	private String nomCompte;
	private int Soldes;
	
	
	//Constructeurs
	public Compte(int unNumCompte,String unNomCompte,int unSoldes){
		this.numCompte = unNumCompte;
		this.nomCompte = unNomCompte;
		this.Soldes = unSoldes;
	}
	
	//M�thodes publiques
	public String toString(){
		String chain = ("Num�ro de compte : " + (getNumCompte()) + " Propri�taire du compte : " + getNomCompte() + " Solde : " + getSoldes() + "�");
		return chain;
	}
	
	public int getNumCompte() {
		return this.numCompte;
	}


	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}


	public String getNomCompte() {
		return this.nomCompte;
	}


	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}


	public int getSoldes() {
		return this.Soldes;
	}


	public void setSoldes(int soldes) {
		Soldes = soldes;
	}

}

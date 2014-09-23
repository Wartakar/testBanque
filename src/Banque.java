import java.util.ArrayList;
public class Banque {
	
	private String nomBanque;
	private ArrayList<Compte>listeCompte;
	//Constructeur
	public Banque(String unNomBanque){
		this.nomBanque = unNomBanque;
	}
	
	//Méthodes publiques
	public String getNomBanque() {
		return this.nomBanque;
	}

	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}
	
	public void voirCompte(){
		int i;
		for(i=0;i>listeCompte.size();i++){
			System.out.println(listeCompte.get(i).toString());
		}
	}
	public void ajouterCompte(Compte unCompte){//Recommencer pour tout les machins du compte
		listeCompte.add(unCompte);
	}
}

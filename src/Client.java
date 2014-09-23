// message d'ibrahima
// 2eme message
public class Client {

	private int numClient;
	private String nomClient;
	private String civilite;
	private String adresse;
	private String mail;
	private String tel;

	//Constructeurs
	public Client(int unNum,String unNomClient,String uneCivilite,String uneAdresse, String unMail, String unTel){
		this.numClient = unNum;
		this.nomClient = unNomClient;
		this.civilite = uneCivilite;
		this.adresse = uneAdresse;
		this.mail = unMail;
		this.tel = unTel;
	}
	//Méthodes publiques
	public String toString(){
		String chain = ("Numéro client : " + getNumClient() + "\nCivilité : " +getCivilite() +"Nom : " + getNomClient() + "\nAdresse : " + getAdresse()+ " Mail" + getMail() + " Téléphone :" + getTel());
		return chain;
	}
	
	
	public int getNumClient() {
		return this.numClient;
	}
	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}
	public String getNomClient() {
		return this.nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getCivilite() {
		return this.civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getAdresse() {
		return this.adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return this.mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
		
	}

}

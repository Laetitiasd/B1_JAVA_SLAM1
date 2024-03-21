package voix0301;

public class Lecteur {

	private int numero;
	private String nom;
	private String prenom;
	private int nbAudioBooks = 0 ;
	
	public Lecteur(int numero, String nom, String prenom, int nbAudioBooks) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
		this.nbAudioBooks = nbAudioBooks;
	}

	public Lecteur(int numero, String nom, String prenom) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNbAudioBooks() {
		return nbAudioBooks;
	}

	public void setNbAudioBooks(int nbAudioBooks) {
		this.nbAudioBooks = nbAudioBooks;
	}
	
	public boolean estActif() {
	    if (nbAudioBooks > 10)
	        return true;
	    else
	        return false;
	}
	
	public int produireUnAudioBook(int AudioBooks) {
		nbAudioBooks = nbAudioBooks + AudioBooks;
		return nbAudioBooks;
	}

	@Override
	public String toString() {
		return "Lecteur [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", nbAudioBooks=" + nbAudioBooks
				+ "]";
	}
	
	
	
}

package fr.voxi.admin;

public class Oeuvres {
	
	private int numero;
	private String titre;
	private String auteur;
	
	public Oeuvres( int numero, String titre, String auteur) {
		super();
		this.numero = numero;
		this.auteur = auteur;
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Ecoutes [numero=" + numero + ", titre=" + titre + ", auteur=" + auteur + "]";
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}

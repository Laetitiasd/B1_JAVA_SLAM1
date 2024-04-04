package fr.voxi.admin;

import java.time.LocalDate;

public class Candidature {

	private int numero;
	private LocalDate DateDepot;
	private LocalDate DateReponse;
	private String etat;
	
	public Candidature(int numero, LocalDate dateDepot, LocalDate dateReponse, String etat) {
		super();
		this.numero = numero;
		DateDepot = dateDepot;
		DateReponse = dateReponse;
		this.etat = etat;
	}	

	public Candidature(int numero, LocalDate dateDepot, String etat) {
		super();
		this.numero = numero;
		DateDepot = dateDepot;
		this.etat = etat;
	}
	
	@Override
	public String toString() {
		return "Candidature [numero=" + numero + ", DateDepot=" + DateDepot + ", DateReponse=" + DateReponse + ", etat="
				+ etat + "]";
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public LocalDate getDateDepot() {
		return DateDepot;
	}
	
	public void setDateDepot(LocalDate DateDepot) {
		this.DateDepot = DateDepot;
	}
	
	public LocalDate getDateReponse() {
		return DateReponse;
	}
	
	public void setDateReponse(LocalDate DateReponse) {
		this.DateReponse = DateReponse;
	}
	
	public String getEtat() {
		return etat;
	}
	
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public void EtatCandit(String etat) {
		
		switch(etat) {
		
		case "1":
			System.out.println("En Attente");
			break;
			
		case "2" :
			System.out.println("Étudiée");
			break;
			
		case "3" :
			System.out.println("Annulée");
			break;
		
		case "4" :
			System.out.println("Accepté");
			break;
			
		case "5" :
			System.out.println("Rejetée");
			break;
		
		}
		
		
	}
	
	
}

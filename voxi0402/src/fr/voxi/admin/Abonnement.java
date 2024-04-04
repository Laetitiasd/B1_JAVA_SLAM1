package fr.voxi.admin;

import java.time.LocalDate;

public class Abonnement {
	
	private int numero;
	private LocalDate dateSouscription; 
	private int duree;


	public Abonnement(int numero, LocalDate dateSouscription, int duree) {
		super();
		this.numero = numero;
		this.dateSouscription = dateSouscription;
		this.duree = duree;
	}

	
	@Override
	public String toString() {
		return "Abonnement [numero=" + numero + ", dateSouscription=" + dateSouscription + ", duree=" + duree + "]";
	}


	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public LocalDate getdateSouscription() {
		return dateSouscription;
	}
	
	public void setdateSouscription(LocalDate dateSouscription) {
		this.dateSouscription = dateSouscription;
	}
	
	public int getDuree() {
		return duree;
	}
	
	public void setDuree(int duree) {
		this.duree = duree;
	
	}
	
	public int ModifieDuree(int duree) {
		duree = duree++;
		return duree;
	}
	
}

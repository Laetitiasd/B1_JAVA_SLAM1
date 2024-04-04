package fr.voxi.admin;

import java.time.LocalDate;

public class AppAdmin {

	public static void main(String[] args) {
		
		// Tous les affichages doivent faire apparaître le numéro de la question
		
		
		// 1- Créer puis afficher la candidature référencée par la variable cdt1
		//		Caractéristiques de la candidature :
		//			Numéro : 1
		//			État : En attente
		//			Dépôt : 11/01/2024
		
		System.out.println( "\n\n-----[Question 1]-----\n\n" ) ;
		
		/* Votre code pour la question 1 ici */

		Candidature cdt1 = new Candidature(1, LocalDate.of(2024, 01, 11), "1");
		
		System.out.println("Numéro : "+cdt1.getNumero());
		cdt1.EtatCandit(cdt1.getEtat()); 
		System.out.println("Dépôt : " + cdt1.getDateDepot());
	     
	    
	    
		// 2- Tenter d'étudier la candidature 1
		//		Si l'opération s'est déroulée avec succés, afficher "2- Candidature en cours d'étude"
		//		Sinon afficher "2- La candidature ne peut pas être étudiée"
		// 3- ... puis afficher la candicature
		
		System.out.println( "\n\n-----[Question 2 et 3]-----\n\n" ) ;
		
		/* Votre code pour les questions 2 et 3 ici */
		
		
		System.out.println("État de la candidature : " + cdt1.getEtat());
		
		
		
		// 4- Afficher l'état de la candidature
		//		Si la candidature est en attente afficher "4- Candidature en attente."
		//		Si la candidature est en cours d'étude "4- Candidature en cours d'étude."
		//		Si la candidature est annulée "4- Candidature annulée."
		//		Si ...
		
		/* Votre code pour la question 4 ici */
		
		
		
		
		
		// 5- Accepter puis afficher la candidature
		
		/* Votre code pour la question 5 ici */
		
		
		
		
		
		// 6- Afficher l'état de la candidature 
		//		(voir question 4)
		//		...

		/* Votre code pour la question 6 ici */
		
		
		
						
		
		// 7- Tenter d'annuler la candidature
		//		Si l'opération d'annulation est réalisée avec succès, afficher "7- Candidature annulée."
		//		Sinon afficher "7- Annulation refusée."
		// 8- ... puis afficher la candidature
		
		/* Votre code pour les questions 7 et 8 ici */
		
		
		
		
		
		// 9- Tenter de rejeter la candidature
		//		Si l'opération est réalisée avec succès, afficher "9- Candidature rejetée."
		//		Sinon afficher "9- Opération refusée."
		// 10- ... puis afficher la candidature
		
		/* Votre code pour les questions 9 et 10 ici */
		
					
	
	
	
		// 11- Tenter d'accepter la candidature
		//		Si l'opération est réalisée avec succès, afficher "11- Candidature acceptée."
		//		Sinon afficher "12- Opération refusée."
		// 12- ... puis afficher la candidature
		
		/* Votre code pour les questions 11 et 12 ici */
	

	}

}
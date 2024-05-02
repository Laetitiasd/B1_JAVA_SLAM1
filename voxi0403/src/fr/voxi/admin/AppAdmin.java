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
	     
		Candidature cdt1 = new Candidature(1, LocalDate.of(2024, 01, 11), "En Attente");
        
        System.out.println("Numéro : " + cdt1.getNumero());
        System.out.println("État: " + cdt1.getEtat());
        System.out.println("Dépôt : " + cdt1.getDateDepot());
        
	    
		// 2- Tenter d'étudier la candidature 1
		//		Si l'opération s'est déroulée avec succés, afficher "2- Candidature en cours d'étude"
		//		Sinon afficher "2- La candidature ne peut pas être étudiée"
		// 3- ... puis afficher la candicature
		
		System.out.println( "\n\n-----[Question 2 et 3]-----\n\n" ) ;
		
		/* Votre code pour les questions 2 et 3 ici */
		

		if (cdt1.getEtat().equals("En Attente")) {
			cdt1.setEtat("Étudiée");
            System.out.println("2- Candidature en cours d'étude");
        } else {
            System.out.println("2- La candidature ne peut pas être étudiée");
        }
    
        System.out.println("État de la candidature : " + cdt1.getEtat());
        
		
		// 4- Afficher l'état de la candidature
		//		Si la candidature est en attente afficher "4- Candidature en attente."
		//		Si la candidature est en cours d'étude "4- Candidature en cours d'étude."
		//		Si la candidature est annulée "4- Candidature annulée."
		//		Si ...
		
		System.out.println( "\n\n-----[Question 4]-----\n\n" ) ;
		
		/* Votre code pour la question 4 ici */
		
		switch (cdt1.getEtat()) {
        case "En Attente":
            System.out.println("4- Candidature en attente.");
            break;
        case "Étudiée":
            System.out.println("4- Candidature en cours d'étude.");
            break;
        case "Annulée":
            System.out.println("4- Candidature annulée.");
            break;
        case "Acceptée":
            System.out.println("4- Candidature acceptée.");
            break;
        case "Rejetée":
            System.out.println("4- Candidature rejetée.");
            break;
        default:
            System.out.println("4- État de la candidature non reconnu.");
            break;
				
		}	
		
		// 5- Accepter puis afficher la candidature
		
         System.out.println( "\n\n-----[Question 5]-----\n\n" ) ;
            
		/* Votre code pour la question 5 ici */ 
		
            cdt1.setEtat("Acceptée");
            System.out.println("5- Candidature acceptée.");
            System.out.println(cdt1.toString()); 
		
		// 6- Afficher l'état de la candidature 
		//		(voir question 4)
		//		...

            System.out.println( "\n\n-----[Question 6]-----\n\n" ) ;
		/* Votre code pour la question 6 ici */
		
		
            switch (cdt1.getEtat()) {
            case "En Attente":
                System.out.println("4- Candidature en attente.");
                break;
            case "Étudiée":
                System.out.println("4- Candidature en cours d'étude.");
                break;
            case "Annulée":
                System.out.println("4- Candidature annulée.");
                break;
            case "Acceptée":
                System.out.println("4- Candidature acceptée.");
                break;
            case "Rejetée":
                System.out.println("4- Candidature rejetée.");
                break;
            default:
                System.out.println("4- État de la candidature non reconnu.");
                break;
    				
    		}	
						
		
		// 7- Tenter d'annuler la candidature
		//		Si l'opération d'annulation est réalisée avec succès, afficher "7- Candidature annulée."
		//		Sinon afficher "7- Annulation refusée."
		// 8- ... puis afficher la candidature
		
            System.out.println( "\n\n-----[Question 7 et 8 ]-----\n\n" ) ;
            
		/* Votre code pour les questions 7 et 8 ici */
		
            cdt1.setEtat("En Attente");
		if(cdt1.getEtat().equals("En Attente")) {
			cdt1.setEtat("Annulée");
			System.out.println("7- Candidature annulée");
		} else {
			System.out.println("7- Annulation refusée");
		}
		System.out.println("8- Etat" + " : " + cdt1.getEtat());
		
		
		
		// 9- Tenter de rejeter la candidature
		//		Si l'opération est réalisée avec succès, afficher "9- Candidature rejetée."
		//		Sinon afficher "9- Opération refusée."
		// 10- ... puis afficher la candidature
		
		System.out.println( "\n\n-----[Question 9 et 10]-----\n\n" ) ;
		
		/* Votre code pour les questions 9 et 10 ici */
		
		cdt1.setEtat("Étudiée");
		if(cdt1.getEtat().equals("Étudiée")) {
			cdt1.setEtat("Rejetée");
			System.out.println("7- Candidature rejetée");
		} else {
			System.out.println("7- Opération refusée");
		}
		System.out.println("8- Etat" + " : " + cdt1.getEtat());		
	
	
	
		// 11- Tenter d'accepter la candidature
		//		Si l'opération est réalisée avec succès, afficher "11- Candidature acceptée."
		//		Sinon afficher "12- Opération refusée."
		// 12- ... puis afficher la candidature
		
		System.out.println( "\n\n-----[Question 11 et 12]-----\n\n" ) ;
		
		/* Votre code pour les questions 11 et 12 ici */
	
		cdt1.setEtat("Étudiée");
		if(cdt1.getEtat().equals("Étudiée")) {
			cdt1.setEtat("Acceptée");
			System.out.println("7- Candidature Acceptée");
		} else {
			System.out.println("7- Opération refusée");
		}
		System.out.println("8- Etat" + " : " + cdt1.getEtat());		
	
	

		}
}
	


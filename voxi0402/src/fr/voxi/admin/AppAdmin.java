package fr.voxi.admin;
import java.time.LocalDate;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Abonnement abn1 = new Abonnement(201,  LocalDate.of(2024,01,03), 3);
		Abonnement abn2 = new Abonnement(202, LocalDate.of(2024,01,10), 3);
		
		System.out.println(abn1.toString());
		System.out.println(abn2.toString());
		
		System.out.println(abn1.getDuree());
		System.out.println(abn2.getDuree());
		
		abn1.setDuree(5);
		abn2.setDuree(5);
		
		System.out.println(abn1.getDuree());
		System.out.println(abn2.getDuree());
		
		abn1.setDuree(7);
		
		System.out.println("A dater de ce jour, la durée est de " + abn1.getDuree() + " mois pour le numéro " + " " + abn1.getNumero());
		
		System.out.println("Durée de l'abonnement numéro"+ " " + abn1.getNumero() + 
				" : "+abn1.getDuree() + " et pour le numéro " + abn2.getNumero() + " : " + abn2.getDuree());
		System.out.println(abn1.getdateSouscription());
	}

}

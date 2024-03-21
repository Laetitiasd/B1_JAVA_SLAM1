package voix0301;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lecteur lecteur1 = new Lecteur(101,"SANTERRE","Jean",20 ) ;
		System.out.println("Nom du lecteur numéro" + " " + lecteur1.getNumero() + " : " + lecteur1.getNom() );                    ;
		
		Lecteur lecteur2 = new Lecteur(102,"NONATO","Isabella",0 ) ;
		System.out.println("Nom du lecteur numéro" + " " + lecteur2.getNumero() + " : " + lecteur2.getNom());
		
		lecteur2.setNom("SANTERRE")  ;
		System.out.println("Nom du lecteur numéro" + " " + lecteur2.getNumero() + " : " + lecteur2.getNom());
		
		if (lecteur1.estActif()) {
			System.out.println("Le numéro" + " " + lecteur1.getNumero() + " " + lecteur1.getNom() + " " + "est actif");
		  } else {
				System.out.println("Le numéro" + " " + lecteur1.getNumero() + " " + lecteur1.getNom() + " " + "est passif");
		}
		
			if (lecteur2.estActif()) {
				System.out.println("Le numéro" + " " + lecteur2.getNumero() + " " + lecteur2.getNom() + " " + "est actif");
		  } else {
				System.out.println("Le numéro" + " " + lecteur2.getNumero() + " " + lecteur2.getNom() + " " + "est passif");
		  }
		
			System.out.println(lecteur1.produireUnAudioBook(1));
	}
	
	
}



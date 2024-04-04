package voxi0401;

public class AppAdmin {

	public static void main(String[] args) {
		

				Oeuvre oeuvre103 = new Oeuvre(103, "Le Crépuscule et l'Aube", 1);
				Oeuvre oeuvre302 = new Oeuvre(302, "Nature Humaine", 1);
				Oeuvre oeuvre318 = new Oeuvre(318, "L'Anomalie", 1);
				
					System.out.println("l'oeuvre numéro : " + oeuvre103.getNumero() + "," + oeuvre103.getCompteur() + "," + oeuvre103.getTitre());
					System.out.println(oeuvre103.getCompteur());

					System.out.println("l'oeuvre numéro : " + oeuvre302.getNumero() + " , " + oeuvre302.getCompteur() + " , " + oeuvre302.getTitre());
					System.out.println("l'oeuvre numéro : " + oeuvre318.getNumero() + " , " + oeuvre318.getCompteur() + " , " + oeuvre318.getTitre());
					
				
		
	}

}

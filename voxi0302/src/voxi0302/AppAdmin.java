package voxi0302;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Evaluation eval1 = new Evaluation(1, 5, "Excellent !!!", 23, "Évaluation validé");
		
		System.out.println("Le numéro" + " " + eval1.getNumero() + " a une note de " + eval1.getNote()  + " , " +
		"Commentaire : " + "" + eval1.getCommentaire() + " , " +" Nombre de J aime : " + eval1.getNbDeJaime() + " , " 
		+ eval1.getValider() ) ;
		
		System.out.println("Nombre de Jaime de l'évaluation " + "" + eval1.getNumero() + " : " + eval1.AimerEnPlus(1));
		
		Evaluation eval2 = eval1;
		
			System.out.println("Évaluation n ° : " + eval2.getNumero() + " , " + eval2.getNote() + " , " + eval2.getCommentaire() + " , " + eval2.getNbDeJaime() + 
				" , " + eval2.getValider());
		
			System.out.println("Évaluation n ° : " + eval1.getNumero() + " , " + eval1.getNote() + " , " + eval1.getCommentaire() + " , " + eval1.getNbDeJaime() + 
				" , " + eval1.getValider());
		
		System.out.println("Nombre de Jaime de l'évaluation " + "" + eval2.getNumero() + " : " + eval2.AimerEnPlus(1));
		

			System.out.println("Évaluation n ° : " + eval2.getNumero() + " , " + eval2.getNote() + " , " + eval2.getCommentaire() + " , " + eval2.getNbDeJaime() + 
				" , " + eval2.getValider());
		
			System.out.println("Évaluation n ° : " + eval1.getNumero() + " , " + eval1.getNote() + " , " + eval1.getCommentaire() + " , " + eval1.getNbDeJaime() + 
				" , " + eval1.getValider());
		
		System.out.println("Réf. Éval. n° 1 : " + eval1.hashCode());
		System.out.println("Réf. Éval. n° 2 : " + eval2.hashCode());
			
			
			
	}

}

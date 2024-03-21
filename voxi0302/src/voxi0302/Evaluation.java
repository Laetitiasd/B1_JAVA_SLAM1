package voxi0302;

public class Evaluation {

	private int Numero;
	private int Note;
	private String Commentaire;
	private int NbDeJaime ; 
	private String Valider ;
	
	public Evaluation(int Numero, int Note, String Commentaire, int NbDeJaime, String Valider){
		super();
		this.Numero = Numero;
		this.Note = Note;
		this.Commentaire = Commentaire;
		this.NbDeJaime = NbDeJaime;
		this.Valider = Valider;
	}


    public Evaluation(int Numero, int Note, String Commentaire, String Valider) {
        this(Numero, Note, Commentaire, 0, Valider);
    }  
	
    @Override
    public String toString() {
        return "Evaluation [Numero=" + Numero + ", Note=" + Note + ", Commentaire=" + Commentaire + ", NbDeJaime=" + NbDeJaime + ", Valider=" + Valider + "]";	
	}
	
	public int getNumero() {
		return Numero;
	}
	
	public void setNumero(int Numero) {
		this.Numero = Numero;
	}
	
	public int getNote() {
		return Note;
	}
	
	public void setNote(int Note) {
		this.Note = Note;
	}
	
	public String getCommentaire() {
		return Commentaire;
	}
	
	public void setCommentaire(String Commentaire) {
		this.Commentaire = Commentaire;
	}
	
	public int getNbDeJaime() {
		return NbDeJaime;
		
	}
	
	public void setNbDeJaime(int NbDeJaime) {
		this.NbDeJaime = NbDeJaime;
	}
	
	public String getValider() {
		return Valider;
	}
	
	public void setValider(String Valider) {
		this.Valider = Valider;
	}
	
	public int AimerEnPlus(int NbJaime) {
		NbDeJaime = NbDeJaime + NbJaime;
		return NbDeJaime;
	}
	
}
	
	

	   
	    
	    
	    
	    


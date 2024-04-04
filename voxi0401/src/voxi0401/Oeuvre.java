package voxi0401;

public class Oeuvre {

    private int numero;
    private String titre;
    private int compteur;

    public Oeuvre(int numero, String titre, int compteur) {
        super();
        this.numero = numero;
        this.titre = titre;
        this.compteur = compteur;
    }

	@Override
	public String toString() {
		return "Oeuvre [numero=" + numero + ", titre=" + titre + ", compteur=" + compteur + "]";
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
    
    public int getCompteur() {
    	return compteur;
    }
    
    public void setCompteur(int compteur) {
    	this.compteur = compteur;
    }

	public int creationOeuvreCompteur(int compteur) {
		compteur = compteur ++;
		return compteur;
	}
}


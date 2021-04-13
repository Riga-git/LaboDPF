package fruits;

public abstract class Produit {

    protected String nom;
    protected Boolean pepin;

    public void setPepin(Boolean pepin){
        this.pepin = pepin;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public abstract void afficherFruit();
    public abstract String getNom();
    public abstract Boolean getPepin();
}

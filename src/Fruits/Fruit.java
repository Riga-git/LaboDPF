package Fruits;

/**
 * Fruit
 */
public class Fruit {

    private String nom;
    private Boolean pepin;

    public Fruit(String nom, Boolean pepin){
        this.nom = nom;
        this.pepin = pepin;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void setPepin(Boolean pepin){
        this.pepin = pepin;
    }

    public Boolean getPepin(){
        return this.pepin;
    }

    public void afficherFruit(){
        System.out.println("Je suis un/une " + getNom() + (getPepin() ? " et j'ai des pepins" : " et je n'ai pas de pepins"));
    }
}
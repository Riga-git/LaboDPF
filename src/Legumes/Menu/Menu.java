package Legumes.Menu;
import Legumes.Legume;

public class Menu {
    private Legume legumes;
    private String nom;
    
    public Menu(String nom, Legume legume){
        this.legumes = legume;
        this.nom = nom;
    }

    public void description(){
        System.out.println("Nom : " + nom + ", avec des legumes pour " + this.legumes.getType());
    }
}

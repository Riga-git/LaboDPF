package fruits;

import java.util.ArrayList;

public class Panier extends Produit {

    private String nom = new String();
    private ArrayList<Produit> listeFruits = new ArrayList<Produit>();

    public Panier(String nom){
        this.nom = nom;
    }

    public void ajouterFruit(Produit fruit){
        listeFruits.add(fruit);
    }

    public void supprimetFruit(Produit fruit){
        listeFruits.remove(fruit);
    }

    public String getNom(){
        return this.nom;
    }

    public void afficherFruit(){
        System.out.print(getNom() + "( ");
        for (Produit fruit : listeFruits)
            System.out.print(fruit.getNom() + " ");
        System.out.print(" )\n");
    }
}

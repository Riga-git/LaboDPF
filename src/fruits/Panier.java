package fruits;

import java.util.ArrayList;

public class Panier extends Produit {

    private String nom = new String();
    public Panier(String nom){
        this.nom = nom;
    }

    private ArrayList<Fruit> listeFruits = new ArrayList<Fruit>();

    public void ajouterFruit(Fruit fruit){
        listeFruits.add(fruit);
    }

    public void supprimetFruit(Fruit fruit){
        listeFruits.remove(fruit);
    }

    public String getNom(){
        return this.nom;
    }

    public void afficherFruit(){
        System.out.print(getNom() + "( ");
        for (Fruit fruit : listeFruits)
            System.out.print(fruit.getNom() + " ");
        System.out.print(" )\n");
    }
}

package fruits;

import java.util.ArrayList;

public class Panier implements Produit {

    private String nom = new String();
    private ArrayList<Fruit> listeFruits = new ArrayList<Fruit>();

    public Panier(String nom){
        this.nom = nom;
    }

    public void ajouterFruit(Fruit fruit){
        listeFruits.add(fruit);
    }

    public void supprimetFruit(Produit fruit){
        listeFruits.remove(fruit);
    }

    public String getNom(){
        return this.nom;
    }

    public void afficherFruit(){
        Boolean avecPepins = false;
        System.out.print(getNom() + "( ");
        for (Fruit fruit : listeFruits){
            System.out.print(fruit.getNom() + " ");
            avecPepins ^= fruit.getPepin();
        }
        if (avecPepins){
            System.out.print(") - avec pepins\n");
        }else{
            System.out.print(") - sans pepins\n");
        }
    }

    public void afficherCalories(){};
}

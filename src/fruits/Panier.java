package fruits;

import java.util.ArrayList;

public class Panier extends Produit {

    private ArrayList<Produit> listeProduits = new ArrayList<Produit>();

    public Panier(String nom){
        setNom(nom);
    }

    public void ajouterFruit(Produit produit){
        listeProduits.add(produit);
    }

    public void supprimetFruit(Produit fruit){
        listeProduits.remove(fruit);
    }

    public String getNom(){
        String nom =  super.nom + "(";
        for (Produit produit : listeProduits){
           nom += (produit.getNom() + " ");
        } 
        nom += ")";
        return nom;
    }

    public Boolean getPepin(){
        Boolean avecPepins = false;
        for (Produit produit : listeProduits){
            avecPepins ^= produit.getPepin();
        }
        return avecPepins;
    }

    public void afficherFruit(){
        System.out.print(getNom());
        if (getPepin()){
            System.out.println("-Avec pepins");
        }else{
            System.out.println("-Sans pepins");
        }
    }

    public void afficherCalories(){};
}

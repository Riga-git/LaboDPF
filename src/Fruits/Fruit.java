package fruits;

import calorie.FruitCalorie;

/**
 * Fruit
 */
public class Fruit extends Produit{
    private FruitCalorie fruitCalorieType = null;
    
    // Constucteurs 
    public Fruit(String nom, Boolean pepin){
        setNom(nom);
        setPepin(pepin);
    }

    public Fruit(String nom, Boolean pepin, FruitCalorie fruitCalorie ){
        setNom(nom);
        setPepin(pepin);
        this.fruitCalorieType = fruitCalorie;
    }

    // Getter & Setter 
    public String getNom(){
        return super.nom;
    }

    public Boolean getPepin(){
        return super.pepin;
    }

    public void setFruitCalorieType(FruitCalorie fruitCalorie){
        this.fruitCalorieType = fruitCalorie;
    }

    // methods
    public void afficherFruit(){
        System.out.println("Je suis un/une " + getNom() + (getPepin() ? " et j'ai des pepins" : " et je n'ai pas de pepins"));
    }

    public void afficherCalories(){
        if (this.fruitCalorieType == null){
            System.out.println("Calories inconnues");  
        }
        else{
            System.out.println("Ce fruit à " + this.fruitCalorieType.calculerCalories(this.nom) + " calories");  
        }
    }
}
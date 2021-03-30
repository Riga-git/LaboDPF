package fruits;

import calorie.FruitCalorie;

/**
 * Fruit
 */
public class Fruit {

    private String nom;
    private Boolean pepin;
    private FruitCalorie fruitCalorieType = null;
    
    // Constucteurs 
    public Fruit(String nom, Boolean pepin){
        this.nom = nom;
        this.pepin = pepin;
    }

    public Fruit(String nom, Boolean pepin, FruitCalorie fruitCalorie ){
        this.nom = nom;
        this.pepin = pepin;
        this.fruitCalorieType = fruitCalorie;
    }

    // Getter & Setter 
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
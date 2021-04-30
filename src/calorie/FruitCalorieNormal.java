package calorie;

import calorie.api.Calorie;

/**
 * FruitCalorieNormal
 */
public class FruitCalorieNormal  extends FruitCalorie{

    Calorie calculateur;

    public FruitCalorieNormal(Calorie calculateur){
        this.calculateur = calculateur;
    }

    @Override
    public double calculerCalories(String nom) {
        return this.calculateur.calculCalorie(nom);
    }
}
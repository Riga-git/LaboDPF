package calorie;

import calorie.api.Calorie;

/**
 * FruitCaloriePauvre
 */
public class FruitCaloriePauvre  extends FruitCalorie{

    Calorie calculateur;

    public FruitCaloriePauvre(Calorie calculateur){
        this.calculateur = calculateur;
    }

    @Override
    public double calculerCalories(String nom) {
        return this.calculateur.calculCalorie(nom);
    }
}
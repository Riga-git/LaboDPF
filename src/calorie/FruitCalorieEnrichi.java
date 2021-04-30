package calorie;

import calorie.api.Calorie;

/**
 * FruitCalorieEnrichi
 */
public class FruitCalorieEnrichi extends FruitCalorie{

    Calorie calculateur;

    public FruitCalorieEnrichi(Calorie calculateur){
        this.calculateur = calculateur;
    }

    @Override
    public double calculerCalories(String nom) {
        return this.calculateur.calculCalorie(nom);
    }
}
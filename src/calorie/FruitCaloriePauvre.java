package calorie;

import calorie.api.CaloriesPauvre;

/**
 * FruitCaloriePauvre
 */
public class FruitCaloriePauvre  extends FruitCalorie{

    @Override
    public float calculerCalories(String nom) {
        return CaloriesPauvre.calculCalorie(nom);
    }
    
}
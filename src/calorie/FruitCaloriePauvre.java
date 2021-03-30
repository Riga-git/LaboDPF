package calorie;

import calorie.api.CaloriesPauvre;

/**
 * FruitCaloriePauvre
 */
public class FruitCaloriePauvre  extends FruitCalorie{

    @Override
    public int calculerCalories(String nom) {
        return CaloriesPauvre.calculCalorie(nom);
    }
    
}
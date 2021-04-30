package calorie;

import calorie.api.CaloriesEnrichi;

/**
 * FruitCalorieEnrichi
 */
public class FruitCalorieEnrichi extends FruitCalorie{

    @Override
    public float calculerCalories(String nom) {
        return CaloriesEnrichi.calculCalorie(nom);
    }
    
}
package calorie;

import calorie.api.CaloriesNormal;

/**
 * FruitCalorieNormal
 */
public class FruitCalorieNormal  extends FruitCalorie{

    @Override
    public float calculerCalories(String nom) {
        return CaloriesNormal.calculCalorie(nom);
    }
    
}
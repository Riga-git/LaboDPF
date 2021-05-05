package calorie;

import calorie.api.CaloriesSuper;

/**
 * FruitCaloriePauvre
 */
public class FruitCalorieSuper extends FruitCalorie{

    @Override
    public int calculerCalories(String nom) {
        return CaloriesSuper.calculCalorie(nom);
    }
    
}
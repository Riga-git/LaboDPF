package calorie.api;

import util.Util;

public class CaloriesPauvre extends Calorie{
	
	public static float calculCalorie(String nom) {
		return Util.calculCalorie(nom) * calorieRatio;
	}

}

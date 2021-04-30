package calorie.api;

import util.Util;

public class CaloriesPauvre extends Calorie{
	
	public double calculCalorie(String nom) {
		return Util.calculCalorie(nom) * calorieRatio;
	}

}

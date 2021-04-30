package calorie.api;

import util.Util;

public class CaloriesNormal extends Calorie{

	public double calculCalorie(String nom) {
		return Util.calculCalorie(nom) * 10 * calorieRatio;
	}

}

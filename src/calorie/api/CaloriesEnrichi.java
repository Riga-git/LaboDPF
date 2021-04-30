package calorie.api;
import util.Util;

public class CaloriesEnrichi extends Calorie{

	public static float calculCalorie(String nom) {
		return Util.calculCalorie(nom) * 100 * calorieRatio;
	}

}

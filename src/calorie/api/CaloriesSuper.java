package calorie.api;

import util.Util;

public class CaloriesSuper {

	public static int calculCalorie(String nom) {
		return Util.calculCalorie(nom) * 1000;
	}

}

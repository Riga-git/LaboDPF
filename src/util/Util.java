package util;
import calorie.Subjects.Subject;

public class Util extends Subject {
	public static double calculCalorie(String value) {
		if(value != null && value.length() > 0) {
			char[] charArray = value.toCharArray();
			int calorie = 0;
			for (char c : charArray) {
				calorie = calorie + (int)c;
			}
			return calorie;
		}
		return 1;
	}
}

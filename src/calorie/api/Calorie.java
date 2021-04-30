package calorie.api;

import calorie.Subjects.Subject;

public class Calorie extends Subject{
    protected static Float calorieRatio;

    public Calorie(){
        calorieRatio = (float) 1.0;
    } 

    public void updateCalorieRatio(Float ratio){
        Calorie.calorieRatio = ratio;
        NotifierObserveurs();
    }
    
}

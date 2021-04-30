package calorie.api;

import calorie.Subjects.Subject;

public abstract class Calorie extends Subject{
    protected Double calorieRatio;

    public Calorie(){
        calorieRatio = 1.0;
    } 

    public abstract double calculCalorie(String nom);

    public void updateCalorieRatio(double ratio){
        this.calorieRatio = ratio;
        NotifierObserveurs();
    }
    
}

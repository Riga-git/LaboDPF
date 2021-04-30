package calorie.Subjects;
import java.util.HashSet;
import calorie.observer.Observer;

public class Subject {
    private HashSet<Observer> observers = new HashSet<Observer>();

    public void registerObserveurs(Observer observer){
        observers.add(observer);		
     }

    public void unregisterObserveurs(Observer observer){
        observers.remove(observer);		
     }
  
     public void NotifierObserveurs(){
        for (Observer observer : observers) {
           observer.notification();
        }
     } 	
}

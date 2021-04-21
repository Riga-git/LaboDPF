package Legumes;

public class LegumeFactory {
    
    public Legume getLegume(String type){
        if (type.equals("Salade"))
            return new Salade();
        else if (type.equals("Potages"))
            return new Potages();
        else if (type.equals("Vapeur"))
            return new Vapeur();
        else if (type.equals("Cuisson"))
            return new Cuisson();
        else
            return null;
    }

}

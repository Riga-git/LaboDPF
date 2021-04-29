package Menu;
import Factories.AbstractFactory;

public class Menu {
    private AbstractFactory factory;
    private String nom;
    
    public Menu(String nom, AbstractFactory factory){
        this.factory = factory;
        this.nom = nom;
    }

    public void description(){
        System.out.println("Nom : " + nom + factory.getMenu());
    }
}

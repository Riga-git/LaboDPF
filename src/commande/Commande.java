package commande;
import fruits.ComposantFruit;

public class Commande {
    private static Commande instance = null;
    private static final int maxFruits = 5;
    private int currentIndex = 0;
    private ComposantFruit[] fruits = new ComposantFruit[maxFruits];

    private Commande(){
        super();
    }

    public final synchronized static Commande getInstance() {
        if (Commande.instance == null){ 
            Commande.instance = new Commande(); 
        }
        return Commande.instance;
    }

    public void ajouterFruit(ComposantFruit newFruit){
        if (currentIndex < maxFruits){
            fruits[currentIndex] = newFruit;
            currentIndex++;
        }else{
            System.out.println("impossible ajouter le fruit " + newFruit.getNom() + " car la liste est pleine!");
        }
    }

    public void AfficherCommande(){
        System.out.println("------------------ Ma liste -------------------");
        for (ComposantFruit fruit : fruits) {
            if (fruit != null){
                fruit.afficherFruit();
                fruit.afficherCalories();
                System.out.println("----------------------------------------------");
            }
        }
    }
}

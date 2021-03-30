package commande;
import fruits.Fruit;

public class Commande {
    private static Commande instance = null;
    private static final int maxFruits = 5;
    private int currentIndex = 0;
    private Fruit[] fruits = new Fruit[maxFruits];

    private Commande(){
        super();
    }

    public final synchronized static Commande getInstance() {
        if (Commande.instance == null){ 
            Commande.instance = new Commande(); 
        }
        return Commande.instance;
    }

    public void ajouterFruit(Fruit newFruit){
        if (currentIndex < maxFruits){
            fruits[currentIndex] = newFruit;
            currentIndex++;
        }else{
            System.out.println("impossible ajouter le fruit " + newFruit.getNom() + " car la liste est pleine!");
        }
    }

    public void AfficherCommande(){
        System.out.println("------------------ Ma liste -------------------");
        for (Fruit fruit : fruits) {
            fruit.afficherFruit();
            fruit.afficherCalories();
            System.out.println("----------------------------------------------");
        }
    }
}

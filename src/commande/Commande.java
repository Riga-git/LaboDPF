package commande;
import fruits.Fruit;
import fruits.Produit;

public class Commande {
    private static Commande instance = null;
    private static final int maxFruits = 5;
    private int currentIndex = 0;
    private Produit[] fruits = new Produit[maxFruits];

    private Commande(){
        super();
    }

    public final synchronized static Commande getInstance() {
        if (Commande.instance == null){ 
            Commande.instance = new Commande(); 
        }
        return Commande.instance;
    }

    public void ajouterFruit(Produit newFruit){
        if (currentIndex < maxFruits){
            fruits[currentIndex] = newFruit;
            currentIndex++;
        }else{
            System.out.println("impossible ajouter le produit car la liste est pleine!");
        }
    }

    public void AfficherCommande(){
        System.out.println("------------------ Ma commande -------------------");
        for (Produit fruit : fruits) {
            if (fruit != null){
                fruit.afficherFruit();
                if (fruit instanceof Fruit)
                    ((Fruit) fruit).afficherCalories();
                System.out.println("----------------------------------------------");
            }
        }
    }
}

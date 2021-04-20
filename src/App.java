import calorie.*;
import commande.Commande;
import decoration.Egal;
import decoration.Etoile;
import fruits.Fruit;
import fruits.Panier;

public class App {
    public static void main(String[] args) throws Exception {

        FruitCalorie fruitCalorieEnrichi = new FruitCalorieEnrichi();
        FruitCalorie fruitCaloriePauvre = new FruitCaloriePauvre();

        Fruit orange = new Fruit("Orange", true);
        Fruit avocat = new Fruit("Avocat", false, fruitCalorieEnrichi);
        Fruit pomme = new Fruit("Pomme", true, fruitCaloriePauvre);
        Fruit banane = new Fruit("Banane", false, fruitCalorieEnrichi);
        Panier panier1 = new Panier("Panier 1");
        Panier panier2 = new Panier("Panier 2");

        //commande
        Commande commande = Commande.getInstance();
        commande.ajouterFruit(banane);
        commande.ajouterFruit(pomme);
        commande.ajouterFruit(new Etoile(orange));
        commande.AfficherCommande();

        // panier 1
        panier1.ajouterFruit(new Fruit("Super_Orange", true));
        panier1.ajouterFruit(new Fruit("Super_Banane", false));
        panier1.ajouterFruit(new Fruit("Super_Pomme", false));

        // panier 2
        panier2.ajouterFruit(avocat);
        panier2.ajouterFruit(new Fruit("Magnifique_Banane", false));
        panier2.ajouterFruit(new Fruit("Magnifique_Pomme", false));
        panier2.ajouterFruit(panier1);

        commande.ajouterFruit(new Egal(panier1));
        commande.ajouterFruit(panier2);
        commande.AfficherCommande();
    }
}

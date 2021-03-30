import calorie.*;
import commande.Commande;
import fruits.Fruit;

public class App {
    public static void main(String[] args) throws Exception {

        FruitCalorie fruitCalorieEnrichi = new FruitCalorieEnrichi();
        FruitCalorie fruitCaloriePauvre = new FruitCaloriePauvre();

        Fruit orange = new Fruit("Orange", true);
        Fruit avocat = new Fruit("Avocat", false, fruitCalorieEnrichi);
        Fruit pomme = new Fruit("Pomme", true, fruitCaloriePauvre);
        Fruit banane = new Fruit("Banane", false, fruitCalorieEnrichi);

        //commande
        Commande commande = Commande.getInstance();
        commande.ajouterFruit(banane);
        commande.ajouterFruit(pomme);
        commande.ajouterFruit(orange);
        commande.ajouterFruit(avocat);
        commande.ajouterFruit(pomme);
        commande.ajouterFruit(banane); // 6éme -> ingnoré

        commande.AfficherCommande();
    }
}

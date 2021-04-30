import calorie.*;
import calorie.api.CaloriesEnrichi;
import calorie.api.CaloriesNormal;
import calorie.api.CaloriesPauvre;
import commande.Commande;
import fruits.Fruit;

public class App {
    public static void main(String[] args) throws Exception {

        CaloriesNormal caloriesNormal = new CaloriesNormal();
        CaloriesEnrichi caloriesEnrichi = new CaloriesEnrichi();
        CaloriesPauvre caloriesPauvre = new CaloriesPauvre();

        FruitCalorie fruitCalorieNormal = new FruitCalorieNormal(caloriesNormal);
        FruitCalorie fruitCalorieEnrichi = new FruitCalorieEnrichi(caloriesEnrichi);
        FruitCalorie fruitCaloriePauvre = new FruitCaloriePauvre(caloriesPauvre);

        Fruit orange = new Fruit("Orange", true, fruitCalorieNormal);
        Fruit pomme = new Fruit("Pomme", true, fruitCaloriePauvre);
        Fruit avocat = new Fruit("Avocat", false, fruitCalorieEnrichi);
        Fruit banane = new Fruit("Banane", false, fruitCalorieEnrichi);

        // abbonner au sujet
        caloriesNormal.registerObserveurs(orange);
        caloriesPauvre.registerObserveurs(pomme);
        caloriesEnrichi.registerObserveurs(avocat);

        //commande
        Commande commande = Commande.getInstance();
        commande.ajouterFruit(banane);
        commande.ajouterFruit(pomme);
        commande.ajouterFruit(orange);
        commande.ajouterFruit(avocat);
        commande.ajouterFruit(pomme);
        commande.ajouterFruit(banane); // 6éme -> ingnoré

        commande.AfficherCommande();

        caloriesPauvre.updateCalorieRatio(10.0);
        caloriesNormal.updateCalorieRatio(100.0);
        caloriesEnrichi.updateCalorieRatio(1000.0);
        // banane pas notifié car non abbonnée
    }
}

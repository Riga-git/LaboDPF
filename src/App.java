import calorie.*;
import fruits.Fruit;

public class App {
    public static void main(String[] args) throws Exception {

        FruitCalorie fruitCalorieEnrichi = new FruitCalorieEnrichi();
        FruitCalorie fruitCalorieNormal = new FruitCalorieNormal();
        FruitCalorie fruitCaloriePauvre = new FruitCaloriePauvre();

        Fruit orange = new Fruit("Orange", true);
        Fruit avocat = new Fruit("Avocat", false, fruitCalorieEnrichi);
        Fruit pomme = new Fruit("Pomme", true, fruitCaloriePauvre);
        Fruit banane = new Fruit("Banane", false, fruitCalorieEnrichi);

        // calories non specifiées dans le constructeur
        orange.afficherFruit();
        orange.afficherCalories();

        avocat.afficherFruit();
        avocat.afficherCalories();

        pomme.afficherFruit();
        pomme.afficherCalories();

        banane.afficherFruit();
        banane.afficherCalories();

        // calories (Normales) specifiées via le setteur "setFruitCalorie"
        orange.setFruitCalorieType(fruitCalorieNormal);
        orange.afficherCalories();

        // calories (Pauvres) specifiées via le setteur "setFruitCalorie"
        orange.setFruitCalorieType(fruitCaloriePauvre);
        orange.afficherCalories();
    }
}

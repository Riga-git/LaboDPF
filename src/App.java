import fruits.Fruit;

public class App {
    public static void main(String[] args) throws Exception {
        Fruit orange = new Fruit("Orange", true);
        Fruit banane = new Fruit("Banane", false);

        orange.afficherFruit();
        banane.afficherFruit();
        
        orange.setNom("Orange sanguine");
        orange.afficherFruit();

        orange.setNom("banane speciale");
        orange.setPepin(true);
        orange.afficherFruit();
    }
}

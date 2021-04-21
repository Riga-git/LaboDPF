import Legumes.LegumeFactory;
import Legumes.Menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        LegumeFactory factory = new LegumeFactory();
        Menu menu1 = new Menu("Menu vapeur", factory.getLegume("Vapeur"));
        Menu menu2 = new Menu("Menu cuisson", factory.getLegume("Cuisson"));

        menu1.description();
        menu2.description();
    }
}

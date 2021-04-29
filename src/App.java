import Factories.CuissonFactory;
import Factories.VapeurFactory;
import Menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu1 = new Menu("Menu vapeur", new VapeurFactory());
        Menu menu2 = new Menu("Menu cuisson", new CuissonFactory());

        menu1.description();
        menu2.description();
    }
}

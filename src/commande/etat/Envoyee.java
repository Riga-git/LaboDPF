package commande.etat;
import commande.*;

public class Envoyee implements EtatCommande{

    public Envoyee(Commande commande) {
        System.out.println("La commande à étée envoyée");
    }

    public void traitterCommande(Commande commande){}
}

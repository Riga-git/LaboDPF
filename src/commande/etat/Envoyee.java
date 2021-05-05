package commande.etat;
import commande.*;

public class Envoyee implements EtatCommande{

    private final Commande commande;

    public Envoyee(Commande commande) {
        this.commande = commande;
        System.out.println("La commande à étée envoyée");
    }

    public void traitterCommande(Commande commande){
        this.commande.definirEtat(new Archivee(this.commande));
    }
}

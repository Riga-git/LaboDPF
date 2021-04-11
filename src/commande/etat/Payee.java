package commande.etat;
import commande.*;

public class Payee implements EtatCommande{

    private final Commande  commande;
    
    public Payee(Commande commande) {
        this.commande = commande;
        System.out.println("La commande à étée traitée");
    }

    public void traitterCommande(Commande commande){
        this.commande.definirEtat(new Envoyee(this.commande));
    }
}

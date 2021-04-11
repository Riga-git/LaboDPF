package commande.etat;
import commande.*;

public class EnAttente implements EtatCommande{
    private final Commande  commande;
    

    public EnAttente(Commande commande) {
        this.commande = commande;
    }

    public void traitterCommande(Commande commande){
        this.commande.definirEtat(new Payee(this.commande));
    }
}
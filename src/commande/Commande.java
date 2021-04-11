package commande;
import commande.etat.EnAttente;
import commande.etat.EtatCommande;
import fruits.Produit;

public class Commande {
    private static Commande instance = null;
    private static final int maxFruits = 5;
    private int currentIndex = 0;
    private Produit[] fruits = new Produit[maxFruits];
    private EtatCommande etatCommande = null;

    private Commande(){
        super();
        etatCommande = new EnAttente(this);
    }

    public final synchronized static Commande getInstance() {
        if (Commande.instance == null){ 
            Commande.instance = new Commande(); 
        }
        return Commande.instance;
    }

    public void ajouterFruit(Produit newFruit){
        if (currentIndex < maxFruits){
            fruits[currentIndex] = newFruit;
            currentIndex++;
        }else{
            System.out.println("impossible ajouter le produit car la liste est pleine!");
        }
    }

    public void AfficherCommande(){
        System.out.println("------------------ Ma commande -------------------");
        for (Produit fruit : fruits) {
            if (fruit != null){
                fruit.afficherFruit();
                System.out.println("----------------------------------------------");
            }
        }
    }

    public void definirEtat(EtatCommande etat){
        this.etatCommande = etat;
    }

    public void traitterCommande(){
        etatCommande.traitterCommande(this);
    }
}

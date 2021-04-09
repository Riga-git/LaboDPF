package decoration;
import fruits.Produit;

public class Etoile extends Decoration {
    Produit produit;
    final char decoration = '*';

    public Etoile(Produit produit){
        this.produit = produit;
    }

    @Override
    public void afficherFruit() {
        super.afficherDecoration(decoration, this.produit);
    }
}

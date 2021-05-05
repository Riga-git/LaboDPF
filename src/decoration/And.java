package decoration;
import fruits.Produit;

public class And extends Decoration {
    Produit produit;
    final char decoration = '&';

    public And(Produit produit){
        this.produit = produit;
    }

    @Override
    public void afficherFruit() {
        super.afficherDecoration(decoration, this.produit);
    }
}
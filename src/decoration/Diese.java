package decoration;
import fruits.Produit;

public class Diese extends Decoration {
    Produit produit;
    final char decoration = '#';

    public Diese(Produit produit){
        this.produit = produit;
    }

    @Override
    public void afficherFruit() {
        super.afficherDecoration(decoration, this.produit);
    }
}
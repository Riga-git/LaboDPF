package decoration;
import fruits.Produit;

public class Egal extends Decoration {
    Produit produit;
    final char decoration = '=';

    public Egal(Produit produit){
        this.produit = produit;
    }

    @Override
    public void afficherFruit() {
        super.afficherDecoration(decoration, this.produit);
    }
}


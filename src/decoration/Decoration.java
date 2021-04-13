package decoration;

import fruits.Produit;

public class Decoration implements Produit{

    @Override
    public void afficherFruit() {
        assert(false);
    }

    void afficherDecoration(char decoration, Produit produit){
        for (int i = 0 ; i < 20 ; i++)
            System.out.print(decoration);
        System.out.print("\n");
        produit.afficherFruit();
        
        for (int i = 0 ; i < 20 ; i++)
            System.out.print(decoration);
        System.out.print("\n");
    }

    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean getPepin() {
        // TODO Auto-generated method stub
        return null;
    }
}

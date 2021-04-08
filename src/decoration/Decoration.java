package decoration;

import fruits.Produit;
import fruits.Fruit;

public class Decoration extends Fruit{
    
    private char decoration;
    
    public Decoration(char decoration){
        this.decoration = decoration;
    }

    public void AfficherFruit(Produit produit){
        for (int i = 0 ; i < 20 ; i++)
            System.out.print(this.decoration);
        System.out.print("\n");
        produit.afficherFruit();
        
        for (int i = 0 ; i < 20 ; i++)
            System.out.print(this.decoration);
        System.out.print("\n");
    }
}

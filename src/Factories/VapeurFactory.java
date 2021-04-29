package Factories;

import Ingredients.Legumes.Legume;
import Ingredients.Legumes.LegumeVapeur;
import Ingredients.Huiles.Huile;
import Ingredients.Huiles.HuileVapeur;
import Ingredients.Herbes.Herbe;
import Ingredients.Herbes.HerbeVapeur;

public class VapeurFactory implements AbstractFactory{

    @Override
    public String getMenu() {
        Legume legume = new LegumeVapeur();
        Huile huile = new HuileVapeur();
        Herbe herbe = new HerbeVapeur();
        return " Avec : "+ legume.getLegumeType() + " & "+ huile.getHuileType() + " & "+ herbe.getHerbeType();
    }
}

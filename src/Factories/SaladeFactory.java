package Factories;

import Ingredients.Legumes.Legume;
import Ingredients.Legumes.LegumeSalade;
import Ingredients.Huiles.Huile;
import Ingredients.Huiles.HuileSalade;
import Ingredients.Herbes.Herbe;
import Ingredients.Herbes.HerbeSalade;

public class SaladeFactory implements AbstractFactory{

    @Override
    public String getMenu() {
        Legume legume = new LegumeSalade();
        Huile huile = new HuileSalade();
        Herbe herbe = new HerbeSalade();
        return " Avec : "+ legume.getLegumeType() + " & "+ huile.getHuileType() + " & "+ herbe.getHerbeType();
    }
}

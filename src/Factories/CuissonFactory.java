package Factories;

import Ingredients.Legumes.Legume;
import Ingredients.Legumes.LegumeCuisson;
import Ingredients.Huiles.Huile;
import Ingredients.Huiles.HuileCuisson;
import Ingredients.Herbes.Herbe;
import Ingredients.Herbes.HerbeCuisson;

public class CuissonFactory implements AbstractFactory{

    @Override
    public String getMenu() {
        Legume legume = new LegumeCuisson();
        Huile huile = new HuileCuisson();
        Herbe herbe = new HerbeCuisson();
        return " Avec : "+ legume.getLegumeType() + " & "+ huile.getHuileType() + " & "+ herbe.getHerbeType();
    }
}

package commande.etat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import commande.*;

public class Archivee implements EtatCommande{

    public Archivee(Commande commande) {}

    public void traitterCommande(Commande commande){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Archivée le : " + dtf.format(now));  

    }
}

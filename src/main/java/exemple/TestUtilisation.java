package exemple;

import bandeau.Bandeau;

import java.awt.Color;

public class TestUtilisation {

    public static void main(String[] args) {
        // Initialisation du bandeau
        Bandeau monBandeau = new Bandeau();
        monBandeau.setBackground(Color.WHITE); // Fond blanc au début
        monBandeau.setForeground(Color.BLACK); // Texte noir au début

        // Création du scénario
        Scenario scenario = new Scenario();

        // Ajout des effets
        scenario.ajouterEffet(new Clignotant(monBandeau, 5)); // Effet 1 : Clignotement
        scenario.ajouterEffet(new Zoom(monBandeau, 5));       // Effet 2 : Zoom progressif
        scenario.ajouterEffet(new ChangementCouleurFond(monBandeau, 3)); // Effet 3 : Changement de couleur de fond

        // Exécution du scénario
        scenario.executer();

        // Message de fin
        monBandeau.setMessage("Terminé !");
        monBandeau.sleep(2000);
        monBandeau.close();
    }
}

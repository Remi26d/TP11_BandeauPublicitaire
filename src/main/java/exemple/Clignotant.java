package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class Clignotant extends Effet {

    public Clignotant(Bandeau bandeau, int repetitions) {
        super(bandeau, repetitions);
    }

    @Override
    public void executer() {
        Color originalForeground = bandeau.getForeground();
        Color originalBackground = bandeau.getBackground();

        // Assurez-vous que le fond est blanc avant de commencer
        bandeau.setBackground(Color.WHITE);

        for (int i = 0; i < repetitions; i++) {
            // Texte blanc sur fond noir
            bandeau.setForeground(Color.WHITE);
            bandeau.setBackground(Color.WHITE);
            bandeau.sleep(300);

            // Texte noir sur fond blanc
            bandeau.setForeground(Color.BLACK);
            bandeau.setBackground(Color.WHITE);
            bandeau.sleep(300);
        }

        // Restaurer les couleurs d'origine
        bandeau.setForeground(originalForeground);
        bandeau.setBackground(originalBackground);
    }
}

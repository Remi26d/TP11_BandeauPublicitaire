package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class ChangementCouleurFond extends Effet {

    public ChangementCouleurFond(Bandeau bandeau, int repetitions) {
        super(bandeau, repetitions);
    }

    @Override
    public void executer() {
        Color originalBackground = bandeau.getBackground();
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.CYAN}; // Liste des couleurs

        for (int r = 0; r < repetitions; r++) {
            for (Color color : colors) {
                bandeau.setBackground(color);
                bandeau.sleep(500);
            }
        }

        bandeau.setBackground(originalBackground); // Restaure la couleur originale
    }
}

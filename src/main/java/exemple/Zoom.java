package exemple;

import java.awt.Font;
import bandeau.Bandeau;

public class Zoom extends Effet {

    public Zoom(Bandeau bandeau, int repetitions) {
        super(bandeau, repetitions);
    }

    @Override
    public void executer() {
        for (int i = 1; i <= repetitions; i++) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i * 10));
            bandeau.sleep(200);
        }
    }
}

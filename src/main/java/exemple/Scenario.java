package exemple;

import java.util.ArrayList;
import java.util.List;

import bandeau.Bandeau;

public class Scenario {
    private final List<Effet> effets = new ArrayList<>();

    public void ajouterEffet(Effet effet) {
        effets.add(effet);
    }

    public void executer() {
        for (Effet effet : effets) {
            effet.executer();
        }
    }
}

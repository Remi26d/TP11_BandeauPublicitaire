package exemple;

import bandeau.Bandeau;

public abstract class Effet {
    protected Bandeau bandeau;
    protected int repetitions;

    public Effet(Bandeau bandeau, int repetitions) {
        this.bandeau = bandeau;
        this.repetitions = repetitions;
    }

    public abstract void executer();
}

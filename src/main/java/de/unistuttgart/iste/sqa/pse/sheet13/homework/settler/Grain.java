package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

public final class Grain extends Resource {

    private Grain grain;

    /**
     * Constructor for Grain.
     *
     * @param label the label of the grain.
     */
    private Grain(final String label) {
        super(label);
    }

    public Grain getGrain(final Grain grain) {
        if (grain == null) {
            throw new IllegalStateException(" Grain must not be null!");
        }
        this.grain = grain;
        return this.grain;
    }

}

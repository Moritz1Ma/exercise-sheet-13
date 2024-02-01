package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

public final class Grain extends Resource {

    /**
     * Class for Grain which extends resource.
     *
     * @author Moritz Mairle, Quentin Hadar, Nora Jasharaj.
     */
    private Grain grain;

    /**
     * Constructor for Grain.
     *
     * @param name     the name of the grain.
     * @param position the position of the grain.
     */

    Grain(String name, Position position) {
        super(name, position);
    }

    public Grain getGrain(final Grain grain) {
        if (grain == null) {
            throw new IllegalStateException(" Grain must not be null!");
        }
        this.grain = grain;
        return this.grain;
    }

}

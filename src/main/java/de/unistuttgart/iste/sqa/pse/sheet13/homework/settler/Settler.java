package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Abstract class for Settlers.
 *
 * Settlers have a name, a position and the method to settle.
 */
public abstract class Settler {
    private String name;
    private Position position;
    public  abstract void settle();

    /**
     *
     * @param name
     * @param position
     */
    protected Settler(final String name, final Position position){
        if ( name == null|| name.contains("  ") || position == null || getPosition()== null){
            throw new IllegalArgumentException("Name and position both have to be declared!");
        }
    }

    /**
     *
     *
     * @return
     */
    public String getName() {
        if (name== null){
            throw new IllegalStateException("The name cannot be null");
        }
        return name;
    }
    /**
     *
     */
    public Position getPosition() {
        return position;
    }
}

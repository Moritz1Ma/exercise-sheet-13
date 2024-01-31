package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Abstract class for Settlers.
 * <p>
 * Settlers have a name, a position and the method to settle.
 */
public abstract class Settler {
    private String name;
    private Position position;

    public abstract void settle();

    /**
     * Constructor for Settler.
     *
     * @param name     name of the settler.
     * @param position position of the settler.
     * @throws IllegalArgumentException if name or position are invalid.
     */
    Settler(final String name, final Position position) {
        if (name == null || name.contains("  ") || position == null || getPosition() == null) {
            throw new IllegalArgumentException("Name and position both have to be declared!");
        }
    }

    /*@
      @ requires Settler !== null;
      @ requires name !== null;
      @ ensures returns the name;
     */

    /**
     * Gets the name of the Settler.
     *
     * @return the name of the Settler.
     */
    public String getName() {
        if (name == null || name.contains(" ")) {
            throw new IllegalStateException("The name cannot be null");
        }
        return name;
    }

     /*@
      @ requires Settler !== null;
      @ requires position !== null;
      @ ensures returns the position,
     */

    /**
     * Gets the position of the Settler.
     *
     * @return the position.
     */
    public Position getPosition() {
        return position;
    }
}

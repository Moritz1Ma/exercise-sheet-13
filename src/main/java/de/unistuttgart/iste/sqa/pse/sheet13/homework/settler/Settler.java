package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for Settlers.
 * <p>
 * Settlers have a name, a position and the method to settle.
 *
 * @author Moritz Mairle, Quentin Hadar, Nora Jasharaj.
 */

public abstract class Settler {
    final public String name;
    final public Position position;
    final private List<Resource> consumedResources = new ArrayList<>();
    final private List<Resource> producedResources = new ArrayList<>();


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
        this.name = name;
        this.position = position;
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
     * @throws IllegalArgumentException if argument is null.
     */
    public final String getName() {
        if (name == null || name.contains(" ")) {
            throw new IllegalStateException("The name cannot be null");
        }
        return name;
    }

    /*@
      @ requires Settler !== null;
      @ requires position !== null;
      @ ensures returns the name;
     */

    /**
     * Gets the position of the Settler.
     *
     * @return the current position.
     * @throws IllegalArgumentException if argument is null.
     */
    public final Position getPosition() {
        if (position == null) {
            throw new IllegalStateException("Position cannot be null");
        }
        return position;
    }
}

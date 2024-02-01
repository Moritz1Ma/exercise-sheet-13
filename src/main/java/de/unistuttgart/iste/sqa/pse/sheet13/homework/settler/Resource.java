package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Abstract class for Resource.
 * <p>
 * Resources are defined by their label.
 *
 * @author Moritz Mairle, Quentin Hadar, Nora Jasharaj.
 */

public abstract class Resource {
    public final String name;
    public final Position position;

    /**
     * Constructor for Resource.
     *
     * @param name     the name of the Resource.
     * @param position the position of the Resource.
     * @throws IllegalArgumentException if name or position are invalid.
     */
    Resource(String name, Position position) {
        if (name == null || name.contains(" ") || position == null) {
            throw new IllegalArgumentException("Argument must not be null.");
        }
        this.name = name;
        this.position = position;
    }


     /*@
      @ requires Resource !== null;
      @ requires name !== null;
      @ ensures returns the name;
     */

    /**
     * Gets the name of the Resource.
     *
     * @return name the name of the Resource.
     */
    public final String getName() {
        return name;
    }

    /*@
      @ requires Resource !== null;
      @ requires position !== null;
      @ ensures returns the position;
     */

    /**
     * Gets the position of the Resource.
     *
     * @return position of the resource.
     */
    public final Position getPosition() {
        return position;
    }
}

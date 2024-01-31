package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Abstract class for Resource.
 * <p>
 * Resources are defined by their label.
 */


/**
 *
 */
public abstract class Resource extends ResourceType {
    private String name;
    private Position position;

    /**
     * Constructor for Resource.
     *
     * @param label the label of the Resource.
     */
    protected Resource(final String label) {
        super(label);
    }

     /*@
      @ requires Resource !== null;
      @ requires position !== null;
      @ ensures returns the position,
     */

    /**
     * Gets the position of the Resource.
     *
     * @return position of hte resource.
     */
    public Position getPosition() {
        return position;
    }
}

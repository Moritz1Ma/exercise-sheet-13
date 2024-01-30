package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Abstract class for Resource.
 *
 * Resources are defined by their label.
 */


/**
 *
 */
public abstract class Resource extends ResourceType {
    private String name;
    private Position position;

    protected Resource(final String label) {
        super(label);
    }

}

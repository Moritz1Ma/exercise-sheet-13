package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Type of a Resource;
 */
public class ResourceType {
    private final String label;

    /**
     * Constructor for ResourceType.
     *
     * @param label the label fo the ResourceType.
     * @throws IllegalArgumentException if invalid  label is put as an argument.
     */
    ResourceType(final String label) {
        super();
        this.label = label;
        if (label == null || label.contains(" ")) {
            throw new IllegalArgumentException("Label must not be empty!");
        }
    }

    /**
     * Gets the label of the ResourceType.
     *
     * @return the label of the ResourceType.
     */
    public final String getLabel() {
        return label;
    }
}

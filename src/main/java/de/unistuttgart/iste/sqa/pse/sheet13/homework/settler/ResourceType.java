package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Type of a Resource;
 *
 * @author Moritz Mairle, Quentin Hadar, Nora Jasharaj.
 */
public class ResourceType {
    public String label;

    /**
     * Constructor for ResourceType.
     *
     * @param label the label for the ResourceType.
     * @throws IllegalArgumentException if invalid  label is put as an argument.
     */
    ResourceType(final String label) {
        if (label == null || label.contains(" ")) {
            throw new IllegalArgumentException("Label must not be empty!");
        }
        this.label = label;
    }

     /*@
      @ requires ResourceType !== null;
      @ requires label !== null;
      @ ensures returns the label;
     */

    /**
     * Gets the label of the ResourceType.
     *
     * @return the label of the ResourceType.
     */
    public final String getLabel() {
        return label;
    }
}

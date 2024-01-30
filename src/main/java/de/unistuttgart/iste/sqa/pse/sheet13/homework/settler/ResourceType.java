package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Type of a Resource
 */
public class ResourceType {
	private final String label;

	protected ResourceType(final String label) {
		super();
		this.label = label;
		if (label== null || label.contains (" ") ){
			throw new IllegalArgumentException("Label must not be empty!");
		}

	}

	public final String getLabel() {
		return label;
	}
}

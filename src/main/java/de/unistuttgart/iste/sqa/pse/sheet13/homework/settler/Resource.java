package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Abstract class for Resource.
 * <p>
 * Resources are defined by their label.
 * @author Moritz Mairle, Quentin Hadar, Nora Jasharaj.
 */


/**
 *
 */
public abstract class Resource {
    public String name;
    public Position position;

    /**
     * Constructor for Resource.
     *
     * @param name the name of the Resource.
     * @param position the position of the Resource.
     */
    Resource(String name, Position position){
        this.name = name;
        this.position = position;
    }



    public String getName(){
        return name;
    }

    /*@
      @ requires Resource !== null;
      @ requires position !== null;
      @ ensures returns the position,
     */

    /**
     * Gets the position of the Resource.
     *
     * @return position of the resource.
     */
    public Position getPosition() {
        return position;
    }
}

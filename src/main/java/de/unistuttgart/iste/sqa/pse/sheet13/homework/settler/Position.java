package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Position of a Settler or Resource.
 * <p>
 * The Position is defined by longitude and latitude.
 *
 * @author Moritz Mairle, Quentin Hadar, Nora Jasharaj.
 */
public final class Position {
    private final long longitude;
    private final long latitude;

    /**
     * Constructor for Position.
     *
     * @param longitude
     * @param latitude
     */
    private Position(final long longitude, final long latitude) {
        super();
        this.longitude = longitude;
        this.latitude = latitude;
    }


     /*@
      @ requires Position !== null;
      @ requires longitude !== null;
      @ ensures returns the longitude;
     */

    /**
     * Gets the longitude.
     *
     * @return the longitude.
     */

    public long getLongitude() {
        return longitude;
    }

     /*@
      @ requires Position !== null;
      @ requires latitude !== null;
      @ ensures returns the latitude;
     */

    /**
     * Gets the latitude.
     *
     * @return latitude.
     */
    public long getLatitude() {
        return latitude;
    }
}

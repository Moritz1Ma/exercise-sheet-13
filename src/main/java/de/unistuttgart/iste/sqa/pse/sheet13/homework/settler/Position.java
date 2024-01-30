package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Position of a Settler or Resource.
 * <p>
 * The Position is defined by longitude and latitude.
 */
public final class Position {
    private final long longitude;
    private final long latitude;

    /**
     * @param longitude
     * @param latitude
     */
    private Position(final long longitude, final long latitude) {
        super();
        this.longitude = longitude;
        this.latitude = latitude;
    }


    /**
     * @return
     */

    public long getLongitude() {
        return longitude;
    }

    /**
     * @return
     */
    public long getLatitude() {
        return latitude;
    }
}

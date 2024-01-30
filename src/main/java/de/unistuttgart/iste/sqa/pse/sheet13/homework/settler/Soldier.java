package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Class for  Soldiers who are a subclass of Settlers.
 * <p>
 * Soldiers extend Settlers by the method fightEnemy().
 */
public final class Soldier extends Settler {
    private Settler enemy;

    /**
     * Constructor for Soldier;
     *
     * @param name     the name of the Soldier;
     * @param position the position of the soldier;
     */
    private Soldier(String name, Position position) {
        super(name, position);
    }

    /*@
      @ requires (only here for completeness)
      @ ensures (only here for completeness)
     */

    /**
     * Makes the soldier settle;( also only here for completeness);
     */
    @Override
    public void settle() {
        //TODO /lasst das so, das Todo ist Teil der Aufgabenstellung
    }

    /*@
      @ requires (only here for completeness);
      @ ensures (only here for completeness);
     */

    /**
     * Makes the Soldier fight an enemy;
     *
     * @param enemy the enemy to be fought;
     */
    public void fightEnemy(final Settler enemy) {
        this.enemy = enemy;
        //TODO /lasst das so, das Todo ist Teil der Aufgabenstellung
    }
    // ich glaube, der Soldier braucht garkeine  Position lol
   /*@
     @ requires
     @ ensures
    */

    /**
     * @param soldier the soldier wanted;
     * @return the position of the soldier;
     */
    private Position getPosition(final Soldier soldier) {
        return soldier.getPosition();
    }

}

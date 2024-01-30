package de.unistuttgart.iste.sqa.pse.sheet13.homework.settler;

/**
 * Class for  Soldiers who are a subclass of Settlers.
 *
 * Soldiers extend Settlers by the method fightEnemy().
 */
public final class Soldier extends Settler {
    private Settler enemy;

    /**
     *
     * @param name the name of the Soldier;
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
     * Overrides the initial settle method ( also only here for completeness);
     */
    @Override
    public void settle() {}

    /*@
      @ requires (only here for completeness);
      @ ensures (only here for completeness);
     */

    /**
     * Makes the Soldier fight an enemy;
     * @param enemy the enemy to be fought;
     */
   public void fightEnemy( final Settler enemy){
        this.enemy= enemy;
   }

   /*@
     @ requires
     @ ensures
    */
    /**
     *
     * @param soldier the soldier wanted;
     * @return the position of the soldier;
     */
   private Position getPosition(final Soldier soldier){
        return soldier.getPosition();
    }

}

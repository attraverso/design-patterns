package strategy;

/*
 * As the strategy is 'just' an interface, we need at least one CONCRETE STRATEGY, like the following.
 */
public class WordBehavior implements WeaponBehavior {
    /* this gets called by a Character instance through its fight() method and WeaponBehavior's own useWeapon() */
    public void useWeapon() {
            System.out.println("WordBehavior: Try to TALK some sense into people");
    }
}

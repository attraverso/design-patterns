package strategy;

/*
 * This class is a CLIENT of our context, as are all the other Characte implementations.
 */
public class Queen extends Character
{
    /* When we instantiate a new Queen, we establish what behavior she should manifest
    * when it's time to fight. */
    public Queen()
    {
        weaponBehavior = new WordBehavior();
    }

    public void display()
    {
        System.out.println("Rendering a Queen.");
    }
}

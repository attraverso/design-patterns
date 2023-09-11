package decorator;

/*
 * Our base class. Both the beverages AND the decorators need to be descendants of Beverage.
 * It can be either an interface or abstract class depending on complexity and needs.
 * Read the consequences in the other classes and then pick your poison.
 */

/*
 * If we use an abstract class, subclasses need to provide a description in their constructor, but Beverage takes care
 * of implementing getDescription
 */
public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return this.description;
    };

    public abstract double getCost();
}

/*
 * If we use an interface, subclasses need to override the getDescription method to return the appropriate description.
 */

//public interface Beverage {
//    public String getDescription();
//
//    public double getCost();
//}
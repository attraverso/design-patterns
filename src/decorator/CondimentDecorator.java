package decorator;

/*
 * If beverage is an abstract class, CondimentDecorator cannot be an interface (duh).
 * We also need to make sure that all subclasses of CondimentDecorator will re-implement the getDescription method
 * instead of using what's provided by Beverage, since the behavior is different.
 */

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}

/*
 * if we're using interfaces, the only use of this at an early stage is to keep code consistent and allow
 * for future modifications separate from the base Beverage class, since every class is implementing it own
 * getDescription method anyway.
 */

//public interface CondimentDecorator implements Beverage {}

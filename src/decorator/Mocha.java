package decorator;

/*
 * Condiments are supplied with an instance of Beverage and can perform actions before and/or after calling
 * methods from their beverage instance.
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.2;
    }
}

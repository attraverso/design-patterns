package decorator;

public class Whip extends CondimentDecorator {

    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.2;
    }
}

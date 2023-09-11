package decorator;

public class Decaf extends Beverage {
    public Decaf () {
        this.description = "Decaf";
    }

    @Override
    public double getCost() {
        return 1.05;
    }
}

//public class Decaf implements Beverage {
//    @Override
//    public String getDescription() {
//        return "Decaf";
//    }
//
//    @Override
//    public double getCost() {
//        return 1.05;
//    }
//}
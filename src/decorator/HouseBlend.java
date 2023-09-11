package decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}

//public class HouseBlend implements Beverage {
//    @Override
//    public String getDescription() {
//        return "House Blend";
//    }
//
//    @Override
//    public double getCost() {
//        return 0.89;
//    }
//}
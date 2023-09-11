package decorator;

/*
* A basic terminal app where clients order coffees with different condiments and the decorator
* manages outputting the correct ingredients list and price.
*/

public class DecoratorPlayer {

    public void playPattern() {
        System.out.println("Client 1 orders a decaf latte");
        // Here's where the magic happens, courtesy of coffees and condiments sharing the same base class
        // b1 currently holds a Decaf instance
        Beverage b1 = new Decaf();
        // now it holds an instance of Milk, initialized with the earlier Decaf
        b1 = new Milk(b1);
        // as a Milk, to calculate cost b1 now calls Decaf, asks for its cost, and adds its own on top,
        // same for description -> go look at the Milk class
        System.out.println(b1.getDescription() + " | price: " + b1.getCost());

        //and the same principle can be applied however many times we want
        System.out.println("Client 2 orders a double mocha latte with whip");
        Beverage b2 = new HouseBlend();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Milk(b2);
        b2 = new Whip(b2);
        // the Whip calls its Milk that calls its Mocha and so on and so forth
        System.out.println(b2.getDescription() + " | price: " + b2.getCost());
        // yes we end up with "mocha, mocha" in the description, see readme
    }

}
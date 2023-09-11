import decorator.DecoratorPlayer;
import strategy.StrategyPlayer;

public class Main {
    public static void main(String[] args) {
        switch (args[0]) {
            case "strategy":
                new StrategyPlayer().playPattern();
                break;
            case "decorator":
                new DecoratorPlayer().playPattern();
                break;
        }
    }
}
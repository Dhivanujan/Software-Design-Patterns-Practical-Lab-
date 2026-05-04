package Task18;

public class Chocolate extends CakeDecorator {
    public Chocolate(Cake cake) {
        super(cake);
    }

    public String getDescription() {
        return cake.getDescription() + " + Chocolate";
    }
}
package Task18;

public class Cream extends CakeDecorator {
    public Cream(Cake cake) {
        super(cake);
    }

    public String getDescription() {
        return cake.getDescription() + " + Cream";
    }
}

package Task18;

public abstract class CakeDecorator implements Cake {
    protected Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }
}

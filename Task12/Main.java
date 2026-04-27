package Task12;
public class Main {
    public static void main(String[] args) {
        ModernSystem system = new SystemAdapter(new LegacySystem());
        system.request();
    }
}

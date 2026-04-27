package Task1;
// Client / Main program
public class Main {
    public static void main(String[] args) {

        GUIFactory factory;

        // Switch theme by changing this line
        String theme = "dark";

        if (theme.equalsIgnoreCase("dark")) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }

        // Create UI components
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        TextBox textbox = factory.createTextBox();

        // Use the components
        button.paint();
        checkbox.paint();
        textbox.paint();
    }
}

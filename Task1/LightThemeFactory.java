// Concrete Factory - Light Theme
public class LightThemeFactory implements GUIFactory {
    public Button createButton() {
        return new LightButton();
    }

    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }

    public TextBox createTextBox() {
        return new LightTextBox();
    }
}
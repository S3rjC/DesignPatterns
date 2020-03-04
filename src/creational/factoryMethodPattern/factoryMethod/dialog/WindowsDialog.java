package creational.factoryMethodPattern.factoryMethod.dialog;

import creational.factoryMethodPattern.factoryMethod.dialog.buttons.Button;
import creational.factoryMethodPattern.factoryMethod.dialog.buttons.WindowsButton;

/**
 * @author Serj C.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

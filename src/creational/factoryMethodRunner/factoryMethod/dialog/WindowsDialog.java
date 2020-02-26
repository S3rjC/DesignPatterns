package creational.factoryMethodRunner.factoryMethod.dialog;

import creational.factoryMethodRunner.factoryMethod.dialog.buttons.Button;
import creational.factoryMethodRunner.factoryMethod.dialog.buttons.WindowsButton;

/**
 * @author Serj C.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

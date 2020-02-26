package creational.factoryMethodRunner.factoryMethod.dialog;

import creational.factoryMethodRunner.factoryMethod.dialog.buttons.Button;
import creational.factoryMethodRunner.factoryMethod.dialog.buttons.HtmlButton;

/**
 * @author Serj C.
 *
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

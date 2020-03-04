package creational.factoryMethodPattern.factoryMethod.dialog;

import creational.factoryMethodPattern.factoryMethod.dialog.buttons.Button;
import creational.factoryMethodPattern.factoryMethod.dialog.buttons.HtmlButton;

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

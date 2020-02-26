package creational.factoryMethodRunner.factoryMethod.dialog.buttons;

/**
 * @author Serj C.
 *
 * HTML button implementation.
 */

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Tst Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}

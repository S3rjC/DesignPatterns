package creational.prototypePattern.registry;

import java.util.Objects;

/**
 * @author Serj C.
 */
public class Button implements Prototype {
    public int x;
    public int y;
    public String color;

    public Button(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Button(Button prototype) {
        if (prototype != null) {
            this.x = prototype.x;
            this.y = prototype.y;
            this.color = prototype.color;
        }
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Prototype clone() {
        return new Button(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Button)) return false;
        Button button = (Button) o;
        return button.x == this.x && button.y == this.y && Objects.equals(button.color, this.color);
    }
}

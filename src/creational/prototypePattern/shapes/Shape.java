package creational.prototypePattern.shapes;

import java.util.Objects;

/**
 * @author Serj C.
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }
}

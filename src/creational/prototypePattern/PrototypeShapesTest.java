package creational.prototypePattern;

import creational.prototypePattern.shapes.Circle;
import creational.prototypePattern.shapes.Rectangle;
import creational.prototypePattern.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serj C.
 *
 * PROTOTYPE
 * ---------
 * Basic implementation
 * 1. The Prototype interface declares the cloning methods. In most cases, it’s a single clone method.
 * 2. The Concrete Prototype class implements the cloning method. In addition to copying the original object’s data
 * to the clone, this method may also handle some edge cases of the cloning process related to cloning linked objects,
 * untangling recursive dependencies, etc.
 * 3. The Client can produce a copy of any object that follows the prototype interface.
 *
 * Registry implementation
 * 1. The Prototype Registry provides an easy way to access frequently-used prototypes. It stores a set of pre-built
 * objects that are ready to be copied. The simplest prototype registry is a name → prototype hash map. However,
 * if you need better search criteria than a simple name, you can build a much more robust version of the registry.
 */
public class PrototypeShapesTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        circle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are dfferent objects (YES!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (YES!)");
                } else {
                    System.out.println(i + ": But they are not identical (NO!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (NO!)");
            }
        }

    }
}

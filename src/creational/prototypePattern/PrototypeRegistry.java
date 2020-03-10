package creational.prototypePattern;

import creational.prototypePattern.registry.Button;
import creational.prototypePattern.registry.Prototype;

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
public class PrototypeRegistry {
    public static List<Prototype> items = new ArrayList<>();

    public static void main(String[] args) {
        Button redButton = new Button(10, 10, "red");
        Button blueButton = new Button(20, 20, "blue");

        items.add(redButton);
        items.add(blueButton);

        Prototype prototype1 = getByColor("red");
        Prototype prototype2 = getByColor("blue");

        if (prototype1 == null || prototype2 == null) {
            System.out.println("No objects available of this color.");
        } else {
            if (prototype1 != redButton && prototype2 != blueButton) {
                System.out.println("Objects are different (YES!)");
                if (prototype1.equals(redButton) && prototype2.equals(blueButton)) {
                    System.out.println("And they are identical (YES!)");
                } else {
                    System.out.println("But they are not identical (NO!)");
                }
            } else {
                System.out.println("Objects are equal (NO!)");
            }
        }

    }

    public static Prototype getByColor(String color) {
        Prototype clone = null;
        for (Prototype item : items) {
            if (item.getColor().equals(color)) {
                clone = item.clone();
            }
        }
        return clone;
    }
}

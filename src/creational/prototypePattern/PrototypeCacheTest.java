package creational.prototypePattern;

import creational.prototypePattern.cache.BundledShapeCache;
import creational.prototypePattern.shapes.Shape;

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
public class PrototypeCacheTest {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

//      Compare first two cloned shapes (shape1 and shape2)
        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (YES!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (NO!)");
        }
//      Compare the 2'nd and the 3'rd cloned shapes (shape2 and shape3)
        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (YES!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (YES!)");
            } else {
                System.out.println("And they are not identical (NO!)");
            }
        } else {
            System.out.println("Medium blue rectangle are the same (NO!)");
        }
    }
}

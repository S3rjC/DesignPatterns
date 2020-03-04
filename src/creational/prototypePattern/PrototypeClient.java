package creational.prototypePattern;

import creational.prototypePattern.prototype.ConcretePrototype;
import creational.prototypePattern.prototype.Prototype;
import creational.prototypePattern.prototype.SubclassPrototype;

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
public class PrototypeClient {
    public static void main(String[] args) {
        ConcretePrototype object1 = new ConcretePrototype();
        object1.field1 = 1;
        SubclassPrototype object2 = new SubclassPrototype();
        object2.field2 = 2;

        Prototype prototype1 = object1.clone();
        Prototype prototype2 = object2.clone();

        if (prototype1 != object1 && prototype2 != object2) {
            System.out.println("Objects are different! (YES!)");
            if (prototype1.equals(object1) && prototype2.equals(object2)) {
                System.out.println("And they are identical (YES!)");
            } else {
                System.out.println("But they are not identical (NO!)");
            }
        } else {
            System.out.println("Objects are equal! (NO!)");
        }
    }
}

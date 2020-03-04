package creational.prototypePattern.prototype;

/**
 * @author Serj C.
 */
public class SubclassPrototype extends ConcretePrototype {
    public int field2;

    public SubclassPrototype() {
    }

    public SubclassPrototype(SubclassPrototype prototype) {
        super(prototype);
        if (prototype != null) {
            this.field2 = prototype.field2;
        }
    }

    @Override
    public Prototype clone() {
        return new SubclassPrototype(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SubclassPrototype) || !super.equals(o)) return false;
        SubclassPrototype prototype = (SubclassPrototype) o;
        return prototype.field2 == this.field2;
    }
}

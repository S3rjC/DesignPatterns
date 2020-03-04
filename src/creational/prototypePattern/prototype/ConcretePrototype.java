package creational.prototypePattern.prototype;

/**
 * @author Serj C.
 */
public class ConcretePrototype implements Prototype {
    public int field1;

    public ConcretePrototype() {
    }

    public ConcretePrototype(ConcretePrototype prototype) {
        if (prototype != null)
            this.field1 = prototype.field1;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ConcretePrototype)) return false;
        ConcretePrototype prototype = (ConcretePrototype) o;
        return prototype.field1 == this.field1;
    }
}

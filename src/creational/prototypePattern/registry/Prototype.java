package creational.prototypePattern.registry;

/**
 * @author Serj C.
 */
public interface Prototype {
    String getColor();
    Prototype clone();
}

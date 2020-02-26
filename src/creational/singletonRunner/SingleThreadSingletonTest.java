package creational.singletonRunner;

import creational.singletonRunner.singleton.SingleThreadSingleton;

/**
 * @author Serj C.
 *
 * SINGLETON
 * ---------
 * 1. The Singleton class declares the static method  getInstance that returns the same instance of its own class.
 * The Singleton’s constructor should be hidden from the client code. Calling the getInstance method should be
 * the only way of getting the Singleton object.
 */

public class SingleThreadSingletonTest {
    public static void main(String[] args) {
        SingleThreadSingleton singleton = SingleThreadSingleton.getInstance("FOO");
        SingleThreadSingleton anotherSingleton = SingleThreadSingleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

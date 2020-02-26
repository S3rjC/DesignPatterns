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

public class MultiThreadSingleton {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingleThreadSingleton singleton = SingleThreadSingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingleThreadSingleton singleton = SingleThreadSingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}

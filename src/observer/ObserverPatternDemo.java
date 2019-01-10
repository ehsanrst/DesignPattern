package observer;

import observer.core.BinaryObserver;
import observer.core.HexaObserver;
import observer.core.OctalObserver;
import observer.core.Subject;

/**
 * Observer pattern is used when there is one-to-many relationship between objects
 * such as if one object is modified, its dependent objects are to be notified automatically.
 * Observer pattern falls under behavioral pattern category.
 */

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}

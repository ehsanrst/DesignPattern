package observer.core;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}

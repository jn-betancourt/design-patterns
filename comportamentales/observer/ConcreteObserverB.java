package observer;

class ConcreteObserverB implements Observer {
    private Subject subject;

    public ConcreteObserverB(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("ObserverB: El estado del sujeto ha cambiado a: " + subject.getState());
    }
}
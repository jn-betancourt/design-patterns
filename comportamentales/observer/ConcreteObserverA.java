package observer;

class ConcreteObserverA implements Observer {
    private Subject subject;

    public ConcreteObserverA(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("ObserverA: El estado del sujeto ha cambiado a: " + subject.getState());
    }
}
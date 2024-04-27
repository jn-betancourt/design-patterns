package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserverA observerA = new ConcreteObserverA(subject);
        ConcreteObserverB observerB = new ConcreteObserverB(subject);

        subject.setState("Estado inicial");

        subject.setState("Estado nuevo"); // Imprime:
        // ObserverA: El estado del sujeto ha cambiado a: Estado nuevo
        // ObserverB: El estado del sujeto ha cambiado a: Estado nuevo
    }
}
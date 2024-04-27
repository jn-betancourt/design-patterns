package visitor;

public class Main {
    public static void main(String[] args) {
      ElementA elementA = new ElementA();
      ElementB elementB = new ElementB();
  
      ConcreteVisitor visitor = new ConcreteVisitor();
  
      elementA.accept(visitor); // Imprime "Visitando ElementA"
      elementB.accept(visitor); // Imprime "Visitando ElementB"
    }
  }
  
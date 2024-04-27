public class Main {
    public static void main(String[] args) {
      Receiver receiver = new Receiver();
  
      ConcreteCommandA commandA = new ConcreteCommandA(receiver);
      ConcreteCommandB commandB = new ConcreteCommandB(receiver);
  
      Invoker invoker = new Invoker();
  
      invoker.setCommand(commandA);
      invoker.invoke(); // Imprime "Ejecutando acción A"
  
      invoker.setCommand(commandB);
      invoker.invoke(); // Imprime "Ejecutando acción B"
    }
  }
  

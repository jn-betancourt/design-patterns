package strategy;

public class Main {
    public static void main(String[] args) {
      Contexto contexto = new Contexto();
  
      contexto.setEstrategia(new EstrategiaA());
      contexto.ejecutarEstrategia(); // Imprime "Ejecutando estrategia A"
  
      contexto.setEstrategia(new EstrategiaB());
      contexto.ejecutarEstrategia(); // Imprime "Ejecutando estrategia B"
    }
  }
  
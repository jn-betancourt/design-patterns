package templateMethod;

class Resta extends Calculo {

    @Override
    protected void inicializar() {
      System.out.println("Resta: inicializando");
    }
  
    @Override
    protected void realizarCalculoEspecifico() {
      int a = 10;
      int b = 20;
      int resultado = a - b;
      System.out.println("Resta: realizando cálculo. a - b = " + resultado);
    }
  }
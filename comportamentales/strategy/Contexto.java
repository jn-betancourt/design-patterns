package strategy;

class Contexto {
    private Estrategia estrategia;
  
    public void setEstrategia(Estrategia estrategia) {
      this.estrategia = estrategia;
    }
  
    public void ejecutarEstrategia() {
      estrategia.ejecutar();
    }
  }
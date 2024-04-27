package visitor;

class ConcreteVisitor implements Visitor {
    @Override
    public void visitElementA(ElementA elementA) {
      System.out.println("Visitando ElementA");
    }
  
    @Override
    public void visitElementB(ElementB elementB) {
      System.out.println("Visitando ElementB");
    }
  }
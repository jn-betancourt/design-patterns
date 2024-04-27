package visitor;

class ElementB implements Visitable {
    @Override
    public void accept(Visitor visitor) {
      visitor.visitElementB(this);
    }
  }

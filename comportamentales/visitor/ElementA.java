package visitor;
class ElementA implements Visitable {
    @Override
    public void accept(Visitor visitor) {
      visitor.visitElementA(this);
    }
  }
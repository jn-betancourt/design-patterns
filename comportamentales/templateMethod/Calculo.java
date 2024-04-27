package templateMethod;

abstract class Calculo {

    public final void realizarCalculo() {
        inicializar();
        realizarCalculoEspecifico();
        finalizar();
    }

    protected abstract void inicializar();

    protected abstract void realizarCalculoEspecifico();

    protected void finalizar() {
        System.out.println("Cálculo finalizado");
    }
}

package templateMethod;

class Suma extends Calculo {

    @Override
    protected void inicializar() {
        System.out.println("Suma: inicializando");
    }

    @Override
    protected void realizarCalculoEspecifico() {
        int a = 10;
        int b = 20;
        int resultado = a + b;
        System.out.println("Suma: realizando cálculo. a + b = " + resultado);
    }
}

package co.edu.uniquindio.poo;

// Clase Concreta de Colleague
class PostorConcreto implements Postor {
    private MediadorSubasta mediador;
    private String nombre;

    public PostorConcreto(MediadorSubasta mediador, String nombre) {
        this.mediador = mediador;
        this.nombre = nombre;
    }

    @Override
    public void hacerOferta(int monto) {
        System.out.println(nombre + " hace una oferta de " + monto);
        mediador.recibirOferta(monto, this);
    }

    @Override
    public void actualizar(int mejorOferta, Postor lider) {
        if (lider != this) {
            System.out.println(nombre + ": La mejor oferta es ahora " + mejorOferta + " realizada por " + lider.getNombre());
        } else {
            System.out.println(nombre + ": ¡Soy el líder con una oferta de " + mejorOferta + "!");
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
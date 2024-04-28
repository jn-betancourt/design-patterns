package co.edu.uniquindio.poo;

public class Luz {
    private EstadoLuz estadoActual;

    public Luz() {
        this.estadoActual = new LuzApagada(); // Estado inicial: apagado
    }

    public void setEstado(EstadoLuz estado) {
        this.estadoActual = estado;
    }

    public void encender() {
        estadoActual.encender();
        setEstado(new LuzEncendida());
    }

    public void apagar() {
        estadoActual.apagar();
        setEstado(new LuzApagada());
    }

    public void intermitente() {
        estadoActual.intermitente();
        setEstado(new LuzIntermitente());
    }
}

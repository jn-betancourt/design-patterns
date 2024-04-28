package co.edu.uniquindio.poo;

public class Memento {
    private final String contenido;

    public Memento(String contenido) {
        this.contenido = contenido;
    }

    public String obtenerContenido() {
        return contenido;
    }
}

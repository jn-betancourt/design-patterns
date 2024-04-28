package co.edu.uniquindio.poo;

//originador

public class Editor {
    private String contenido;

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public Memento guardar() {
        return new Memento(contenido);
    }

    public void restaurar(Memento memento) {
        contenido = memento.obtenerContenido();
    }
}

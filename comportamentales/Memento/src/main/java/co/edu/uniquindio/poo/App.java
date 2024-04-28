package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Historial historial = new Historial();

        // Cambios en el contenido del editor
        editor.setContenido("Texto inicial");
        historial.agregarMemento(editor.guardar());

        editor.setContenido("Texto modificado");
        historial.agregarMemento(editor.guardar());

        editor.setContenido("Texto editado nuevamente");
        historial.agregarMemento(editor.guardar());

        // Restaurar a un estado anterior
        editor.restaurar(historial.obtenerMemento(1));

        System.out.println(editor.getContenido());
    }
}

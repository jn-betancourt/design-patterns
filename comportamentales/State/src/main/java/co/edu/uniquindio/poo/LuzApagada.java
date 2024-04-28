package co.edu.uniquindio.poo;

public class LuzApagada implements EstadoLuz{
    @Override
    public void encender() {
        System.out.println("Cambiar la luz a modo intermitente.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando la luz.");
    }

    @Override
    public void intermitente() {
        System.out.println("La luz ya está en modo intermitente.");
    }
}

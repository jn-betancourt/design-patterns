package co.edu.uniquindio.poo;

public class LuzIntermitente implements EstadoLuz{
    @Override
    public void encender() {
        System.out.println("La luz ya está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando la luz.");
    }

    @Override
    public void intermitente() {
        System.out.println("Cambiar la luz a modo intermitente.");
    }
}

package co.edu.uniquindio.poo;

public interface Postor {
    void hacerOferta(int monto);
    void actualizar(int mejorOferta, Postor lider);
    String getNombre();
}

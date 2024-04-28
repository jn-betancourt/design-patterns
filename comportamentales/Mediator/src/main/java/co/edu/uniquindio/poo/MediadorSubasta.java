package co.edu.uniquindio.poo;

public interface MediadorSubasta {
    void registrarPostor(Postor postor);
    void recibirOferta(int monto, Postor postor);
}

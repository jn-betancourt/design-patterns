package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class Subasta implements MediadorSubasta {

    private List<Postor> postores = new ArrayList<>();
    private int mejorOferta = 0;
    private Postor lider;

    @Override
    public void registrarPostor(Postor postor) {
        postores.add(postor);
    }

    @Override
    public void recibirOferta(int monto, Postor postor) {
        if (monto > mejorOferta) {
            mejorOferta = monto;
            lider = postor;
            notificarPostores();
        } else {
            System.out.println("La oferta de " + postor.getNombre() + " de " + monto + " no supera la mejor oferta actual.");
        }
    }

    private void notificarPostores() {
        for (Postor postor : postores) {
            postor.actualizar(mejorOferta, lider);
        }
    }
}
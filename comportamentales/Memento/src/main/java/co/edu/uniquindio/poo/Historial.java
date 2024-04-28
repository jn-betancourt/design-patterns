package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Historial {
      private List<Memento> momentos = new ArrayList<>();

    public void agregarMemento(Memento memento) {
        momentos.add(memento);
    }

    public Memento obtenerMemento(int indice) {
        return momentos.get(indice);
    }
}

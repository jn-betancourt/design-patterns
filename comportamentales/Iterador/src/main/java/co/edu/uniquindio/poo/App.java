package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        NumerosCollection collection = new NumerosCollection(numeros);

        // Usando el iterador para recorrer la colección
        Iterator<Integer> iterador = collection.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
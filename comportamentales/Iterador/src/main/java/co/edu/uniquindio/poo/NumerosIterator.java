package co.edu.uniquindio.poo;

// Clase que implementa el iterador para la colección de números
class NumerosIterator implements Iterator<Integer> {
    private final Integer[] numeros;
    private int indice;

    public NumerosIterator(Integer[] numeros) {
        this.numeros = numeros;
        this.indice = 0;
    }

    @Override
    public boolean hasNext() {
        return indice < numeros.length;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return numeros[indice++];
        }
        throw new IndexOutOfBoundsException("No hay más elementos en la lista.");
    }
}
 
    


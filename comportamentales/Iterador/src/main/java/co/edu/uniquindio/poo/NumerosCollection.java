package co.edu.uniquindio.poo;

// Clase concreta que representa una colección de números
class NumerosCollection implements IterableCollection<Integer> {
    private Integer[] numeros;

    public NumerosCollection(Integer[] numeros) {
        this.numeros = numeros;
    }

    // Método para obtener el iterador
    @Override
    public Iterator<Integer> iterator() {
        return new NumerosIterator();
    }

    // Clase interna que implementa el iterador
    private class NumerosIterator implements Iterator<Integer> {
        private int indice;

        public NumerosIterator() {
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
}
    
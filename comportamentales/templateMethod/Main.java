package templateMethod;

public class Main {
    public static void main(String[] args) {
        Calculo suma = new Suma();
        suma.realizarCalculo();

        Calculo resta = new Resta();
        resta.realizarCalculo();
    }
}
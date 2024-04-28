package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        MediadorSubasta subasta = new Subasta();

        Postor postor1 = new PostorConcreto(subasta, "Postor 1");
        Postor postor2 = new PostorConcreto(subasta, "Postor 2");
        Postor postor3 = new PostorConcreto(subasta, "Postor 3");

        subasta.registrarPostor(postor1);
        subasta.registrarPostor(postor2);
        subasta.registrarPostor(postor3);

        postor1.hacerOferta(100);
        postor2.hacerOferta(150);
        postor3.hacerOferta(200);
    }
}

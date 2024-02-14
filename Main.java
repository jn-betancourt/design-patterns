import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Reserva reserva = new Reserva();
    reserva.setFechaSalida(LocalDate.now());
    reserva.setDestino("Argentina");
    reserva.setDuracion(3);

    System.out.println(reserva);
  }
}
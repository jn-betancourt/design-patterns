import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Reserva reserva = Reserva.builder()
    .destino("Cancun")
    .fechaSalida(LocalDate.now())
    .duracion(15)
    .build();

    System.out.println(reserva);
  }
}
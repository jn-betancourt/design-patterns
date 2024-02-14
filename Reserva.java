import java.time.LocalDate;
import java.util.*;

public class Reserva {
  private LocalDate fechaSalida;
  private String destino;
  private int duracion;
  private TipoAlojamiento alojamiento;
  private Collection<TipoTransporte> transporte;
  private Collection<Actividades> actividades;
  private Collection<Dietas> dieta;

  public Reserva() {
    this.fechaSalida = null;
    this.destino = "";
    this.duracion = 0;
    this.alojamiento = null;
    this.transporte = new ArrayList<TipoTransporte>();
    this.actividades = new ArrayList<Actividades>();
    this.dieta = new ArrayList<Dietas>();
  }

  // Getter and Setter for fechaSalida
  public LocalDate getFechaSalida() {
    return fechaSalida;
  }

  public void setFechaSalida(LocalDate fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  // Getter and Setter for destino
  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  // Getter and Setter for duracion
  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  // Getter and Setter for alojamiento
  public TipoAlojamiento getAlojamiento() {
    return alojamiento;
  }

  public void setAlojamiento(TipoAlojamiento alojamiento) {
    this.alojamiento = alojamiento;
  }

  // Getter and Setter for transporte
  public Collection<TipoTransporte> getTransporte() {
    return transporte;
  }

  public void setTransporte(Collection<TipoTransporte> transporte) {
    this.transporte = transporte;
  }

  // Getter and Setter for actividades
  public Collection<Actividades> getActividades() {
    return actividades;
  }

  public void setActividades(Collection<Actividades> actividades) {
    this.actividades = actividades;
  }

  // Getter and Setter for dieta
  public Collection<Dietas> getDieta() {
    return dieta;
  }

  public void setDieta(Collection<Dietas> dieta) {
    this.dieta = dieta;
  }

  
@Override
public String toString() {
    return String.format("%-15s: %s\n%-15s: %s\n%-5s: %d\n%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %s",
            "Fecha Salida", fechaSalida != null ? fechaSalida.toString() : "",
            "Destino", destino != null ? destino : "",
            "Duracion", duracion,
            "Alojamiento", alojamiento != null ? alojamiento.toString() : "",
            "Transporte", transporte != null ? transporte.toString() : "",
            "Actividades", actividades != null ? actividades.toString() : "",
            "Dieta", dieta != null ? dieta.toString() : "");
}
  
}
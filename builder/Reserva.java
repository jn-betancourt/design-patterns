import java.time.LocalDate;
import java.util.*;

public class Reserva {
  private LocalDate fechaSalida;
  private String destino;
  private int duracion;
  private TipoAlojamiento alojamiento;
  private Collection<TipoTransporte> transporte;
  private Collection<Actividades> actividades;
  private Collection<Dietas> dietas;

  // public Reserva() {
  //   this.fechaSalida = null;
  //   this.destino = "";
  //   this.duracion = 0;
  //   this.alojamiento = null;
  //   this.transporte = new ArrayList<TipoTransporte>();
  //   this.actividades = new ArrayList<Actividades>();
  //   this.dieta = new ArrayList<Dietas>();
  // }

  // The code you provided is a constructor for the `Reserva` class. A constructor is a special method
  // that is used to initialize the object of a class.
  public Reserva(LocalDate fecha, String destino, int duracion, TipoAlojamiento alojamiento, Collection<TipoTransporte>transporte, Collection<Actividades>actividades, Collection<Dietas>dietas){
      this.fechaSalida = fecha;
      this.destino = destino;
      this.duracion = duracion;
      this.alojamiento = alojamiento;
      this.transporte = transporte;
      this.actividades = actividades;
      this.dietas = dietas;
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
  public Collection<Dietas> getDietas() {
    return dietas;
  }

  public void setDietas(Collection<Dietas> dietas) {
    this.dietas = dietas;
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
            "Dieta", dietas != null ? dietas.toString() : "");
}
  
  /**
   * The function returns a new instance of the ReservaBuilder class.
   * 
   * @return The method is returning a new instance of the ReservaBuilder class.
   */
  public static ReservaBuilder builder(){
    return new ReservaBuilder();
  }

  /**
   * The ReservaBuilder class is a builder pattern implementation for creating Reserva objects with
   * various properties.
   */
  public static class ReservaBuilder{
    private LocalDate fechaSalida;
    private String destino;
    private int duracion;
    private TipoAlojamiento alojamiento;
    private Collection<TipoTransporte> transporte;
    private Collection<Actividades> actividades;
    private Collection<Dietas> dietas;

    public ReservaBuilder fechaSalida(LocalDate fechaSalida) {
      this.fechaSalida = fechaSalida;
      return this;
    }

    public ReservaBuilder destino(String destino) {
      this.destino = destino;
      return this;
    }

    public ReservaBuilder duracion(int duracion) {
      this.duracion = duracion;
      return this;
    }

    public ReservaBuilder alojamiento(TipoAlojamiento alojamiento) {
      this.alojamiento = alojamiento;
      return this;
    }

    public ReservaBuilder transporte(Collection<TipoTransporte> transporte) {
      this.transporte = transporte;
      return this;
    }

    public ReservaBuilder actividades(Collection<Actividades> actividades) {
      this.actividades = actividades;
      return this;
    }

    public ReservaBuilder dietas(Collection<Dietas> dietas) {
      this.dietas = dietas;
      return this;
    } 
    
    public Reserva build(){
      return new Reserva(fechaSalida, destino, duracion, alojamiento, transporte, actividades, dietas);
    }

  }

}
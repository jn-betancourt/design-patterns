package co.edu.uniquindio.poo;

public interface ManejadorCompra {
    void setSiguienteManejador(ManejadorCompra siguienteManejador);
    void manejarSolicitud(SolicitudCompra solicitud);
}

package co.edu.uniquindio.poo;

public abstract class ManejadorCompraAbstracto implements ManejadorCompra{
    private ManejadorCompra siguienteManejador;

    @Override
    public void setSiguienteManejador(ManejadorCompra siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    @Override
    public void manejarSolicitud(SolicitudCompra solicitud) {
        if (puedeManejarSolicitud(solicitud)) {
            procesarSolicitud(solicitud);
        } else if (siguienteManejador != null) {
            siguienteManejador.manejarSolicitud(solicitud);
        } else {
            System.out.println("Ningún manejador pudo procesar la solicitud.");
        }
    }

    // Método abstracto que debe ser implementado por las clases concretas
    protected abstract boolean puedeManejarSolicitud(SolicitudCompra solicitud);

    // Método abstracto que debe ser implementado por las clases concretas
    protected abstract void procesarSolicitud(SolicitudCompra solicitud);
}

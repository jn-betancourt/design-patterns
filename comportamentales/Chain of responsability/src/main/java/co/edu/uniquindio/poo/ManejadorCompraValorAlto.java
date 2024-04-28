package co.edu.uniquindio.poo;

public class ManejadorCompraValorAlto extends ManejadorCompraAbstracto {
    @Override
    protected boolean puedeManejarSolicitud(SolicitudCompra solicitud) {
        return true; // Este manejador siempre puede manejar la solicitud
    }

    @Override
    protected void procesarSolicitud(SolicitudCompra solicitud) {
        System.out.println("Solicitud aprobada por el manejador de alto valor.");
    }
    
}

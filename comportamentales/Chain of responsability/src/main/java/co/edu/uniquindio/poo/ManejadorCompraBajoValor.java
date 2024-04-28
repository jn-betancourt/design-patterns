package co.edu.uniquindio.poo;

public class ManejadorCompraBajoValor extends ManejadorCompraAbstracto{
    private static final double MONTO_MAX_APROBACION = 1000.0;

    @Override
    protected boolean puedeManejarSolicitud(SolicitudCompra solicitud) {
        return solicitud.getMonto() <= MONTO_MAX_APROBACION;
    }

    @Override
    protected void procesarSolicitud(SolicitudCompra solicitud) {
        System.out.println("Solicitud aprobada por el manejador de bajo valor.");
    }
}

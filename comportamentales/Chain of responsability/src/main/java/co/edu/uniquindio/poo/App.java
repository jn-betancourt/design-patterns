package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Configuración de la cadena de responsabilidad
        ManejadorCompra manejadorBajoValor = new ManejadorCompraBajoValor();
        ManejadorCompra manejadorValorMedio = new ManejadorCompraValorMedio();
        ManejadorCompra manejadorAltoValor = new ManejadorCompraValorAlto();

        manejadorBajoValor.setSiguienteManejador(manejadorValorMedio);
        manejadorValorMedio.setSiguienteManejador(manejadorAltoValor);

        // Ejemplos de solicitudes de compra
        SolicitudCompra solicitud1 = new SolicitudCompra(500);
        SolicitudCompra solicitud2 = new SolicitudCompra(3000);
        SolicitudCompra solicitud3 = new SolicitudCompra(10000);

        // Procesamiento de solicitudes
        manejadorBajoValor.manejarSolicitud(solicitud1);
        manejadorBajoValor.manejarSolicitud(solicitud2);
        manejadorBajoValor.manejarSolicitud(solicitud3);
    }
}

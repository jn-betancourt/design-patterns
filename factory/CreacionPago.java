package factory;

import java.nio.file.NoSuchFileException;

public class CreacionPago {
    
    public static Pago crearPago(MetodoPago metodoPago) throws NoSuchFileException{

        return switch (metodoPago) {
            case PAYPAL -> new Paypal();
            case TARJETA_CREDITO -> new TarjetaCredito();
            case BITCOIN -> new Bitcoin();
            case APPLE_PAY -> new ApplePay();
            default -> throw new NoSuchFileException("Tipo de pago no encontrado");
        };

    }

}

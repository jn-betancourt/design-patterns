package creational.factory;

import java.nio.file.NoSuchFileException;
import java.util.HashMap;
import java.util.Map;


public class CreacionPago {

    private final static Map<MetodoPago, Pago> pagos =  new HashMap<>(){{
            put(MetodoPago.PAYPAL, new Paypal());
            put(MetodoPago.TARJETA_CREDITO, new TarjetaCredito());
            put(MetodoPago.BITCOIN, new Bitcoin());
            put(MetodoPago.APPLE_PAY, new ApplePay());}};

    public static Pago crearPago(MetodoPago metodoPago) throws NoSuchFileException{

        return pagos.get(metodoPago);

    }

}

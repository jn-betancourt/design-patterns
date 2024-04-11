package creational.factory;

public class Pasarela {
    
    public static void main(String[] args) {
        try{

            Pago nuevoPago = CreacionPago.crearPago(MetodoPago.PAYPAL);
            nuevoPago.generarPago();// Hara el pago como la dependencia correspondiente lo haga.
            
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
    }

}

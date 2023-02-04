import java.time.LocalDate;

public class Platinum  extends TarjetaCredito{
    private String tipoPlatinum;

    public Platinum(String emisor, Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);

    }

    public Platinum(String emisor, Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento, String tipoClasica){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.tipoPlatinum=tipoClasica;
    }
    @Override
    public void imprimir(){
        System.out.println("Emisor: "+ this.getEmisor()+ ". Cupo: "+ this.getCupo() + ". Numero de tarjeta: "+ this.getNumeroTarjeta() + ". CVV: "+ this.getCvv() + ". Fecha de vencimiento: "+ this.getFechaVencimiento() );
    }
}

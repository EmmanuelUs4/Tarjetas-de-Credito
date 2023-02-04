import java.time.LocalDate;

public class Black  extends TarjetaCredito{
    private String tipoBlack;

    public Black(String emisor, Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);

    }

    public Black(String emisor, Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento, String tipoClasica){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.tipoBlack=tipoClasica;
    }

    @Override
    public void imprimir(){
        System.out.println("Emisor: "+ this.getEmisor()+ ". Cupo: "+ this.getCupo() + ". Numero de tarjeta: "+ this.getNumeroTarjeta() + ". CVV: "+ this.getCvv() + ". Fecha de vencimiento: "+ this.getFechaVencimiento() );
    }
}

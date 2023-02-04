import java.time.LocalDate;

public class Dorada  extends TarjetaCredito{


    private String tipoDorada;

    public Dorada(String emisor, Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);

    }

    public Dorada(String emisor, Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento, String tipoClasica){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.tipoDorada=tipoClasica;
    }

    @Override
    public void imprimir(){
        System.out.println("Emisor: "+ this.getEmisor()+ ". Cupo: "+ this.getCupo() + ". Numero de tarjeta: "+ this.getNumeroTarjeta() + ". CVV: "+ this.getCvv() + ". Fecha de vencimiento: "+ this.getFechaVencimiento() );
    }
}

import java.time.LocalDate;

public class Clasica extends TarjetaCredito{

    private String tipoClasica;

    public Clasica(String emisor, Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);

    }

    public Clasica(String emisor, Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento, String tipoClasica){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.tipoClasica=tipoClasica;
    }


    @Override
    public void imprimir(){
        System.out.println("Emisor: "+ this.getEmisor()+ ". Cupo: "+ this.getCupo() + ". Numero de tarjeta: "+ this.getNumeroTarjeta() + ". CVV: "+ this.getCvv() + ". Fecha de vencimiento: "+ this.getFechaVencimiento() );
    }
}


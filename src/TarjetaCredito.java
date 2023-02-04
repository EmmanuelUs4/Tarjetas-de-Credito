
import java.time.LocalDate;


public class TarjetaCredito {
    private String emisor;
    private Long cupo;
    private String numeroTarjeta;
    private int cvv;
    private LocalDate fechaVencimiento;

    public TarjetaCredito() {
    }
    public TarjetaCredito(String emisor,Long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento ) {
        this.emisor=emisor;
        this.cupo=cupo;
        this.numeroTarjeta=numeroTarjeta;
        this.cvv=cvv;
        this.fechaVencimiento=fechaVencimiento;

    }

    public String getEmisor(){
        System.out.println(this.emisor);
        return this.emisor;

    }
    public void setEmisor(String emisor) {
        this.emisor=emisor;
    }




    public Long getCupo() {
        System.out.println(this.cupo);
        return this.cupo;
    }
    public void setCupo(Long cupo) {
        this.cupo=cupo;
    }




    public String getNumeroTarjeta() {
        System.out.println(this.numeroTarjeta);
        return this.numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta=numeroTarjeta;
    }



    public int getCvv() {
        System.out.println(this.cvv);
        return this.cvv;
    }
    public void setCvv(int cvv) {
        this.cvv=cvv;
    }



    public LocalDate getFechaVencimiento() {
        System.out.println(this.fechaVencimiento);
        return this.fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate  fechaVencimiento) {
        this.fechaVencimiento=fechaVencimiento;
    }


    public void imprimir(){
        System.out.println("Emisor: "+ this.getEmisor()+ ". Cupo: "+ this.getCupo() + ". Numero de tarjeta: "+ this.getNumeroTarjeta() + ". CVV: "+ this.getCvv() + ". Fecha de vencimiento: "+ this.getFechaVencimiento() );
    }
}

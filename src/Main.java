import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Clasica tarjeta1 = new Clasica("Alduin", 123L, "123456", 1223, LocalDate.EPOCH);
        tarjeta1.imprimir();
        Dorada tarjeta2 = new Dorada("balduino",  48934L, "5463532412", 2138, LocalDate.EPOCH);
        tarjeta2.imprimir();
    }
}
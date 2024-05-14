import java.util.Date;

public class Reserva {
    private String responsavel;
    private int quantidadePessoas;
    private Date dataReserva;
    private double valorTotal;

    public Reserva(String responsavel, int quantidadePessoas, Date dataReserva, double valorTotal) {
        this.responsavel = responsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    
}

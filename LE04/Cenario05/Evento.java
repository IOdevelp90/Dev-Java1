import java.util.Date;
public class Evento {
    private String nome;
    private Date data;
    private String local;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;

    public Evento(String nome, Date data, String local, int lotacaoMaxima, double precoIngresso){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.ingressosVendidos = 0;
        this.precoIngresso = precoIngresso;  
    }
    
}

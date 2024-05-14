import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoControle {
    private List<Evento> eventos;
    private List<Reserva> reservas;

    public EventoControle() {
        eventos = new ArrayList<>();
        reservas = new ArrayList<>(); // Corrigindo a inicialização
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public boolean realizarReserva(Evento evento, String responsavel, int quantidadePessoas) {
        if (evento != null && evento.getLotacaoMaxima() - evento.getIngressosVendidos() >= quantidadePessoas) {
            double valorTotal = quantidadePessoas * evento.getPrecoIngresso();
            Reserva reserva = new Reserva(responsavel, quantidadePessoas, new Date(), valorTotal); // Supondo que Reserva seja uma classe válida
            reservas.add(reserva);
            evento.setIngressosVendidos(evento.getIngressosVendidos() + quantidadePessoas); // Corrigindo a sintaxe de incremento
            return true;
        }
        return false;
    }
}

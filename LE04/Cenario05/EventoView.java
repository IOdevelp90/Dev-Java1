import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class EventoView {
    private EventoController controller;
    private Scanner scanner;

    public EventoView(EventoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu(){
        System.out.println("Bem vindo ao sistema de controle de eventos");
        System.out.println("Selecione uma opcao");
        System.out.println("1. Adicionar evento ");
        System.out.println("2. Listar eventos");
        System.out.println("3. Realizar reserva");
        System.out.println("0. Sair");
    }

    public void adicionarEvento() {
        System.out.println("informe o nome do evento:");
        String nome = scanner.nextLine();
        System.out.println("informe a data do evento (formato dd/mm/aaaa):");
        String dataStr = scanner.nextLine();
        System.out.println("Informe  o local  do evento:");
        String local = scanner.nextLine();
        System.out.println("Informe a lotacao maxima do evento:");
        int lotacaoMaxima = scanner.nextInt();
        System.out.println("Informe o preço do ingresso:");
        double precoIngresso = scanner.nextDouble();
        scanner.nextLine();

        Date data = null;
        try{
            data = new Date(dataStr);
            
        } catch (Exception e) {
            System.out.println("Formato de data invalido.");
            return;
        }

        Evento evento = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
        controller.adicionarEvento(evento);
        System.out.println("Evento adicionado com sucesso.");
    }

    public void realizarReserva() {
        System.out.println("Informe o nome do evento:");
        String nomeEvento = scanner.nextLine();
        System.out.println("Informe o nome do responsavel pela reserva:");
        String resposavel = scanner.nextLine();
        System.out.println("Informe a quantidade de pessoas:");
        int quantidadePessoas = scanner.nextInt();

        Evento eventoSelecionado = null;
        for(Evento evento : controller.listarEvento()) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)){
                eventoSelecionado = evento;
                break;
            }
        }
        
        if(eventoSelecionado == null) {
            System.out.println("Evento não encontrado.");
        } else {
            if(controller.realizarReserva(eventoSelecionado,resposavel,quantidadePessoas)){
            } else {
                system.out.println("Nao foi possivel realizar a reserva");
            }
        }



    }
    
}

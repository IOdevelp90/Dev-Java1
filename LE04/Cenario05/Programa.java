public class Programa {
    public static void main(String[] args) {
        EventoControle controle = new EventoControle();
        EventoView view = new EventoView(controle);

        while(true) {
            view.exibirMenu();
            int opcao = view.scanner.nextInt();
            view.scanner.nextLine();

            switch (opcao) {
                case 1:
                    view.adicionarEvento();
                    break;
                case 2:
                    view.listarEventos();
                    break;
                case 3:
                    view.realizarReserva();
                    break;

                    case 0:
                    System.out.println("Saindo do sistema.");
                    return;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}

public class Programa {
    public static void main(String[] args) {
        ClienteController controller = new ClienteController();
        ClienteView view = new ClienteView(controller);

        while (true) {
            view.exibirMenu();
            System.out.println("Digite a opção desejada:");
            int opcao = Integer.parseInt(view.Scanner.nextLine());
            view.processarOpcao(opcao);
        }
    }
}

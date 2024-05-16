package br.edu.up.view;
import java.util.Scanner;

public class InstituicaoView {
    private InstituicaoController controller;
    private Scanner scanner;

    public InstituicaoView(InstituicaoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }
    
}

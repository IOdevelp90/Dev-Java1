package br.edu.up;

import java.util.*;

public class Agenda {
    private List<Compromisso> compromissos;

    public Agenda() { 
        compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso compromisso) { 
        compromissos.add(compromisso);
    }

    public void listarCompromisso() {
        if (compromissos.isEmpty()) {
            System.out.println("Não há compromissos agendados.");
        } else {
            System.out.println("Compromissos agendados:");
            for (Compromisso c : compromissos) { // Correção na iteração
                System.out.println("Data: " + c.getDia() + "/" + c.getMes() + "/" + c.getAno() +
                        " - Hora : " + c.getHora() + "h" +
                        " - Pessoa : " + c.getPessoa() +
                        " - Local : " + c.getLocal() + // Correção na concatenação
                        " - Assunto: " + c.getAssunto());
            }
        }
    }
}

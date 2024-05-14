package br.edu.up;

// Classe Programa
public class Programa {
    public static void main(String[] args) {
        // Criando uma agenda
        Agenda agenda = new Agenda();

        // Adicionando compromissos à agenda
        Compromisso compromisso1 = new Compromisso("João", "Cafeteria", "Reunião de Negócios", 10, 9, 5, 2024);
        Compromisso compromisso2 = new Compromisso("Maria", "Escritório", "Apresentação de Projeto", 14, 15, 5, 2024);

        agenda.adicionarCompromisso(compromisso1);
        agenda.adicionarCompromisso(compromisso2);

        // Listando os compromissos
        agenda.listarCompromissos();
    }
}

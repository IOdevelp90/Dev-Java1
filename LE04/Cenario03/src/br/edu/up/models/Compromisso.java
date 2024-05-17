package br.edu.up.models;

public class Compromisso {
    private String assunto;
    private String local;
    private String pessoa;
    private int hora;
    private int[] data; // Vetor para armazenar dia, mês e ano

    // Construtor
    public Compromisso(String assunto, String local, String pessoa, int hora, int[] data) {
        this.assunto = assunto;
        this.local = local;
        this.pessoa = pessoa;
        this.hora = hora;
        this.data = data;
    }

    // Getters e setters
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
}

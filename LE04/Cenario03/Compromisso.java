package br.edu.up;

public class Compromisso {
    
    private String pessoa;
    private String local;
    private String assunto;
    private int hora;
    private int dia;
    private int mes;
    private int ano;

    public Compromisso(String pessoa, String local, String assunto, int hora, int dia, int mes, int ano){
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getPessoa() {
        return pessoa;
    }

    public String getLocal() {
        return local;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getHora() {
        return hora;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }
}

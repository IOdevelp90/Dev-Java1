package br.edu.up.models;

public class Comercial extends Contato {
    private String cnpj;

    public Comercial(int codigo, String nome, String telefone, String cnpj) {
        super(codigo, nome, telefone);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    @Override
    public String toString() {
        return "Comercial [cnpj=" + cnpj + ", " + super.toString() + "]";
    }

}

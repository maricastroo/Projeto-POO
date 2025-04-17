package model;

import java.util.Date;

public class Fornecedor extends Pessoa{
    private String CNPJ;
    private String razaoSocial;
    private String nomeFantasia;

    //construtor
    public Fornecedor(String CNPJ, String razaoSocial, String nomeFantasia, String telefone, String cidade, String estado, String pais, String endereco, Date dataCadastro, String email, String senha, String numero) {
        super(telefone, cidade, estado, pais, endereco, dataCadastro, email, senha, numero);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }


    //get e set do fornecedor
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}

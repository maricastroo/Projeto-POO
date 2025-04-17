package model;

import java.util.Date;

public class Vendedor extends Pessoa {

    //construtor
    public Vendedor(String nome, String sobrenome, Date dataNascimento, String telefone, String CPF, String cidade, String estado, String pais, String endereco, Date dataCadastro, String email, String senha){
        super(nome, sobrenome, dataNascimento, telefone, CPF, cidade, estado, pais, endereco, dataCadastro, email, senha);

    }
}

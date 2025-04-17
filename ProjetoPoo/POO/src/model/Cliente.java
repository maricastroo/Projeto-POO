package model;

import java.util.Date;

//construtor
public class Cliente extends Pessoa{

    //construtor
    public Cliente(String nome, String sobrenome, Date dataNascimento, String telefone, String CPF, String cidade, String pais, String endereco, String numero, Date dataCadastro, String email, String senha){
        super(nome, sobrenome, dataNascimento, telefone, CPF, cidade, pais, endereco, numero, dataCadastro, email, senha);
    }

}

package model;

public class Adm extends Pessoa{
    private int idAdm;

    //construtor
    public Adm(String nome, String email, String senha, int idAdm){
        super(nome, email, senha); //invoca o construtor de pessoa que inicializa nome, email e senha
        this.idAdm = idAdm;
    }

    //get e set
    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }
}

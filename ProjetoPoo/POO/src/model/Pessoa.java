package model;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String telefone;
    private String CPF;
    private String cidade;
    private String estado;
    private String pais;
    private String endereco;
    private Date dataCadastro;
    private String email;
    private String senha;
    private String numero;

    //construtor cliente e vendedor
    public Pessoa(String nome, String sobrenome, Date dataNascimento, String telefone, String CPF, String cidade, String estado, String pais, String endereco, Date dataCadastro, String email, String senha, String numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.CPF = CPF;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.email = email;
        this.senha = senha;
        this.numero = numero;

    }
//construtor fornecedor

    public Pessoa(String telefone, String cidade, String estado, String pais, String endereco, Date dataCadastro, String email, String senha, String numero) {
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.email = email;
        this.senha = senha;
        this.numero = numero;
    }
    //construtor admin

    public Pessoa(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Pessoa(String nome, String sobrenome, Date dataNascimento, String telefone, String CPF, String cidade, String pais, String endereco, String numero, Date dataCadastro, String email, String senha) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

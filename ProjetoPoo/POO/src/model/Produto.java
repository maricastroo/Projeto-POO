package model;

public class Produto {
    private int id;
    private int quantidade;
    private double preco;
    private String descricao;
    private int idFornecedor;


    //construtor
    public Produto(int id, int quantidade, double preco, String descricao, int idFornecedor){
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
        this.idFornecedor = idFornecedor;
    }

    // get e set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
}

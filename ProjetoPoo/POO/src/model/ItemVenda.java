package model;

public class ItemVenda {
    private int id;
    private int idVenda;
    private int idProduto;
    private int quantidade;

    public ItemVenda(int idVenda, int idProduto, int quantidade){
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdVenda() {
        return this.idVenda;
    }
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    public int getIdProduto() {
        return this.idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }

}

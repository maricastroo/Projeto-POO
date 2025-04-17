package model;

public class Venda {
    private int id;
    private int idVenda;
    private int idVendedor;
    private String tipoPagamento;

    //construtor
    public Venda(int id, int idVenda, int idVendedor, String tipoPagamento){
        this.id = id;
        this.idVenda = idVenda;
        this.idVendedor = idVendedor;
        this.tipoPagamento = tipoPagamento;
    }

    //get e set para vendas

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}

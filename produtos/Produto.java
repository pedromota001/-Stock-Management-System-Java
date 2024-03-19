package br.com.pedromota.projeto1POO.produtos;



public class Produto {
    protected int quantidadeEstoque;
    protected String codigoDeBarras;
    protected String nomeProduto;
    protected double precoProduto;
    protected String fornecedor;

    public Produto(String codigoDeBarras, String nomeProduto, double precoProduto, String fornecedor, int quantidadeEstoque) {
        this.codigoDeBarras = codigoDeBarras;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.fornecedor = fornecedor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }


    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nomeProduto + " / Preço: " + this.precoProduto + "/ Código de barras: " + this.codigoDeBarras + "/ Quantidade: " + this.quantidadeEstoque;
    }
}

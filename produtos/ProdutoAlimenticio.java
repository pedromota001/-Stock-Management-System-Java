package br.com.pedromota.projeto1POO.produtos;

import br.com.pedromota.projeto1POO.calculos.CalculaDesconto;

public class ProdutoAlimenticio extends Produto implements CalculaDesconto {
    private String dataDeValidade;


    public ProdutoAlimenticio(String codigoDeBarras, String nomeProduto, double precoProduto, String fornecedor, int quantidadeEstoque, String dataDeValidade) {
        super(codigoDeBarras, nomeProduto, precoProduto, fornecedor, quantidadeEstoque);
        this.dataDeValidade = dataDeValidade;
    }
    public String getDataDeValidade() {
        return dataDeValidade;
    }

    @Override
    public void calculaDesconto(double preco) {
        if(preco < 40){
            precoProduto = preco;
        }
        else if(preco > 40 && preco < 70){
            precoProduto = preco * ((double) 10 / 100);

        }
        else{
            precoProduto = preco * ((double) 20 / 100);
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto + " / Preço: " + precoProduto + " / Código de barras: " + codigoDeBarras + " / Fornecedor: " + fornecedor + " / Quantidade no estoque: " + quantidadeEstoque;
    }
}

package br.com.pedromota.projeto1POO.produtos;

import br.com.pedromota.projeto1POO.calculos.CalculaDesconto;

public class ProdutoHigienico extends Produto implements CalculaDesconto {

    private String indicadoPara;
    private String formaDeUso;
    public ProdutoHigienico(String codigoDeBarras, String nomeProduto, double precoProduto, String fornecedor, int quantidadeEstoque, String indicadoPara, String formaDeUso) {
        super(codigoDeBarras, nomeProduto, precoProduto, fornecedor, quantidadeEstoque);
        this.indicadoPara = indicadoPara;
        this.formaDeUso = formaDeUso;
    }


    @Override
    public String toString() {
        return "Produto: " + nomeProduto +   " / Código de barras: " + codigoDeBarras + " / Preço: " + precoProduto + " / Indicado para: " + indicadoPara + " / Forma de uso: " + formaDeUso + " / Fornecedor: " + fornecedor + " / Quantidade: " + quantidadeEstoque;
    }


    @Override
    public void calculaDesconto(double preco) {
        if(preco < 45){
        }
        else if(preco > 45 && preco < 70){
        }
        else{
        }
    }
}

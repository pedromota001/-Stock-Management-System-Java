package br.com.pedromota.projeto1POO.produtos;

import br.com.pedromota.projeto1POO.calculos.CalculaDesconto;

public class ProdutoEletronico extends Produto implements CalculaDesconto {
    private String modelo;
    private int quantidadeDeMemoria;


    public ProdutoEletronico(String codigoDeBarras, String nomeProduto, double precoProduto, String fornecedor, int quantidadeEstoque, String modelo, int quantidadeDeMemoria) {
        super(codigoDeBarras, nomeProduto, precoProduto, fornecedor, quantidadeEstoque);
        this.modelo = modelo;
        this.quantidadeDeMemoria = quantidadeDeMemoria;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeDeMemoria() {
        return quantidadeDeMemoria;
    }

    @Override
    public void calculaDesconto(double preco) {
        if(preco < 3000){
            precoProduto = preco;
        }
        else if(preco > 3000 && preco < 6000){
        }
        else{
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto +  " / Preço: " + precoProduto + " / Código de barras: " + codigoDeBarras + " / Modelo: " + modelo + " / Memoria do dispositivo: " + quantidadeDeMemoria +
                " / Quantidade no estoque: " + quantidadeEstoque;
    }
}

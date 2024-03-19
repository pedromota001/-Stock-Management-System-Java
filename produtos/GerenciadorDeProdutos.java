package br.com.pedromota.projeto1POO.produtos;

import java.util.ArrayList;
import java.util.Comparator;

public class GerenciadorDeProdutos {
    private ArrayList<Produto> listaDeProdutos;

    public GerenciadorDeProdutos() {
        this.listaDeProdutos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        for(Produto p:listaDeProdutos){
            if(p.getCodigoDeBarras().equalsIgnoreCase(produto.getCodigoDeBarras())){
                System.out.println("Não é possivel adicionar o produto: " + produto + ". O mesmo ja existe");
                return;
            }
        }
        listaDeProdutos.add(produto);
        listaDeProdutos.sort(Comparator.comparing(Produto::getQuantidadeEstoque));
    }

    public void removerProduto(String codigoDeBarras){
        boolean produtoEncontrado = false;
        for(Produto p: listaDeProdutos){
            if(p.getCodigoDeBarras().equalsIgnoreCase(codigoDeBarras)){
                System.out.println("Removendo o produto: " + p.getNomeProduto());
                produtoEncontrado = true;
                listaDeProdutos.remove(p);
                listaDeProdutos.sort(Comparator.comparing(Produto::getQuantidadeEstoque));
                break;
            }
        }
        if(!produtoEncontrado){
            System.out.println("Remoção não foi concluida, o produto não está na lista!");
        }

    }

    public void exibeEstoque(GerenciadorDeProdutos lista){
        System.out.println("Estoque: ");
        for(Produto p: listaDeProdutos){
            System.out.println(p);
        }
    }

    public void atualizaQuantidadeProduto(String codigo, int quantidade){
        boolean achou = false;
        for(Produto p: listaDeProdutos){
            if(p.getCodigoDeBarras().equalsIgnoreCase(codigo)){
                System.out.println("Atualizando a quantidade do produto: " + p.getNomeProduto());
                p.setQuantidadeEstoque(quantidade);
                listaDeProdutos.sort(Comparator.comparing(Produto::getQuantidadeEstoque));
                achou = true;
                break;
            }
        }
        if(!achou){
            System.out.println("Produto não foi encontrado na lista, atualização de quantidade não foi concluída!");
        }
    }

    public void atualizaPrecoProduto(String codigo, double preco){
        boolean achou = false;
        for(Produto p: listaDeProdutos){
            if(p.getCodigoDeBarras().equalsIgnoreCase(codigo)){
                System.out.println("Atualizando o preço do produto: " + p.getNomeProduto());
                p.setPrecoProduto(preco);
                achou = true;
                break;
            }
        }
        if(!achou){
            System.out.println("Produto não foi encontrado na lista, atualização de preço não foi concluída!");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Produto produto : listaDeProdutos) {
            sb.append(produto).append("\n");
        }
        return sb.toString();
    }

    public void exibeFornecedor(){
        System.out.println("Lista de fornecedores do estoque: ");
        for(Produto p: listaDeProdutos){
            System.out.println(p.getFornecedor());
        }
    }
}

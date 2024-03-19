package br.com.pedromota.projeto1POO;

import br.com.pedromota.projeto1POO.produtos.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        GerenciadorDeProdutos listaProdutos = new GerenciadorDeProdutos();
        Scanner scanner = new Scanner(System.in);
        int resp;
        int tipoDeProduto;
        do{
            try {
                System.out.println(""" 
                Gerenciamento de estoque
                ----------------------------------------
                ----------------------------------------
                Escolha uma opção:
                 
                Opção 1 - Adicionar item ao estoque
                Opção 2 - Remover item do estoque
                Opção 3 - Atualizar quantidade do produto no estoque
                Opção 4 - Atualizar preço de produto no estoque
                Opção 5 - Exibir lista de Produtos
                Opção 6 - Exibir lista de fornecedores
                Opção 7 - Sair do gerenciador de estoque
                -----------------------------------------
                -----------------------------------------
                        """);
                resp = scanner.nextInt();

                switch (resp){
                    case 1:
                        System.out.println("OBS: Dependendo do valor do produto, desconto incluído automaticamente no sistema. ");
                        System.out.println("Qual tipo de produto você deseja inicializar? ");
                        System.out.println("""
                                1 - Produto alimentício
                                2 - Produto eletrônico
                                3 - Produto higiênico
                                """);
                        tipoDeProduto = scanner.nextInt();
                        if(tipoDeProduto == 1){
                            System.out.println("Digite o codigo de barras do produto: [8 digitos] ");
                            String codigoAdicionarAlimento = scanner.next();
                            if(codigoAdicionarAlimento.length() != 8){
                                System.out.println("Código de barras inválido, digite 8 digitos: ");
                                codigoAdicionarAlimento = scanner.next();
                            }
                            scanner.nextLine();

                            System.out.println("Digite o nome do produto: ");
                            String nomeAlimenticio = scanner.nextLine();

                            System.out.println("Digite o preço do produto: ");
                            double precoAlimenticio = scanner.nextDouble();
                            scanner.nextLine();


                            System.out.println("Digite o fornecedor desse produto: ");
                            String fornecedorAlimenticio = scanner.nextLine();


                            System.out.println("Digite a quantidade no estoque que esse produto terá: ");
                            int quantidadeAdicionaAlimenticio = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Digite a data de validade desse produto: ");
                            String dataDeValidade = scanner.nextLine();

                            ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio(codigoAdicionarAlimento, nomeAlimenticio, precoAlimenticio, fornecedorAlimenticio, quantidadeAdicionaAlimenticio, dataDeValidade);
                            produtoAlimenticio.calculaDesconto(precoAlimenticio);
                            listaProdutos.adicionarProduto(produtoAlimenticio);
                            break;
                        }
                        else if(tipoDeProduto == 2){
                            System.out.println("Digite o codigo de barras do produto: [8 digitos]");
                            String codigoAdicionarEletro = scanner.next();
                            if(codigoAdicionarEletro.length() != 8){
                                System.out.println("Código de barras inválido, digite 8 digitos: ");
                                codigoAdicionarEletro = scanner.next();
                            }
                            scanner.nextLine();

                            System.out.println("Digite o nome do produto: ");
                            String nomeEletro = scanner.nextLine();

                            System.out.println("Digite o preço do produto: ");
                            double precoEletro = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Digite o fornecedor desse produto: ");
                            String fornecedorEletro = scanner.nextLine();

                            System.out.println("Digite a quantidade no estoque que esse produto terá: ");
                            int quantidadeAdicionaEletro = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Digite o modelo desse eletrônico: ");
                            String modelo = scanner.nextLine();

                            System.out.println("Digite a quantidade de memória do dispositivo: ");
                            int qtdMemoria = scanner.nextInt();
                            scanner.nextLine();

                            ProdutoEletronico produtoEletronico = new ProdutoEletronico(codigoAdicionarEletro, nomeEletro, precoEletro, fornecedorEletro, quantidadeAdicionaEletro, modelo, qtdMemoria);
                            produtoEletronico.calculaDesconto(precoEletro);
                            listaProdutos.adicionarProduto(produtoEletronico);
                            break;
                        }
                        else{
                            System.out.println("Digite o codigo de barras do produto: [8 digitos] ");
                            String codigoAdicionarHigiene = scanner.next();
                            if(codigoAdicionarHigiene.length() != 8){
                                System.out.println("Código de barras inválido, digite 8 digitos: ");
                                codigoAdicionarHigiene = scanner.next();
                            }
                            scanner.nextLine();

                            System.out.println("Digite o nome do produto: ");
                            String nomeHigiene = scanner.nextLine();

                            System.out.println("Digite o preço do produto: ");
                            double precoHigiene = scanner.nextDouble();
                            scanner.nextLine();


                            System.out.println("Digite o fornecedor desse produto: ");
                            String fornecedorHigiene = scanner.nextLine();

                            System.out.println("Digite a quantidade no estoque que esse produto terá: ");
                            int quantidadeAdicionaHigiene = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Digite para que esse produto é indicado: ");
                            String indicado = scanner.nextLine();

                            System.out.println("Digite qual forma de uso do produto: ");
                            String formaDeUso = scanner.nextLine();

                            ProdutoHigienico produtoHigienico = new ProdutoHigienico(codigoAdicionarHigiene, nomeHigiene, precoHigiene, fornecedorHigiene, quantidadeAdicionaHigiene, indicado, formaDeUso);
                            produtoHigienico.calculaDesconto(precoHigiene);
                            listaProdutos.adicionarProduto(produtoHigienico);
                            break;
                        }

                    case 2:
                        listaProdutos.exibeEstoque(listaProdutos);
                        System.out.println("Digite o código de barras do produto a ser removido: ");
                        String codigoRemover = scanner.next();
                        scanner.nextLine();
                        listaProdutos.removerProduto(codigoRemover);
                        break;
                    case 3:
                        listaProdutos.exibeEstoque(listaProdutos);
                        System.out.println("Digite o código de barras do produto que será atualizado a quantidade no estoque: ");
                        String codigoAtualiza = scanner.next();
                        scanner.nextLine();
                        System.out.println("Digite a nova quantidade no estoque desse produto: ");
                        int quantidadeAtualizaQtd = scanner.nextInt();
                        listaProdutos.atualizaQuantidadeProduto(codigoAtualiza, quantidadeAtualizaQtd);
                        break;

                    case 4:
                        listaProdutos.exibeEstoque(listaProdutos);
                        System.out.println("Digite o código de barras do produto que será atualizado o preço no estoque: ");
                        String codigoAtualizaPreco = scanner.next();
                        scanner.nextLine();
                        System.out.println("Digite o novo preço do produto: ");
                        double precoAtualiza = scanner.nextDouble();
                        listaProdutos.atualizaPrecoProduto(codigoAtualizaPreco, precoAtualiza);
                        break;

                    case 5:
                        System.out.println("Exibindo lista...");
                        listaProdutos.exibeEstoque(listaProdutos);
                        break;
                    case 6:
                        listaProdutos.exibeFornecedor();
                        break;

                    case 7:
                        System.out.println("Finalizando gerenciador de estoque...");
                        break;
                }
            }catch (Exception e){
                System.out.println("Erro! Entrada inválida!");
                break;
            }
        }while(resp != 7);
    }
}




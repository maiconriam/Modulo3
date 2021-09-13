package br.com.zup.Aula1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1_Revisão {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, Double> produto = new HashMap<String, Double>();

        boolean menu = true;
        int numeroDigitado;

        while (menu == true){
            //Bem vindo ao menu
            System.out.println("Digite 1: Para cadastrar um produto.");
            System.out.println("Digite 2: Para exibir a lista de produtos cadastrados.");
            System.out.println("Digite 3: Para excluir um produto.");
            System.out.println("digite 4: Para sair do programa.");
            numeroDigitado = leitor.nextInt();
            leitor.nextLine();

            if (numeroDigitado == 1){
                //Adicionar um produto
                System.out.println("Por favor, digite o nome do produto: ");
                String nomeDoProduto = leitor.nextLine();
                System.out.println("Por favor, digite o valor do produto: ");
                Double valorDoProduto = leitor.nextDouble();

                produto.put(nomeDoProduto, valorDoProduto);
            }
            if (numeroDigitado == 2){
                for (String listaDeProduto : produto.keySet()){
                    System.out.println("Nome do Produto: " + listaDeProduto + ", Valor do Produto: " + produto.get(listaDeProduto));
                }
            }
            if (numeroDigitado == 3){
                System.out.println("Por favor, digite o nome do produto para ser excluido");
                String produtoExcluido = leitor.nextLine();
                if (produto.containsKey(produtoExcluido)){
                    System.out.println("Produto excluido com sucesso.");
                    produto.remove(produtoExcluido);
                }else{
                    System.out.println("Produto não registrado.");
                }
            }
            if (numeroDigitado == 4){
                menu = false;
                System.out.println("Programa finalizado.");
            }
        }
    }
}

package br.com.zup.Aula1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3_Revisão {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> prato = new HashMap<String, String>();

        int menu = 1;
        int escolhaMenu = 0;
        int contador = 1;
        String ingredientesDigitado = "";

        while (menu != 4) {
            System.out.println("Digite 1: Para cadastrar um prato");
            System.out.println("Digite 2: Para exibir a lista de pratos");
            System.out.println("Digite 3: Para excluir um prato");
            System.out.println("Digite 4: Para finalizar o programa");
            escolhaMenu = leitor.nextInt();
            leitor.nextLine();
            if (escolhaMenu == 1) {
                System.out.println("Por favor, digite o nome do prato: ");
                String nomeDoPrato = leitor.nextLine();
                System.out.println("Por favor, digite quantos ingredientes tem no prato: ");
                int numeroIngredientes = leitor.nextInt();
                leitor.nextLine();

                while (contador <= numeroIngredientes) {
                    System.out.println("Por favor, digite os ingredientes do prato(Por favor colocar um virgula no final)");
                    String ingredientes = leitor.nextLine();
                    ingredientesDigitado = ingredientesDigitado + ingredientes + ", ";
                    prato.put(nomeDoPrato, ingredientesDigitado);
                    contador++;
                }
            }
            if (escolhaMenu == 2) {
                for (String listaDePratos : prato.keySet()) {
                    System.out.println("Nome do Prato: " + listaDePratos + ", Ingredientes: " + prato.get(listaDePratos));
                }

            }
            if (escolhaMenu == 3) {
                System.out.println("Por favor, digite o nome do prato");
                String pratoExcluido = leitor.nextLine();
                if (prato.containsKey(pratoExcluido)) {
                    System.out.println("Prato excluido com sucesso.");
                    prato.remove(pratoExcluido);
                } else {
                    System.out.println("Prato não cadastrado.");
                }
            }
            if (escolhaMenu == 4) {
                menu = 4;
                System.out.println("Programa finalizado.");
            }
        }
    }
}

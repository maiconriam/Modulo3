package br.com.zup.Aula1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2_Revisão {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, Double> canditado = new HashMap<String, Double>();

        int menu = 1;
        int escolhaMenu = 0;

        while (menu != 4){
            System.out.println("Digite 1: Para cadastrar um candidato");
            System.out.println("Digite 2: Para exibir a lista de candidato");
            System.out.println("Digite 3: Para excluir um candidato");
            System.out.println("Digite 4: Para finalizar o programa");
            escolhaMenu = leitor.nextInt();
            leitor.nextLine();

            switch (escolhaMenu){
                case 1:
                    System.out.println("Por favor, digite o número da matrícula do candidato: ");
                    String matricula = leitor.nextLine();
                    System.out.println("Por favor, digite a nota do candidato: ");
                    Double notaCandidato = leitor.nextDouble();

                    canditado.put(matricula, notaCandidato);
                    break;
                case 2:
                    for (String listaDeCanditado : canditado.keySet()){
                        System.out.println("Número da matrícula: " + listaDeCanditado + ", Nota: " + canditado.get(listaDeCanditado));
                    }
                    break;
                case 3:
                    System.out.println("Por favor, digite a matrícula que você quer excluir");
                    String matriculaExcluida = leitor.nextLine();
                    if (canditado.containsKey(matriculaExcluida)){
                        System.out.println("Matrícula excluida com sucesso.");
                        canditado.remove(matriculaExcluida);
                    }else{
                        System.out.println("Matrícula não cadastrada.");
                    }
                    break;
                case 4 :
                    System.out.println("Programa finalizado");
                    menu = 4;
                    break;
                default:
                    System.out.println("Número invalido.");
                    break;
            }
        }
    }
}

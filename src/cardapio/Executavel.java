package cardapio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executavel {
    public static void menu() {
        System.out.println("Cardápio");
        System.out.println("1. Adicionar prato à lista.");
        System.out.println("2. Exibir lista de pratos.");
        System.out.println("3. Excluir prato.");
        System.out.println("4. Sair.");
    }

    public static Prato adicionar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome  do prato e tecle enter.");
        String nome = input.nextLine();
        System.out.println("digite os ingredientes do prato e tecle enter.");
        String ingredientes = input.nextLine();
        return new Prato(nome, ingredientes);
    }

    public static void excluir(List<Prato> listaDePratos) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do prato e tecle enter");
        String nome = input.next();
        for (int i = 0; i < listaDePratos.size(); i++) {
            if (listaDePratos.get(i).getNome().contains(nome)) {
                listaDePratos.remove(i);
                System.out.println("Cardápio \n" + "CPrato excluído.");
                System.out.println(listaDePratos);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Prato> listaDePratos = new ArrayList<>();
        boolean sair;
        while (sair = true) {
            menu();
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    Prato prato = adicionar();
                    listaDePratos.add(prato);
                    break;
                case 2:
                    System.out.println(listaDePratos);
                    break;
                case 3:
                    excluir(listaDePratos);
                    break;
                case 4:
                    sair = false;
                    System.out.println("Programa terminado, obrigado pela preferência!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}


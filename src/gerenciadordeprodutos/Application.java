package gerenciadordeprodutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void menu(){
        System.out.println("Gerenciador de produtos");
        System.out.println("1. Adicionar produto à lista.");
        System.out.println("2. Exibir lista de produtos");
        System.out.println("3. Excluir produto.");
        System.out.println("4. Sair.");

    }
    public  static Produto adicionar() {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto e tecle enter.");
        String  nome = input.next();
        System.out.println("Digite o preço do produto e tecle enter.");
       double preco = input.nextDouble();
       return new Produto(nome, preco);
    }

    public static void  excluir(List<Produto> listaDeProdutos) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto e tecle enter");
        String nome = input.next();
   for (int i = 0; i < listaDeProdutos.size(); i++) {
       if (listaDeProdutos.get(i).getNome().contains(nome)) {
           listaDeProdutos.remove(i);
           System.out.println( "gerenciador de produtos\n" +  "Produto excluído");
           System.out.println(listaDeProdutos);
           break;
       }
   }
    }

    public static void main(String[] args) {
        int opcao;
        Scanner input = new Scanner(System.in);
        List<Produto> listaDeProdutos = new ArrayList<>();
        do {
        menu();
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                Produto produto = adicionar();
                listaDeProdutos.add(produto);
                break;
            case 2:
                System.out.println(listaDeProdutos);
                break;
            case  3:
                excluir(listaDeProdutos);
                break;
            default:
                System.out.println("Opção inválida");
        }

        }while (opcao <= 4);

    }
}

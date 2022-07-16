import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void menu(){
        System.out.println("Gerenciador de produtos");
        System.out.println("1. Adiciona produto");
        System.out.println("2. Exibe lista");
        System.out.println("3. Exclui produto");
        System.out.println("4. Sair");


    }
    public  static Produto adiciona() {

        Scanner input = new Scanner(System.in);
        System.out.println("Nome do produto:" );
        String  nome = input.next();
        System.out.println("preço");
       double preco = input.nextDouble();
       return new Produto(nome, preco);
    }

    public static void  exclui(List<Produto> listaDeProdutos) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do produto");
        String nome = input.next();
   for (int i = 0; i < listaDeProdutos.size(); i++) {
       if (listaDeProdutos.get(i).getNome().contains(nome)) {
           listaDeProdutos.remove(i);
           System.out.println("Produto excluído");
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
                Produto produto = adiciona();
                listaDeProdutos.add(produto);
                break;
            case 2:
                System.out.println(listaDeProdutos);
                break;
            case  3:
                exclui(listaDeProdutos);
                break;
            default:
                System.out.println("Opção inválida");
        }

        }while (opcao <= 4);

    }
}

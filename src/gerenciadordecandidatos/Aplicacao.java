package gerenciadordecandidatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public  static void menu() {
        System.out.println("Gerenciador de candidatos");
        System.out.println("1. Adicionar candidato a lista.");
        System.out.println("2. Exibir lista de candidatos.");
        System.out.println("3. Excluir candidato.");
        System.out.println("4. Sair.");
    }

    public static Candidato adicionar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de matrícula do candidato e tecle enter.");
        String numeroDeMatricula = input.next();
        System.out.println("digite a nota do candidato e tecle enter.");
        double nota = input.nextDouble();
        return new Candidato(numeroDeMatricula, nota);
    }

    public static void excluir(List<Candidato> listaDeCandidatos) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de matrícula do candidato e tecle enter");
        String numeroDeMatricula = input.next();
        for (int i = 0; i < listaDeCandidatos.size(); i++) {
            if (listaDeCandidatos.get(i).getNumeroDeMatricula().contains(numeroDeMatricula)) {
                listaDeCandidatos.remove(i);
                System.out.println("Gerenciador de candidatos\n" + "Candidato excluído.");
                System.out.println(listaDeCandidatos);
            break;
            }
        }
    }

    public static void main(String[] args) {


        int opcao;
        Scanner input = new Scanner(System.in);
        List <Candidato> listaDeCandidatos = new ArrayList<>();
do {
    menu();
    opcao = input.nextInt();
switch (opcao) {
    case 1:
        Candidato candidato = adicionar();
listaDeCandidatos.add(candidato);
break;
    case 2:
        System.out.println(listaDeCandidatos);
        break;
    case 3:
        excluir(listaDeCandidatos);
        break;
    default:
        System.out.println("Opção inválida");
}
}while (opcao <= 4);


    }
            }

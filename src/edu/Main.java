
import java.util.Scanner;

import projeto.Ajuda;
import projeto.Cliente;
import projeto.Vendedor;
import projeto.metodoPagamento;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("MENU:");
            System.out.println("1 - Opação Cliente");
            System.out.println("2 - Opção vendedor");
            System.out.println("3 - Metodo de pagamento");
            System.out.println("4 - Me ajude!");

            System.out.println("0 - Sair");

            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumindo o caractere de quebra de linha deixado pelo nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("\nOPÇAÕ DO CLIENTE");
                    Cliente.opcaoCliente();
                    System.out.println("Cliente cadastrado com suces2so!\n");
                    break;
                case 2:
                    System.out.println("\nOPÇÃO D0 VENDEDOR");
                    Vendedor.opcaovendedor();
                    System.out.println("Vendedor cadastrado com sucesso!\n");
                    break;

                case 3:
                    metodoPagamento.metodoPag();
                    break;
                case 4:
                    System.out.println("\nOPÇÃO DE AJUDA AO CLIENTE");
                    Ajuda.exibirMenu();
                    break;

                case 0:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

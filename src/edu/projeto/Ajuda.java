package projeto;

import java.util.Scanner;

public class Ajuda {
public static void exibirMenu() {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("Bem-vindo ao sistema de ajuda ao cliente");
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Dúvidas sobre produtos");
        System.out.println("2 - Dúvidas sobre entregas");
        System.out.println("3 - Falar com um atendente");
        System.out.println("0 - Sair");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                exibirDicasProdutos();
                break;
            case 2:
                exibirDicasEntregas();
                break;
            case 3:
                falarAtendente();
                break;
            case 0:
                System.out.println("Obrigado por utilizar nosso sistema de ajuda ao cliente");
                break;
            default:
                System.out.println("Opção inválida. Digite novamente.");
        }

    } while (opcao != 0);
}

public static void exibirDicasProdutos() {
    System.out.println("----- Dicas sobre produtos -----");
    System.out.println("1. Consulte as especificações técnicas antes de comprar");
    System.out.println("2. Verifique as avaliações de outros clientes antes de comprar");
    System.out.println("3. Caso o produto apresente defeito, entre em contato com o suporte técnico");

}

public static void exibirDicasEntregas() {
    System.out.println("----- Dicas sobre entregas -----");
    System.out.println("1. Confira o endereço de entrega antes de finalizar a compra");
    System.out.println("2. Acompanhe o status do seu pedido no site ou aplicativo");
    System.out.println("3. Caso haja atraso na entrega, entre em contato com o atendimento ao cliente");
}

public static void falarAtendente() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Você será direcionado para um atendente. Aguarde...");
    System.out.println("Por favor, digite sua mensagem:");
    String mensagem = scanner.nextLine();

    System.out.println("Mensagem enviada. Aguarde a resposta do atendente.");
}
}
package projeto;

import java.util.Scanner;

public class Cliente {

    private String nome;
    private String email;
    private String senha;
    private int id;

    public Cliente(String nome, String email, String senha, int id) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = id;
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // função de cadastro

    public static Cliente cadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha do cliente: ");
        String senha = scanner.nextLine();

        System.out.print("Digite o ID do cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, senha, id);
        // aqui poderiamos salvar os dados em um banco de dados ou em um arquivo
        return cliente;
    }

    // função para exibir os dados do cliente

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getSenha());
        System.out.println("ID: " + getId());

    }

    public static void opcaoCliente() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Cliente cliente = null;
        do {
            System.out.println("MENU DO CLIENTE:");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Realizar compra");
            System.out.println("3 - exibir dados pessoais");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nREALIZAR CADASTRO");
                    cliente = Cliente.cadastro(); // atribuir novo cliente ao objeto cliente
                    break;
                case 2:
                    System.out.println("\nREALIZAR COMPRAS");
                    Produto.produto();
                    break;
                case 3:
                    System.out.println("\nEXIBIR DADOS PESSOAIS");
                    if (cliente != null) {
                        cliente.exibirDados(); // chamar o método "exibirDados" do objeto "cliente"
                    } else {
                        System.out.println("Cliente não cadastrado.");
                    }
                    break;
                case 0:
                    System.out.println("\nSaindo do menu do cliente...");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
        } while (opcao != 0);

        
    }

}

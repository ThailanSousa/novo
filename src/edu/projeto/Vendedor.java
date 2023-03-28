package projeto;

import java.util.Scanner;

public class Vendedor {

    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String cnpj;

    public Vendedor(String nome, String email, String telefone, String cpf, String cnpj) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public static void opcaovendedor() {
        Scanner scanner = new Scanner(System.in);
    
        Vendedor vendedor = null; // Cria a variável de referência do tipo Vendedor
    
        int opcao = 0;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar vendedor");
            System.out.println("2. Visualizar vendedor");
            System.out.println("0 - Sair");
    
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do vendedor:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o email do vendedor:");
                    String email = scanner.nextLine();
                    System.out.println("Digite o telefone do vendedor:");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite o CPF do vendedor:");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite o CNPJ do vendedor:");
                    String cnpj = scanner.nextLine();
                    vendedor = new Vendedor(nome, email, telefone, cpf, cnpj);
                    System.out.println("Vendedor cadastrado com sucesso!");
                    break;
                case 2:
                    if (vendedor != null) { // Verifica se o vendedor foi cadastrado anteriormente
                        System.out.println("Nome: " + vendedor.getNome());
                        System.out.println("Email: " + vendedor.getEmail());
                        System.out.println("Telefone: " + vendedor.getTelefone());
                        System.out.println("CPF: " + vendedor.getCPF());
                        System.out.println("CNPJ: " + vendedor.getCNPJ());
                    } else {
                        System.out.println("Vendedor não cadastrado.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
    
        } while (opcao != 0);
    }
    

}

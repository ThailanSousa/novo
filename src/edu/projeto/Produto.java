package projeto;

import java.util.Scanner;

public class Produto {
    private String nome;
    private int controle;
    private int qualidade;
    private int estoque;
    private double preco;

    public Produto(String nome, int controle, int qualidade, int estoque, double preco) {
        this.nome = nome;
        this.controle = controle;
        this.qualidade = qualidade;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getControle() {
        return controle;
    }

    public void setControle(int controle) {
        this.controle = controle;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void produto() {
        String[] eletronicos = { "TV 4K", "Notebook Dell", "Smartphone Samsung", "Tablet Apple", "Fone de ouvido Sony",
        "Caixa de som JBL", "Câmera Canon", "Console PlayStation 5", "Impressora HP", "Roteador Wi-Fi" };
        double[] precos = { 3999.99, 5999.99, 2799.99, 1999.99, 499.99, 899.99, 2999.99, 4999.99, 399.99, 149.99 };

    for (int i = 0; i < eletronicos.length; i++) {
            System.out.println(eletronicos[i] + ": " + precos[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 10:");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Produto: " + eletronicos[numero - 1] + "\nPreço: R$" + precos[numero - 1]);
        } else {
            System.out.println("Número inválido.");
        }
    }

}

package projeto;

import java.util.Scanner;

public class metodoPagamento {
	
	private String debito;
	private String credito;
	private String boleto;
	private String pix;
	private String transferencia;
	
	public metodoPagamento(String debito, String credito, String boleto, String pix, String transferencia) {
        this.debito = debito;
        this.credito = credito;
        this.boleto = boleto;
        this.pix = pix;
        this.transferencia = transferencia;
	}

	 public String getDebito() {
	        return debito;
	    }

	    public void setDebito(String debito) {
	        this.debito = debito;
	    }

	    public String getCredito() {
	        return credito;
	    }

	    public void setCredito(String credito) {
	        this.credito = credito;
	    }

	    public String getBoleto() {
	        return boleto;
	    }

	    public void setBoleto (String boleto) {
	        this.boleto = boleto;
	    }

	    public String getPix() {
	        return pix;
	    }

	    public void setPix(String pix) {
	        this.pix = pix;
	    }

	    public String getTransferencia() {
	        return transferencia;
	    }

	    public void setTransferencia(String transferencia) {
	        this.transferencia = transferencia;
	    }
        public static void metodoPag() {
		
		 Scanner scanner = new Scanner(System.in);
	       
         int opcao  = 0;
         do{
         System.out.println("Selecione uma opção de pagamento:");
	        System.out.println("1. Debito");
	        System.out.println("2. Crédito");
	        System.out.println("3. boleto");
	        System.out.println("4. pix");
	        System.out.println("5. transferencia");

            System.out.println("0 - Sair");

	        opcao = scanner.nextInt();
            scanner.nextLine();
	        switch (opcao) {
	            case 1:
	                System.out.println("Digite o nome do banco:");
	                String banco = scanner.next();
	                System.out.println("Informe a bandeira do cartão:");
	                String bandeira = scanner.next();
	                System.out.println("Digite o nome impresso no cartão:");
	                String nomecartao = scanner.next();
	                System.out.println("Digite a senha do cartão:");
	                String senha = scanner.next();
	                System.out.println("Compra efetuada com sucesso!");
	                
	                System.out.println("O banco selecionado foi: " + banco);
	                System.out.println("A bandeira do cartão é: " + bandeira);
	                System.out.println("O nome impresso no cartão é: " + nomecartao);
	                break;
	            case 2:
	                System.out.println("Digite o nome do banco:");
	                String banco1 = scanner.next();
	                System.out.println("Informe a bandeira do cartão:");
	                String bandeira1 = scanner.next();
	                System.out.println("Digite o nome impresso no cartão:");
	                String nomecartao1 = scanner.next();
	                System.out.println("Digite o cvv do cartão:");
	                String cvv = scanner.next();
	                System.out.println("Digite a senha do cartão:");
	                String senha1 = scanner.next();
	                
	                
	                System.out.println("O banco selecionado foi: " + banco1);
	                System.out.println("A bandeira do cartão é: " + bandeira1);
	                System.out.println("O nome impresso no cartão é: " + nomecartao1);
	                System.out.println("Compra efetuada com sucesso!");
	                break;
	             case 3:
	                System.out.println("Informe o valor da compra:");
	                String valor = scanner.next();
	                System.out.println("Compra efetuada com sucesso!");
	                System.out.println("Compra no valor de: " + valor);
	                break;
	             case 4:
	                System.out.println("Informe o nome do banco: ");
	                String banco2 = scanner.next();
	                System.out.println("Informe o valor do pix: ");
	                String valor2 = scanner.next();
	                System.out.println("Digite a senha da conta: ");
	                String senhabanco = scanner.next();
	                
	                System.out.println("O banco selecionado foi: " + banco2);
	                System.out.println("O valor do pix foi: " + valor2);
	                System.out.println("Compra efetuada com sucesso!");
	                break;
	             case 5:
	                System.out.println("Informe o nome do banco:");
	                String nomebanco = scanner.next();
	                System.out.println("Informe a conta: ");
	                String conta = scanner.next();
	                System.out.println("Informe a agência: ");
	                String agencia = scanner.next();
	                System.out.println("Informe o valor da transferencia: ");
	                String valor3 = scanner.next();
	                System.out.println("Transferencia efetuada com sucesso!");
	                
	                System.out.println("O banco selecionado foi: " + nomebanco);
	                System.out.println("conta e agência: " + conta + agencia);
	                System.out.println("A transferência foi no valor de: " + valor3);
	                default:
	                System.out.println("Opção inválida!");
	                break;
	        }
            
        
            
	    }  while(opcao != 0 );
		
	}   

}
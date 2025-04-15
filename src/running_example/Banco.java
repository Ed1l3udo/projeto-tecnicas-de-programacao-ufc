package running_example;

public class Banco {
	private Conta[] contas;
	private int indice = 0;
	
	public Banco() {
		contas = new Conta[100];
	}
	
	public void cadastrar(Conta conta) {
		contas[indice] = conta;
		indice++;
	}
	
	private Conta procurar(String numero) {
		int i = 0;
		boolean encontrou = false;
		while(!encontrou && i < indice) {
			if(contas[i].getNumero() == numero) {
				encontrou = true;
			}else {
				i++;
			}
		}
		if(encontrou) {
			return contas[i];
		}else {
			return null;
		}
	}
	
	public void creditar(String numero, double valor) {
		Conta conta = procurar(numero);
		if(conta == null) {
			System.out.println("Conta inexistente");
		}else {
			conta.creditar(valor);
		}
	}
	
	public void debitar(String numero, double valor) {
		Conta conta = procurar(numero);
		if(conta == null) {
			System.out.println("Conta inexistente");
		}else {
			conta.debitar(valor);
		}
	}
	
	public double saldo(String numero) {
		Conta conta = procurar(numero);
		if(conta == null) {
			System.out.println("Conta inexistente");
			return 0;
		}else {
			return conta.getSaldo();
		}
	}
	
	public void transferir(String origem, String destino, double valor) {
		Conta contaOrigem = procurar(origem);
		Conta contaDestino = procurar(destino);
		if(contaOrigem == null) {
			System.out.println("Conta remetente inexistente");
		}
		if(contaDestino == null) {
			System.out.println("Conta destinatária inexistente");
		}
		if(contaDestino != null && contaOrigem != null) {
			contaOrigem.debitar(valor);
			contaDestino.creditar(valor);
		}
	}
}

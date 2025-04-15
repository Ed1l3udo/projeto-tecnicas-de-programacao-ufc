package bankSys;

import br.ufc.dc.tp.banco.contas.Conta;

public class Main {
	public static void main(String args[]) {
		Conta conta;
		conta = new Conta("21.342-7");
		conta.creditar(500.87);
		conta.debitar(45);
		System.out.println("O saldo é: " + conta.getSaldo());
	}
}

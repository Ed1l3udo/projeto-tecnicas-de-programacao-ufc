package br.ufc.dc.tp.banco.contas;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(String numero) {
		super(numero);
	}
	
	public void renderJuros(double taxa) {
		creditar(getSaldo() * taxa);
	}
	
	
}

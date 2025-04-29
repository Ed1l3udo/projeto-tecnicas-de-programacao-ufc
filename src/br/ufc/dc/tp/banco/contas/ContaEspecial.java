package br.ufc.dc.tp.banco.contas;

public class ContaEspecial extends Conta {
	public double bonus; 
	public ContaEspecial(String numero) {
		super(numero);
		bonus = 0;
	}
	
	public void renderBonus() {
		super.creditar(bonus);
		bonus = 0;
	}
	
	public void creditar(double valor) {
		super.creditar(valor);
		bonus += valor * 0.01;
	}
	
}
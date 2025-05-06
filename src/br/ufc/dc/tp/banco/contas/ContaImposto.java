package br.ufc.dc.tp.banco.contas;


public class ContaImposto extends Conta {
	public ContaImposto(String numero) {
		super(numero);
	}
	
	public void debitar(double valor) {
		super.debitar(valor + valor * 0.001);
	}
}

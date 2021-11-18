package implementacao;

import beans.ContaCorrente;

public class ImplementarCC {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		
		cc.setAgencia(2021);
		cc.setNumero(101521);
		
		cc.deposito(500);
		cc.extrato();
		
		cc.deposito(100);
		cc.extrato();
		
		cc.saque(1000);
		cc.extrato();

	}

}

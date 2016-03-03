public class ContaBancaria2{

	int agencia, contaCorrente;
	double saldo, limiteExtra;
	String titularConta;
	
	public void imprimirSaldo(){
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void imprimirSaldoTotal(){
		System.out.println("Saldo Total: " + this.saldo + this.limiteExtra);
	}

	public void imprimirAgencia(){
		System.out.println("A Agencia é: " + this.agencia);
	}
	public void imprimirContaCorrente(){
		System.out.println("A Conta Corrente é: " + this.contaCorrente);
	}
	public void imprimirTitular(){
		System.out.println("O titular da conta é: " + this.titularConta);
	}
	
	public static void main(String [] args){
	
		ContaBancaria2 ob1 = new ContaBancaria2();
		ContaBancaria2 ob2 = new ContaBancaria2();
	System.out.println("OBEJTO 1: ");
		ob1.agencia = 3610;
		ob1.contaCorrente = 15766;
		ob1.saldo = 35.54;
		ob1.limiteExtra = 50;
		ob1.titularConta = "Rafaela";
		ob1.imprimirTitular();
		ob1.imprimirAgencia();
		ob1.imprimirContaCorrente();
		ob1.imprimirSaldo();
		ob1.imprimirSaldoTotal();
		

System.out.println("OBEJTO 2: ");
		ob2.agencia = 810;
		ob2.contaCorrente = 6132;
		ob2.saldo = 42.31;
		ob2.limiteExtra = 75.00;
		ob2.titularConta = "Bárbara";
		ob2.imprimirTitular();
		ob2.imprimirAgencia();
		ob2.imprimirContaCorrente();
		ob2.imprimirSaldo();
		ob2.imprimirSaldoTotal();
		
	
	}

}

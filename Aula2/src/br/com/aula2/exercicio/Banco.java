package br.com.aula2.exercicio;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Long numero;
		int agencia;
		double valor;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o numero da conta: ");
		numero = ler.nextLong();
		System.out.println("Digite o numero da agencia: ");
		agencia = ler.nextInt();
		
		ContaCorrente c1 = new ContaCorrente (numero,agencia);
		System.out.println("Digite valor de deposito");
		valor = ler.nextDouble();
		c1.Depositar(valor);
		System.out.println(c1.ConsultarSaldo());
		
		/*ContaCorrente c1; //cria a variavel c1 do tipo ContaCorrente
		c1= new ContaCorrente (1234,526);//Instacia a variavel c1
		c1.Depositar(1000);
		System.out.println(c1.ConsultarSaldo());
		c1.Sacar(500);
		System.out.println(c1.ConsultarSaldo());
		*/
	}
	
}

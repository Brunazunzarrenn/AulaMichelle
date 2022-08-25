package br.com.aula1.exercicio;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String placa;
		int ano;
		
		System.out.println("Digite a placa: ");
		placa = ler.next();
		
		System.out.println("Digite o ano do carro: ");
		ano = ler.nextInt();
		
		if (ano<=2010)
			System.out.println("Carro velho");
		else if (ano<=2021)
			System.out.println("Carro semi novo");
		else if (ano==2021)
			System.out.println("Carro novo");
		else
			System.out.println("lançamento");

	}

}
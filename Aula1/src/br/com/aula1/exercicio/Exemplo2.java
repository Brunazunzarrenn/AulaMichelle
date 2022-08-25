package br.com.aula1.exercicio;
import java.util.Scanner;
import java.util.Random;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Random numrandomico = new Random ();
        String nome, cpf, data, hora;
        int opcao=0;
        while (opcao !=4) {
		System.out.println("1-Cadastrar Passageiro\n2-Check in\n3-Cancelar Voo\n4-Sair");
		opcao = ler.nextInt();
		
		switch (opcao)
		{
		case 1:
			System.out.println("Nome: ");
			nome = ler.next();
			System.out.println("CPF: ");
			cpf = ler.next();
			System.out.println("Data do Voo: ");
			data = ler.next();
			System.out.println("Horario do Voo: ");
			hora = ler.next();
			System.out.println("Voo cadastrado com sucesso " + numrandomico.nextInt(999));
			break;
			
		case 2:
			System.out.println("CPF: ");
			cpf = ler.nextLine();
			System.out.println("Número do voo ");
			cpf = ler.nextLine();
			System.out.println("Check in realizado com sucesso");
			break;
			
			case 3:
				System.out.println("CPF: ");
				cpf = ler.nextLine();
				System.out.println("Número do voo ");
				cpf = ler.nextLine();
				System.out.println("Voo Cancelado com sucesso");
				break;
				
					case 4:
				
						break;
				
			default:
				
				break;
				
		}
		
        	}

				}
		
					}

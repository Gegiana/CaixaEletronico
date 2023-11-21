package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Caixa Eletrônico Bracos Curtos\n da Unipaulistana");
		System.out.println("");
		System.out.println("");
		System.out.println("1- Abastecimento");
		System.out.println("");
		System.out.println("2- Operações Financeiras");
		System.out.println("");
		System.out.println("");
		System.out.println("Digite a opção desejada:");
		
		int opcao= sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Você escolheu a opção Abastecimento");
			break;
		case 2:
			System.out.println("Você escolheu a opção Operações Financeiras");
			break;
			default:
				System.out.println("A opção escolhida é inexistente. Selecione apenas 1 e 2.");
			break;
		}
		
	
		
		
		
		

	}

}


package ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para armazenar e uma matriz os compromissos de uma agenda
		 * pessoal. cada dia do mês deve conter 24 horas, onde para cada destas 24h
		 * podemos associar uma tarefa específica(compromisso agendado). O programa deve
		 * ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora,
		 * entrando em seguida com o compromisso, ou então o usuário pode também
		 * consultar a agenda, fornecendo o dia e a hora para obter o compromisso
		 * armazenado.
		 */

		Scanner scan = new Scanner(System.in);
		int opcao; //saber se quer permanecer na agenda 
		int opcao2;//pergunda se quer adicionar mais compromissos
		int dia =0;
		int horario = 0;
		String compromissos;

		// Criar a agenda
		String[][] agenda = new String[30][24];

		boolean flag = false;
		

		while (!flag) {
			System.out.println("O que você gostaria de fazer?");
			System.out.println();
			System.out.println("Digite 1: Adicionar na agenda");
			System.out.println("Digite 2: Consultar na agenda");
			System.out.println("Digite 3: Sair da agenda");

			opcao = scan.nextInt();

			if (opcao == 1) {//Adionar na agenda 
				boolean flag2 = true;
				
				
				do {
					System.out.println("Escolha o dia ");
					dia =  scan.nextInt();
					
					while(dia<0 || dia >30) {
						System.out.println("Dia inválido, adicione novamente");
						dia =  scan.nextInt();
					}
					
					System.out.println();
					System.out.println("Escolha o horário ");
					horario =  scan.nextInt();
					
					while(horario<0 || horario >24) {
						System.out.println("horário inválido, adicione novamente");
						horario =  scan.nextInt();
					}
					
					System.out.println();
					System.out.println("Digite o compromisso ");
					agenda[dia][horario] = scan.next();
					
					System.out.println("Compromisso adicionado");
					System.out.println();
					System.out.println("Se quiser continuar adicionando, digite 1. Se quiser sair, digite 0");
					System.out.println();
					opcao2 = scan.nextInt();
					
					if(opcao2 == 0) {
						flag2 = false;
					}
				}while(flag2);
				
				
			} else if (opcao == 2) { //Consultar a agenda
				
				System.out.println("Escolha o dia");
				System.out.println();
				dia = scan.nextInt();
				System.out.println("Escolha o horário");
				System.out.println();
				horario = scan.nextInt();
				compromissos = agenda[dia][horario];
				
				while(compromissos== null) {
					System.out.println("Você não possui nenhum compromisso nesse dia, pesquise por outra data e horário ");
					System.out.println();
					System.out.println("Escolha o dia");
					System.out.println();
					dia = scan.nextInt();
					System.out.println("Escolha o horário");
					System.out.println();
					horario = scan.nextInt();
					compromissos = agenda[dia][horario];
				}
				
				System.out.println("O seu compromisso do dia "+ dia + " e horário " + horario+ " é: " + compromissos);
				System.out.println();

			} else if (opcao == 3) { //Sair da agedenda
				flag = true;
				System.out.println("Você saiu da agenda!");
			}
		}

	}

}

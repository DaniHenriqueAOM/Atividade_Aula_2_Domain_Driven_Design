package br.com.fiap;

import java.util.Scanner;

public class Atividade2Scanner {
	public static void main(String[] args) {
		
		int AnoN = 0, AnoA = 2022;
		Scanner scan;
		try {
			
			scan = new Scanner(System.in);
			System.out.println("Digite o ano em que você nasceu: ");
			AnoN = scan.nextInt();
			System.out.println("Sua idade é:" + (AnoA - AnoN));
			
		} catch (Exception e) {
			System.out.println("Formato numerico incorreto");
		}
	}		
}
		

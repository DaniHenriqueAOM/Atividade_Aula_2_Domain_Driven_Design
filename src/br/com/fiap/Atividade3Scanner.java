package br.com.fiap;

import java.util.Scanner;

public class Atividade3Scanner {
	public static void main(String[] args) {
	
		double raio = 0;
		final double PI = 3.14;
		Scanner scan;
		
		try {
			
			scan = new Scanner(System.in);
			System.out.println("Digite o número do raio: ");
			raio = scan.nextInt();
			System.out.println("A área da circunferencia é: " + (raio * raio * PI));
			
			
		} catch (Exception e) {
			System.out.println("Formato numerico incorreto");
		}
		
	}
}

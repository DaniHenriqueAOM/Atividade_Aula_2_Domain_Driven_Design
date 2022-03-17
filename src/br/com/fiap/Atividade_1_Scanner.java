package br.com.fiap;

import java.util.Scanner;

public class Atividade_1_Scanner {
	public static void main(String[] args) {
		
		int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
		float media = 0;
		Scanner scan;
		try {
			
			scan = new Scanner(System.in);
			System.out.println("Digite a primeira nota: ");
			p1 = scan.nextInt();
			System.out.println("Digite a segunda nota: ");
			p1 = scan.nextInt();
			System.out.println("Digite a terceira nota: ");
			p1 = scan.nextInt();
			System.out.println("Digite a quarta nota: ");
			p1 = scan.nextInt();
			media = p1 + p2 + p3 + p4;
			System.out.println("Média: " + media );
			
		} catch (Exception e) {
			System.out.println("Formato numerico incorreto");
		}
	}
}
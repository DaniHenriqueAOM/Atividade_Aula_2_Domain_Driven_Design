package br.com.fiap;

import java.util.Scanner;

public class Atividade_1_Scanner {
	public static void main(String[] args) {
		
		float p1 = 0, p2 = 0, p3 = 0, p4 = 0, media = 0.0f;
		Scanner scan;
		try {
			
			scan = new Scanner(System.in);
			System.out.println("Digite a primeira nota: ");
			p1 = scan.nextFloat();
			System.out.println("Digite a segunda nota: ");
			p2 = scan.nextFloat();
			System.out.println("Digite a terceira nota: ");
			p3 = scan.nextFloat();
			System.out.println("Digite a quarta nota: ");
			p4 = scan.nextFloat();
			media = (p1 + p2 + p3 + p4) / 4;
			System.out.println("Média: " + media );
			
		} catch (Exception e) {
			System.out.println("Formato numerico incorreto");
		}
	}
}
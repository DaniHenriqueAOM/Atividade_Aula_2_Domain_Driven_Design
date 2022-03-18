package br.com.fiap;

import javax.swing.JOptionPane;

public class Atividade2JOptionPane {
	public static void main(String[] args) {
	
		int anoN = 0, anoA = 2022;
		String aux;
		try {
			
			aux = JOptionPane.showInputDialog("Digite o ano em que você nasceu:");
			anoN = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, 
					"\nEsta é a sua idade: " + (anoA - anoN));
			
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "O formato de numero está incorreto");
		}
			
	}
}

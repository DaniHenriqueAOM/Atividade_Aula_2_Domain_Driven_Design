package br.com.fiap;

import javax.swing.JOptionPane;

public class Atividade2JOptionPane {
	public static void main(String[] args) {
	
		int AnoN = 0, AnoA = 2022;
		String aux;
		try {
			
			aux = JOptionPane.showInputDialog("Digite o ano em que voc� nasceu:");
			AnoN = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, 
					"\nEsta � a sua idade: " + (AnoA - AnoN));
			
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "O formato de numero est� incorreto");
		}
			
	}
}

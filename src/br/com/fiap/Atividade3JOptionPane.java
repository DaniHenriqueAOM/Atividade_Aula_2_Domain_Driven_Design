package br.com.fiap;

import javax.swing.JOptionPane;

public class Atividade3JOptionPane {
	public static void main(String[] args) {
		
		int raio = 0;
		double PI = 3.14;
		String aux;
		try {
			
			aux = JOptionPane.showInputDialog("Digite o numero do raio: ");
			raio = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "A área da circunferencia é:" + ( raio * raio * PI));
			
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "O formato do número está incorreto.");
		}
		
	}
}

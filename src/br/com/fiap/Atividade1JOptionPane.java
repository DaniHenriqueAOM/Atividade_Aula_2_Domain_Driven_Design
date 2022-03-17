package br.com.fiap;

import javax.swing.JOptionPane;

public class Atividade1JOptionPane {
	public static void main(String[] args) {
		
		int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o primeiro número: ");
			p1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o primeiro número: ");
			p2 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o primeiro número: ");
			p3 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o primeiro número: ");
			p4 = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, 
					"\nMédia dos valores: " + ((p1 + p2 + p3 + p4) / 4));
			
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Formato de número incorreto");
		}
	}
}
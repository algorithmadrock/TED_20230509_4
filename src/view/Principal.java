/*
RESUMO      : Prompt do Usuário
PROGRAMADORA: Luiza Felix
DATA        : 01/06/2023
 */

package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ao confirmar o programa carregará a lista e mostrará os dois maiores valores, baseado no enunciado");
		Controller.lista();
	}

}

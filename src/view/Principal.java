package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController pali = new PalindromoController();
		
		boolean aux = false;
		do {
			int menu = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para inserir uma serie de letras e verificar se e um palindromo\nDigite qualquer outro numero para encerrar"));
			switch (menu ) {
			case 1:
				String palavra = JOptionPane.showInputDialog("Insira uma serie de letras para verificar se e um palindromo: ");
				String palavraInvertida = pali.invertePalavra(palavra);
				
				if (pali.comparaPalavras(palavra, palavraInvertida)) {
					JOptionPane.showMessageDialog(null, "Voce inseriu um plindromo!");
				} else {
					JOptionPane.showMessageDialog(null, "Isso nao e um palindromo");
				}
				break;

			default:
				System.exit(0);
				break;
			}
		} while (aux ==false);
	}

}

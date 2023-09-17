package controller;

import model.PilhaString;

public class PalindromoController {

	public String invertePalavra(String palavra) {
		String palavraInvertida = "";
		int tamanho = palavra.length();
		PilhaString p = new PilhaString();
		
		//Cria uma pilha com as letras de uma palavra 
		for (int i = 0; i < tamanho; i++) {
			p.push(palavra.substring(i, i+1));	//Adiciona o caracter que está na osição 'i' da palavra 
		}
		
		while (!p.isEmpty()) {
			try {
				palavraInvertida += p.pop();	//Incrementa uma letra enquanto a pilha não for vazia
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return palavraInvertida;
		
	}
	//Verifica se a palavra é um palíndromo
	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		if (palavra.equals(palavraInvertida)) {
			return true;
		} else {
			return false;
		}
	}
}

/*
RESUMO      : Comandos do código para ordenação da lista
PROGRAMADORA: Luiza Felix
DATA        : 01/06/2023
 */

package controller;

import br.edu.fateczl.listas.Lista;

public class Controller {

	public static void lista() {
		int[] vetor = {16, 7, 3, 2, 6, 7, 9, 12, 8, 5, 3};
		Lista lista = new Lista();
		
		for(int i: vetor) {
			lista.addfirst(i);
		}
		System.out.println(lista.toString());
		
		int[] maiores = maiores(lista);
		System.out.println("\t1 MAIOR:" + maiores[0] + "\t2 MAIOR:" + maiores[1]);
	}
	
	private static int[] maiores(Lista lista) {
		int[] maiores = new int[2];
		try {
			int first = (int) lista.get(0), second = first, size = lista.size();
			for(int i = 1; i < size; i++){
				if(first < (int) lista.get(i)){
					second = first;
					first = (int) lista.get(i);
				}
			}	
			maiores[0] = first;
			maiores[1] = second;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return maiores;
	}


	
	
}

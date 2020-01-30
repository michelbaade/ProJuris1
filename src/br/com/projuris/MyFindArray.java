package br.com.projuris;

import java.util.Scanner;

public class MyFindArray implements FindArray {
	
	@Override
	public int findArray(int[] array, int[] subArray) {
		
		Scanner sc = new Scanner(System.in);
		
				//variavel na qual vai armazenar a posição correspondente
				int posicaoValoresIguais = 0 ;
				//variavel para armazenar a quantidade de valores iguais
				int quantidadeIguais = 0;
				//variavel para saber qual é o item que se precisa guardar a posição
				int primeiroValorIgual = 0;
				
				//for para percorrer e ver se os valores do subArray correspondem ao array
				for(int i = 0; i < array.length; i++){
					for(int j = 0; j < subArray.length; j++){
						
						if(array[i] == subArray[j]) {
							quantidadeIguais ++;
						}
						if(array[i] == subArray[j] && posicaoValoresIguais==0){
							
							posicaoValoresIguais = i;
							primeiroValorIgual =subArray[j];
						}
						if(primeiroValorIgual == array[i]) {
							
							posicaoValoresIguais = i;
						}
						
					}
				}
				//condicional para saber se os arrays correspondem 
				if(quantidadeIguais >= subArray.length) {
					sc.close();
					return posicaoValoresIguais;
					
					
				}else {
					sc.close();
					return -1;
					
				}
		
	
		
		
	}


	
		
		
	

	

}

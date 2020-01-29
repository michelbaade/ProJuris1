package br.com.projuris;

import java.util.Scanner;

public class MyFindArray implements FindArray {
	
	@Override
	public int findArray(int[] array, int[] subArray) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
				// Valores para teste	
				//int vet1[] = {4,9,3,7,8};
				//int vet1[] = {1,3,5};
				//int vet1[] = {7,8,9};
				//int vet1[] = {4,9,3,7,8,3,7,1};
				
				
				//int vet2[] = {3,7};
				//int vet2[] = {1};
				//int vet2[] = {8,9,10};
				//int vet2[] = {3,7};
				
				
				int posicaoValoresIguais = 0 ;
				int quantidadeIguais = 0;
				int primeiroValorIgual = 0;
				
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
				}if(quantidadeIguais >= subArray.length) {
					
					System.out.println("Achou na posição" + posicaoValoresIguais);	
					
					
				}else {
					System.out.println("Achou na posição -1");	
				
				}
		
		sc.close();
		return 0;
		
	}


	
		
		
	

	

}

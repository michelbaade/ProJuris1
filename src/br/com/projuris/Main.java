package br.com.projuris;

public class Main {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
	
		/*
		 
	 	Demonstração:
					[4,9,3,7,8] e [3,7] deve retornar 2.
					[1,3,5] e [1] deve retornar 0.
					[7,8,9] e [8,9,10] deve retornar -1.
					[4,9,3,7,8,3,7,1] e [3,7] deve retornar 5.

		 * */
		
		
		
		
		//int vet1[] = {4,9,3,7,8};
		//int vet1[] = {1,3,5};
		//int vet1[] = {7,8,9};
		int vet1[] = {4,9,3,7,8,3,7,1};
		
		
		//int vet2[] = {3,7};
		//int vet2[] = {1};
		//int vet2[] = {8,9,10};
		int vet2[] = {3,7};
		
		
		int posicaoValoresIguais = 0 ;
		int quantidadeIguais = 0;
		int primeiroValorIgual = 0;
		
		for(int i = 0; i < vet1.length; i++){
			for(int j = 0; j < vet2.length; j++){
				
				if(vet1[i] == vet2[j]) {
					quantidadeIguais ++;
				}
				if(vet1[i] == vet2[j] && posicaoValoresIguais==0){
					
					posicaoValoresIguais = i;
					primeiroValorIgual =vet2[j];
				}
				if(primeiroValorIgual == vet1[i]) {
					
					posicaoValoresIguais = i;
				}
				
				
			}
		}if(quantidadeIguais >= vet2.length) {
			
			System.out.println("Achou na posição" + posicaoValoresIguais);	
			
			
		}else {
			System.out.println("Achou na posição -1");	
		
		}
		
		
		

	}


}

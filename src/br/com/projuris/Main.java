package br.com.projuris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números para o primeiro array?");
		int quantosNumeros = sc.nextInt();
		
		System.out.println("Quantos números para o segundo array?");
		int quantosNumeros2 = sc.nextInt();
		
		int array[] = new int[quantosNumeros];
		for (int i = 0; i < quantosNumeros; i++) {
			System.out.println("Entre com os valores do primeiro vetor!");
			array[i] = sc.nextInt();
			
		}
		int subArray[] = new int[quantosNumeros2];
		for (int j = 0; j < quantosNumeros2; j++) {
			System.out.println("Entre com os valores do segundo vetor!");
			subArray[j] = sc.nextInt();
			
		}
		
		
		MyFindArray myfind= new MyFindArray();
		
		myfind.findArray(array,subArray);
	
		sc.close();
		

	}


}

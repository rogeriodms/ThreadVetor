package view;

import java.util.Random;

import vetorTime.ThreadVetor;

public class view {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int PrimeiroInput = 1;
		int SegundoInput = 2;	
		Random gerador = new Random();
		int vetor[] = new int[1000];
		
		for(int i = 0; i < 1000; i++) {
			vetor[i] = gerador.nextInt(100);
		}
		
		Thread primeiroInput = new ThreadVetor(PrimeiroInput, vetor);
		primeiroInput.start();
		Thread segundoInput = new ThreadVetor(SegundoInput, vetor);
		
		segundoInput.start();
	}
}

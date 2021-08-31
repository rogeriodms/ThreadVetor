package vetorTime;

public class ThreadVetor extends Thread {

	private int number;
	private int vetor[];
	public ThreadVetor(int number, int vetor[]) {
		this.number = number;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		if(number % 2 >= 1) {
			long inicio = System.currentTimeMillis(); 
			int number = 0;
			for(int N : vetor) {
				number += N;
			}
			long fim = System.currentTimeMillis();
			double calc = (double) ((fim - inicio)/1000);
			System.out.println("The 'foreach' delayed " + calc + " Seconds and for += " + number);
			
		} else {
			int number = 0;
			long inicio = System.currentTimeMillis();
			for(int i = 0 ; i < vetor.length; i++) {
				number += vetor[i]; 
			}
			long fim = System.currentTimeMillis();
			float calc = (float) ((fim - inicio)/1000);
			System.out.println("The 'for' delayed " + calc + " Seconds and for += " + number);
		}
	}
}

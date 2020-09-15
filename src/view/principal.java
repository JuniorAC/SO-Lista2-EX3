package view;

import java.util.Random;

import controller.calcMatriz;

public class principal {

	public static void main(String[] args) {
		int matrizRandom[][] = new int[3][5];
		Random aleatorio = new Random(); 
		int vetorL1 [] = new int [5];
		int vetorL2 [] = new int [5];
		int vetorL3 [] = new int [5];

		for(int i = 0; i <= 2; i++) {
			for(int l = 0; l <= 4; l++) {
				matrizRandom [i][l] = aleatorio.nextInt(10)+1;
				if (i == 0) {
					vetorL1  [l] = matrizRandom [i][l];
				}
				else if (i==1) {
					vetorL2 [l] = matrizRandom [i][l];
				}

				else if (i==2) {
					vetorL3 [l] = matrizRandom [i][l];	
				}
			}
		}

		calcMatriz threadLinha1 = new calcMatriz("Linha 1 ", vetorL1);
	    calcMatriz threadLinha2 = new calcMatriz("Linha 2 ", vetorL2);		
	    calcMatriz threadLinha3 = new calcMatriz("Linha 3 ", vetorL3);
	    threadLinha1.start();
	    threadLinha2.start();
	    threadLinha3.start();
	}

}

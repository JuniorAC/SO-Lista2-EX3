package controller;

public class calcMatriz extends Thread {
	int vAleatorio[] = new int[5];
	String nome = "";
	int soma = 0;
	public calcMatriz (String nome, int vetor[]) {
		this.nome = nome;
		this.vAleatorio = vetor;
	}
	public void run() {
		for (int i = 0; i<=4; i++) {
			soma += vAleatorio [i];
		}
		System.out.println(nome + " Soma = " + soma);
	}
}

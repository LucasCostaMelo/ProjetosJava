package PacoteJava;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n;
		double potencia;
		double raiz;
		System.out.print("Digite um numero:");
		n = ler.nextInt();

		if (n % 2 == 0) {
			raiz = Math.sqrt(n);
			System.out.print("Esse numero é par \n" + "A raiz quadrada desse numero é: " + raiz);

		} else {
			potencia = Math.pow(n, 2);
			System.out.print("Esse numero é impar \nE esse numero elevado ao quadrado é: " + potencia);
		}

	}
}

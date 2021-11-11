package PacoteJava;

import java.util.Scanner;

public class NumerosInteiros {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.print(" Digite o primeiro numero:");
		a = ler.nextInt();
		System.out.print(" Digite o segundo numero:");
		b = ler.nextInt();
		System.out.print(" Digite o terceiro numero: ");
		c = ler.nextInt();

		if (a > b && a > c) {
			System.out.print("O numero " + a + " Maior que " + b + " E maior que " + c);

		} else if (b > a && b > c) {
			System.out.print("O numero " + b + " Maior que " + a + " E maior que " + c);

		} else {
			System.out.print("O numero " + c + " Maior que " + b + " E maior que " + a);
		}

	}
}

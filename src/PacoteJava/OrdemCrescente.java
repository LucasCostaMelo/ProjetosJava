package PacoteJava;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.print("Digite o primeiro numero: ");
		a = ler.nextInt();

		System.out.print("Digite o segundo numero:");
		b = ler.nextInt();

		System.out.print("Digite o terceiro numero:");
		c = ler.nextInt();

		if (a < b && b < c) {

			System.out.print(a + "-" + b + "-" + c);

		}

		else if (a < c && c < b) {
			System.out.print(a + "-" + c + "-" + b);

		} else if (b < a && a < c) {
			System.out.print(b + "-" + a + "-" + c);
		}

		else if (b < c && c < a) {
			System.out.print(b + "-" + c + "-" + a);
		} else if (c < b && b < a) {
			System.out.print(c + "-" + b + "-" + a);
		} else {
			System.out.print(c + "-" + a + "-" + b);
		}

	}

}

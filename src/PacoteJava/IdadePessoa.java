package PacoteJava;

import java.util.Scanner;

public class IdadePessoa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;

		System.out.print("Digite sua idade:");
		i = ler.nextInt();

		if (i >= 10 && i <= 14) {
			System.out.print("Categria infantil");
		}

		else if (i >= 15 && i <= 17) {
			System.out.print("Categoria Juvenil");
		}

		else if (i >= 18 && i <= 25) {
			System.out.print("Categoria Adulta");

		}

		else {
			System.out.print("Voce nao tem idade permitida");
		}
	}

}

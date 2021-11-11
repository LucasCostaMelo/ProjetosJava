package PacoteJava;

import java.util.Scanner;

public class AnosMesesDias {

	public static void main(String[] args) {
		int Anos, Meses, Dias; /// em so dias
		Scanner ler = new Scanner(System.in); /// declanrando o scanner, leitura dos dados do usario
		
		System.out.print("Digite quantos anos voce tem: ");
		Anos = ler.nextInt(); 
		
		System.out.print("Digite quantos meses voce tem: ");
		Meses = ler.nextInt(); 
		
		System.out.print("Digite quantos dias voce tem: ");
		Dias = ler.nextInt(); 
		
		Dias= Anos*365 + Meses*30 + Dias; 
		
		System.out.println("A idade em dias é :" + Dias);
		
		
	}

}

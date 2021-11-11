package PacoteJava;
import java.util.Scanner;

public class HorasMinutosSegundos {
 public static void main(String[] args) {
	 
	 Scanner input = new Scanner(System.in);
	 System.out.print("Digite o numero segundos: ");
	 int  totalSegundos = input.nextInt();
	 
	 int qtdHoras = totalSegundos / 3600;
	 totalSegundos = totalSegundos %3600;
	 
	 int qtdMinutos = totalSegundos /60;
	 totalSegundos = totalSegundos %60;
	 
	 int qtdSegundos = totalSegundos;
	 
	 System.out.println("A quantidade de horas é:" + qtdHoras + "\nA quantidade de minutos é:" +qtdMinutos + "\nA quantidade de segundos é: " + qtdSegundos);
	 
	 input.close();
	 
	
}
}

	 



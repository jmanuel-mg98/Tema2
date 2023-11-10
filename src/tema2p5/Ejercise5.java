package tema2p5;

import java.util.Scanner;

public class Ejercise5 {

	public static void main(String[] args) {
		int num,suma=0,contador;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe 10 num enteros: ");
		for (contador=1;contador<=10;contador++) {
		num = sc.nextInt();
		suma=suma+num;
		}
		media = (double)suma/10;
		System.out.print("la media total de todos los numeros 10 introducidos es: "+media);
	

	}

}

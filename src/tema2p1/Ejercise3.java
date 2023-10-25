package tema2p1;

import java.util.Scanner;

public class Ejercise3 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("Escriba un numero decimal: ");
		double numero1 = cs.nextDouble();
		boolean numero0 = numero1>-1;
			System.out.print("es un numero casi 0? " + numero0);
		
	}

}

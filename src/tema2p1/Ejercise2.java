package tema2p1;

import java.util.Scanner;

public class Ejercise2 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("Escriba un numero: ");
		int numero1 = cs.nextInt();
		System.out.print("Escriba otro numero: ");
		int numero2 = cs.nextInt();
		if (numero1==numero2) {
			System.out.print("estos numeros son igules");
		}
		else {
			System.out.print("estos numeros son distintos");
		}
	}
}

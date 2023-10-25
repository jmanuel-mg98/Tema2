package tema2p1;

import java.util.Scanner;

public class Ejercise1 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("Escriba un numero: ");
		int numero = cs.nextInt();
		if (numero % 2 == 0) {
			System.out.print("este numero  es par");
		}
		else {
			System.out.print("este numero es impar");
		}

	}

}

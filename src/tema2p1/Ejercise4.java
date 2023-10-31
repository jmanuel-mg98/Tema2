package tema2p1;

import java.util.Scanner;

public class Ejercise4 {

	public static void main(String[] args) {
		int numero1,numero2;
		Scanner cs = new Scanner(System.in);
		System.out.print("Escriba 2 numeros ");
		numero1 = cs.nextInt();
		numero2 = cs.nextInt();
		if (numero1>=numero2) {
			System.out.print(numero1 + " " + numero2);
		}
		else {
			System.out.print(numero2 + " " + numero1);
		}
		
		

	}

}

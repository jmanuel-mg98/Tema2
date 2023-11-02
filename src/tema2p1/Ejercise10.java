package tema2p1;

import java.util.Scanner;

public class Ejercise10 {

	public static void main(String[] args) {
		int numero1,numero2,numero3;
		Scanner cs = new Scanner(System.in);
		System.out.print("Escriba 3 numeros ");
		numero1 = cs.nextInt();
		numero2 = cs.nextInt();
		numero3 = cs.nextInt();
		if (numero1 + numero2 == numero3) {
			System.out.print("la suma de dos de ellos da el otro");
		} else if (numero1 + numero3 ==numero2) {
			System.out.println("la suma de dos de ellos da el otro");
		} else if (numero2 + numero3 ==numero1) {
			System.out.println("la suma de dos de ellos da el otro");
		}
		else  {
			System.out.print("la suma de estos numeros no da el tercero");
		}

	}

}

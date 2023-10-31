package tema2p1;

import java.util.Scanner;

public class Ejercise5 {

	public static void main(String[] args) {
		int numero1,numero2,numero3;
		Scanner cs = new Scanner(System.in);
		System.out.print("Escriba 3 numeros ");
		numero1 = cs.nextInt();
		numero2 = cs.nextInt();
		numero3 = cs.nextInt();
		if (numero1>=numero2) {
			if (numero2>numero3){
			System.out.print(numero1 + " " + numero2 + " " + numero3);
			} else if (numero1>numero3) {
				System.out.print(numero1 + "" + numero3 + " " + numero2);
			} else {
				System.out.print(numero3 + " " + numero1 + " " + numero2);
			}
		}
		else {
			if (numero1 > numero3 ) {
			System.out.print(numero2 + " " + numero1 + " " + numero3);
			} else if (numero2>numero3) {
				System.out.print(numero2 + " " + numero3 + " " + numero1);
			}else {
			System.out.print(numero3 + " " + numero2 + " " + numero1);
	
			}
		}

	}

}

package tema2p1;

import java.util.Scanner;

public class Ejercise3 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("Escriba un numero decimal: ");
		double numero1 = cs.nextDouble();
		if (-1<numero1 && numero1<1&&numero1!=0) {
			System.out.print("este numero es casi 0");
		}
		else {
			System.out.print("este numero no es casi 0");
		}

	}

}
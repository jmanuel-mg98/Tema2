package tema2p3;

import java.util.Scanner;
import java.util.Random;

public class Ejercise7 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numPc = rand.nextInt(1, 101);
		int num;
		System.out.print("Introduzca un número entre 1 y 100: ");
		num = sc.nextInt();
		while (num != numPc && num != -1) {
			if(numPc > num) {
				System.out.println("el numero a adivinar es mayor");
			} else {
				System.out.println("el numero a adivinar es menor");
			}
			System.out.println("Introduzca un número entre 1 y 100");
			num = sc.nextInt();
		}
		if(num == -1) {
			System.out.println("te has rendido");
		} else { 
			System.out.println("has acertado. Enhorabuena");
		}

	}

}

	
package tema2p5;

import java.util.Scanner;

public class Ejercise8 {

	public static void main(String[] args) {
		int num=0,contador=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la nota de 5 alumnos: ");
		for (contador=1;contador<=5;contador++) {
		num = sc.nextInt();
		System.out.print("");
		}
		if (num<5) {
			System.out.print("hay algun suspenso");
		}
	}

}

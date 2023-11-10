package tema2p5;

import java.util.Scanner;

public class Ejercise1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.print("escribe el numero hasta el que quieras que se cuente: ");
		num=sc.nextInt();
		for (int numCero=1;numCero<=num;numCero++) {
			System.out.println(numCero);
		}
	}
}

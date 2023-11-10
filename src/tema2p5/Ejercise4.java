package tema2p5;

import java.util.Scanner;

public class Ejercise4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.print("escribe el numero hasta el que quieras que se cuente: ");
		num=sc.nextInt();
		for (int numCero=0;numCero<=num;numCero=numCero+3) {
			System.out.println(numCero);
		}
	}
}

package tema2p5;

import java.util.Scanner;

public class Ejercise10 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int numMax,numMin;
		System.out.print("escribe el numero hasta el que quieras que se cuente: ");
		numMax=sc.nextInt();
		System.out.print("escribe el numero desde el que quieras que se cuente: ");
		numMin=sc.nextInt();
		for (int numCero=numMin;numCero<=numMax&&numCero>=numMin;numCero++) {
			System.out.println(numCero);
		}
	}
}
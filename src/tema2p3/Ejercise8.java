package tema2p3;

import java.util.Scanner;

public class Ejercise8 {

	public static void main(String[] args) {
		int altura,arbolAlto=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce la altura de un arbol (en cm): ");
		altura = sc.nextInt();
		while (altura>=0) {
			if (altura>arbolAlto) {
			arbolAlto=altura;
			}
			System.out.print("introduce la altura de un arbol (en cm): ");
			altura = sc.nextInt();
		}
		System.out.print("el arbol más alto es el que mide: "+arbolAlto +" cm");
		
	}

}

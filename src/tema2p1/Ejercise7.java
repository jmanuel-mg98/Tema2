package tema2p1;

import java.util.Scanner;

public class Ejercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in)
;		System.out.print("escribe un numero comprendido entre 0 y 99999: " );
		int numero = sc.nextInt();
		if (numero<=9) {
			System.out.print("este numero tiene una cifra");
				} else if (numero<=99) {
					System.out.println("este numero tiene dos cifras");
				} else if (numero<=999) {
					System.out.println("este numero tiene tres cifras");
				} else if (numero<=9999) {
					System.out.println("este numero tiene cuatro cifras");
				} else if (numero<=99999) {
					System.out.println("este numero tiene cinco cifras");
				}
			} 	
		}

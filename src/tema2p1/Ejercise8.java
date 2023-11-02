package tema2p1;

import java.util.Scanner;

public class Ejercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("escribe tu nota: " );
		Double numero = sc.nextDouble();
			if (numero>=0&&numero<5) {
			System.out.println("Suspenso");
				} else if (numero>=5&&numero<6) {
					System.out.println("Suficiente");
				} else if (numero>=6&&numero<7) {
					System.out.println("Bien");
				} else if (numero>=7&&numero<9) {
					System.out.println("Notable");
				}else if (numero>=9&&numero<=10) {
					System.out.println("Sobresaliente");
				}
			} 	
	}

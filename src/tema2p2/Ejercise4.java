package tema2p2;

import java.util.Scanner;

public class Ejercise4 {

	public static void main(String[] args) {
		String dado1,dado2;
		int valor1,valor2;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca el numero sacado en el dado 1: ");
		dado1 = sc.nextLine();
		System.out.println("introduzca el numero sacado en el dado 2: ");
		dado2 = sc.nextLine();
		valor1 = switch (dado1) {
		case "uno"-> 1;
		case "dos"-> 2;
		case "tres"-> 3;
		case "cuatro"->4;
		case "cinco"->5;
		case "seis"->6;
		default->0;
		};
		valor2 = switch (dado2) {
		case "uno"-> 1;
		case "dos"-> 2;
		case "tres"-> 3;
		case "cuatro"->4;
		case "cinco"->5;
		case "seis"->6;
		default->0;
		};
		if (valor1==0||valor2==0) {
			System.out.println("alguna de los valores de los dos dados es erroneo");
		} else {
			System.out.println("la suma de las tiradas es "+(valor1+valor2));
		}
	}

}

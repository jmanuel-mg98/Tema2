package tema2p4;

import java.util.Scanner;

public class Ejercise8 {

	public static void main(String[] args) {
		String dado1,dado2;
		int valor1,valor2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("introduzca el numero sacado en el dado 1: ");
			dado1 = sc.nextLine();
			valor1 = switch (dado1) {
			case "uno"-> 1;
			case "dos"-> 2;
			case "tres"-> 3;
			case "cuatro"->4;
			case "cinco"->5;
			case "seis"->6;
			default->0;
			};
		}while(!dado1.equalsIgnoreCase("uno")&&!dado1.equalsIgnoreCase("dos")&&!dado1.equalsIgnoreCase("tres")&&!dado1.equalsIgnoreCase("cuatro")&&!dado1.equalsIgnoreCase("cinco")&&!dado1.equalsIgnoreCase("seis"));
		do {
			System.out.println("introduzca el numero sacado en el dado 2: ");
			dado2 = sc.nextLine();
			valor2 = switch (dado2) {
			case "uno"-> 1;
			case "dos"-> 2;
			case "tres"-> 3;
			case "cuatro"->4;
			case "cinco"->5;
			case "seis"->6;
			default->0;
			};
		}while(!dado2.equalsIgnoreCase("uno")&&!dado2.equalsIgnoreCase("dos")&&!dado2.equalsIgnoreCase("tres")&&!dado2.equalsIgnoreCase("cuatro")&&!dado2.equalsIgnoreCase("cinco")&&!dado2.equalsIgnoreCase("seis"));
		if (valor1==0||valor2==0) {
			System.out.println("alguna de los valores de los dos dados es erroneo");
		} else {
			System.out.println("la suma de las tiradas es "+(valor1+valor2));
		}
	}

}

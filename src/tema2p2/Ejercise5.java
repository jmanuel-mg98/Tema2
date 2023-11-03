package tema2p2;

import java.util.Scanner;

public class Ejercise5 {

	public static void main(String[] args) {
		String letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe la la letra de su carnet de conducir: ");
		letra = sc.nextLine();
		switch (letra) {
		case "E"->
		System.out.println("Remolques");
		case "D"->
		System.out.println("Autobuses");
		case "C1","C2","C3","C4","C5"->
		System.out.println("Camiones");
		case "A"->
		System.out.println("Motocicletas");
		case "B1","B2"->
		System.out.println("Automoviles");
		default ->
		System.out.println("categoria no contemplada");
		}

	}

}

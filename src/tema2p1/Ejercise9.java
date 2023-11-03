package tema2p1;

import java.util.Scanner;

public class Ejercise9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final String PIEDRA= "piedra";
	final String PAPEL= "papel";
	final String TIJERAS= "tijeras";
	String jugador1;
	String jugador2;
	System.out.println("jugador uno elija piedra papel o tijeras: ");
	jugador1 = sc.nextLine();
	System.out.println("jugador dos elija piedra papel o tijeras: ");
	jugador2 = sc.nextLine();
	if (jugador1.equalsIgnoreCase(jugador2)) {
		System.out.println("empate");
	}else if (jugador1.equalsIgnoreCase(PIEDRA)&&jugador2.equalsIgnoreCase(TIJERAS)) {
		System.out.println("gana el jugador 1");
	}else if (jugador1.equalsIgnoreCase(PAPEL)&&jugador2.equalsIgnoreCase(PIEDRA)) {
		System.out.println("gana el jugador 1");
	}else if (jugador1.equalsIgnoreCase(TIJERAS)&&jugador2.equalsIgnoreCase(PAPEL)) {
		System.out.println("gana el jugador 1");
	} else {
		System.out.println("gana el jugador 2");
	}
	}
}

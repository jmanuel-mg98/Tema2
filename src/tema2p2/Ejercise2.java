package tema2p2;

import java.util.Scanner;

public class Ejercise2 {

	public static void main(String[] args) {
		int nota;
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe un numero del 1 al 7: ");
		nota = sc.nextInt();
		switch (nota) {
		case 1->
		System.out.println("lunes");
		case 2->
		System.out.println("martes");
		case 3->
		System.out.println("miercoles");
		case 4->
		System.out.println("jueves");
		case 5->
		System.out.println("viernes");
		case 6->
		System.out.println("sabado");
		case 7->
		System.out.println("domingo");
		default ->
		System.out.println("numero no valido");
		}

	}

}

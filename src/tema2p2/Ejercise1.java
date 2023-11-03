package tema2p2;

import java.util.Scanner;
public class Ejercise1 {

	public static void main(String[] args) {
		int nota;
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe su nota: ");
		nota = sc.nextInt();
		switch (nota) {
		case 0,1,2,3,4->
		System.out.println("Suspenso");
		case 5->
		System.out.println("Suficiente");
		case 6->
		System.out.println("bien");
		case 7,8->
		System.out.println("notable");
		case 9,10->
		System.out.println("sobresaliente");
		default ->
		System.out.println("nota incorrecta");
		}

	}

}

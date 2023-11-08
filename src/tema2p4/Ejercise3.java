package tema2p4;

import java.util.Scanner;

public class Ejercise3 {

	public static void main(String[] args) {
		int num,contador=0,suma=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("escribe un numero para cerrar el buble: ");
		num = sc.nextInt();
		do {
			contador++;
			suma+=contador;
		} while(contador!=num);
		System.out.println(suma);
		

	}

}

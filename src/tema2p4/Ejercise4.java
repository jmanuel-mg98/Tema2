package tema2p4;

import java.util.Scanner;

public class Ejercise4 {

	public static void main(String[] args) {
		int num,contador=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("escribe un numero para realizar su tabla: ");
		num= sc.nextInt();
		do {
			contador++;
			System.out.println(num+"x"+contador+"="+num*contador);
		}while(contador<10);
	}
}

package tema2p3;

import java.util.Scanner;

public class Ejercise4 {

	public static void main(String[] args) {
		int num,par;//creamos los campos
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un numero entero: ");
		num = sc.nextInt();
		while (num!=0) {//creamos el bucle
			if (num % 2 == 0) {
				System.out.print("este numero  es par. introduce otro numero entero. si no quieres introducir mas, escribe 0: ");
				num=sc.nextInt();
			}
			else {
				System.out.print("este numero es impar. introduce otro numero entero. si no quieres introducir mas, escribe 0: ");
				num=sc.nextInt();
			}
			
			
		}
		
	

	}

}

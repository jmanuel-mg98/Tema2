package tema2p3;

import java.util.Scanner;

public class Ejercise1 {

	public static void main(String[] args) {
		int num,suma=0;//creamos los campos
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero positivo. En caso de no querer poner ninguno más, escriba un numero entero negativo: ");
		num = sc.nextInt();
		while (num>=0) {//creamos el bucle
			suma = suma+num;
			System.out.println("Escribe un numero entero positivo. En caso de no querer poner ninguno más, escriba un numero entero negativo: ");
			num = sc.nextInt();
		}
		System.out.print("la suma total de todos los numeros introducidos es: "+suma);
		//cerramos el buble
	}

}

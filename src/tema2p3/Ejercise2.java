package tema2p3;

import java.util.Scanner;

public class Ejercise2 {

	public static void main(String[] args) {
		int num,total=0;//creamos los campos
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero positivo. En caso de no querer poner ninguno más, escriba un numero entero negativo: ");
		num = sc.nextInt();
		while (num>=0) {//creamos el bucle
			total++;
			System.out.println("Escribe un numero entero positivo. En caso de no querer poner ninguno más, escriba un numero entero negativo: ");
			num = sc.nextInt();
		}
		System.out.print("la cantidad total de numeros introducidos es: "+total);
		//cerramos el buble

	}

}

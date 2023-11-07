package tema2p3;

import java.util.Scanner;

public class Ejercise3 {

	public static void main(String[] args) {
		int num,total=0 ,suma=0;
		double media;//creamos los campos
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero positivo. En caso de no querer poner ninguno más, escriba un numero entero negativo: ");
		num = sc.nextInt();
		while (num>=0) {//creamos el bucle
			suma= suma+ num;
			total++;
			System.out.println("Escribe un numero entero positivo. En caso de no querer poner ninguno más, escriba un numero entero negativo: ");
			num = sc.nextInt();
		}
		media = suma/total;
		System.out.print("la media total de todos los numeros introducidos es: "+media);
		//cerramos el buble

	}

}

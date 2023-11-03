package tema2p2;

import java.util.Scanner;

public class Ejercise3 {

	public static void main(String[] args) {
		double numero1, numero2,resultado;
		String opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce 2 numeros: ");
		numero1 = sc.nextDouble();
		numero2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("seleccione las siguientes opciones: sumar,restas,multiplicar,dividir");
		opcion = sc.nextLine();
		switch (opcion) {
		case "sumar"->{
			resultado = numero1 + numero2;
			System.out.println(resultado);	
			}
		case "restar"->{
			resultado = numero1 - numero2;
			System.out.println(resultado);	
			}
		case "multiplicar"->{
			resultado = numero1 * numero2;
			System.out.println(resultado);	
			}
		case "dividir"->{
			resultado = numero1 / numero2;
			System.out.println(resultado);	
			}
		default ->
			System.out.println("opcion no correcta");
		}
		
		

	}

}

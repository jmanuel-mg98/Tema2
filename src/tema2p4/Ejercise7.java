package tema2p4;

import java.util.Scanner;

public class Ejercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion;
		do {
		double numero1, numero2,resultado;
		System.out.println("introduce 2 numeros: ");
		numero1 = sc.nextDouble();
		numero2 = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("seleccione las siguientes opciones: sumar,restas,multiplicar,dividir o salir");
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
		case "salir"->{
		}
		default ->
			System.out.println("opcion no correcta");
		}
		}while(!opcion.equalsIgnoreCase("salir"));
		
	}

}

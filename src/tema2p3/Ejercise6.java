package tema2p3;

import java.util.Scanner;

public class Ejercise6 {

	public static void main(String[] args) {
		int contador = 1,num,suma=0,cuentaAlumnos=0,cuentaMe=0;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la edad del alumno: ");
		num = sc.nextInt();
		while(num >= 0) {
			suma=suma+num;
			cuentaAlumnos++;
			System.out.print("Introduzca la edad del alumno: ");
			num = sc.nextInt();
			if (num>=18) {
				cuentaMe++;
			}
			
		}
		media=suma/cuentaAlumnos;
		System.out.println("la suma de todas las edades es: "+suma);
		System.out.println("la media de edad es: "+media);
		System.out.println("el numero de alumno es: "+cuentaAlumnos);
		System.out.println("hay "+cuentaMe+" alumnos mayores de edad");
	}

}	

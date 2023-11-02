package tema2p1;

import java.util.Scanner;

public class Ejercise6 {

	public static void main(String[] args) {
		int a,b,c;
		long discriminante;
		double x1,x2;
		Scanner cs = new Scanner(System.in);
		System.out.print("indica los 3 coeficientes: ");
		a = cs.nextInt();
		b = cs.nextInt();
		c = cs.nextInt();
		discriminante = (long) Math.pow(b, 2)-(4*a*c);
		if (discriminante<0) {
			System.out.print("la ecuacion no tiene solocion");
		}
		else {
			if (discriminante==0) {
			x1 = (double) -c/b;
			System.out.println("la solucion de la ecuacion es " + x1);
		} else {
			x1 = (-b + Math.sqrt(discriminante))/(2*a);
			x2 = (-b - Math.sqrt(discriminante))/(2*a);
			System.out.println("las soluciones de las ecuaciones son " + x1 + x2);
		}
			
		}

	}

}

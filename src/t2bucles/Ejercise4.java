package t2bucles;

import java.util.Scanner;

public class Ejercise4 {

	public static void main(String[] args) {
		int numA,numB,mcd=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		numA=sc.nextInt();
		System.out.print("Escribe otro numero: ");
		numB=sc.nextInt();
		if (numA>numB) {
			for (int i = numB;numA % i == 0 && numB % i == 0; i--) {
	                mcd = i;
	            }
	   }else if(numA<numB){
		   for (int i = numA;numA % i == 0 && numB % i == 0; i--) {
               mcd = i;
		   }
	   }
	        System.out.println("El máximo común divisor de " + numA + " y " + numB + " es: " + mcd);
	}
}

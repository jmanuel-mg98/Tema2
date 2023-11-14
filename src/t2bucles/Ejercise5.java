package t2bucles;

import java.util.Scanner;

public class Ejercise5 {

	public static void main(String[] args) {
		int numA,numB, mcm=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		numA=sc.nextInt();
		System.out.print("Escribe otro numero: ");
		numB=sc.nextInt();
		if (numA>numB) {
			for (int i = numA;numA % i == 0 && numB % i == 0; i++) {
	                mcm = i;
	            }
	   }else if(numA<numB){
		   for (int i = numB;numA % i == 0 && numB % i == 0; i++) {
               mcm = i;
		   }
	   }
	        System.out.println("El minimo común multiplo de " + numA + " y " + numB + " es: " + mcm);
	}
}

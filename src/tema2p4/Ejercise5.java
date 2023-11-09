package tema2p4;

import java.util.Random;
import java.util.Scanner;

public class Ejercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomMas=100,randomMenos=1,num;
		boolean acertado=true;
		do {
		Random rand = new Random();
		num= rand.nextInt(randomMenos,randomMas);
		System.out.println("¿Es " + num + " tu número? (Mayor / Menor / Igual)");
		String respuesta = sc.nextLine().toLowerCase();
		if(respuesta.equalsIgnoreCase("mayor")) {
			randomMenos=num;
			num= rand.nextInt(randomMenos,randomMas);
		}else if (respuesta.equalsIgnoreCase("menor")) {
			randomMas=num;
			num= rand.nextInt(randomMenos,randomMas);
		}else if(respuesta.equalsIgnoreCase("igual")){
			acertado=false;
			System.out.println("he acertado lo siento");
		}else {
			System.out.println("dato incorrecto");
		}
			
		}while(acertado);

	}

}

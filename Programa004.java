package apache;

import java.util.Scanner;

public class Programa004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		byte edad;
		edad = leer.nextByte();
		
		if (edad>=18)
			System.out.println("Usted es mayor de edad prro");
		else
			System.out.println("Usted es menor de edad >:V");
		
	}

}

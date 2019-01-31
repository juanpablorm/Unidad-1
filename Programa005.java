package apache;

import java.util.Scanner;

public class Programa005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa tu Calificacion: ");
		byte calif;
		calif = leer.nextByte();
		
		if (calif>=80)
			System.out.println("Ya la armaste men <3(APROBADO)");
		else
			System.out.println("Ya valiste men :´V(REPROBADO)");
		
	}

}

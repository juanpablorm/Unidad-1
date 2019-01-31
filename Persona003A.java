package apache;

import java.util.Scanner;

public class Persona003A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa tu nombre:");
		String nombre ;
		nombre = leer.nextLine();
		System.out.println("Ingresa tu edad");
		byte edad;
		edad = leer.nextByte();
		System.out.println("Ingresa tu estatura");
		float estatura;
		estatura = leer.nextFloat();
		
		System.out.println("Bienvenido "+nombre+" tu edad es de "+edad+" y tu estatura es "+estatura);
		
		Persona a = new Persona();
		a.setNombre(nombre);
		a.setEdad(edad);
		a.setEstatura(estatura);
		
		System.out.print(a);
		
		int c=0;
		c=c+10;
		
	}

}

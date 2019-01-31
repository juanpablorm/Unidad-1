import java.util.Scanner;

public class Programa07 {
	
	public static void main(String[]args) {
		Scanner l=new Scanner(System.in);
			double c;
		System.out.println("..:::Conversor de °Fahrenheit a °Centigrados:::..");
		System.out.println("");
		System.out.println("Ingresa los grados fahrenheit a convertir");
			float f=l.nextFloat();
				c=(f-32)/1.8;
				
		System.out.println("De °"+f+" fahrenheit se convirtio a °"+c+" centigrados");
	}

}
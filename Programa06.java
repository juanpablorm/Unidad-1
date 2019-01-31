
import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner l=new Scanner(System.in);
		System.out.println("Escribe un número, y te dire si es par o impar");
		
			int n=l.nextInt();
			
		if(n%2==0) {
			System.out.println("El número "+n+" es par");
		}
		else {
			System.out.println("El número "+n+" es impar");
		}
	}
}
package neup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		byte a=1;
		byte b;
		double n=0.0, t=0.0;
		DecimalFormat format = new DecimalFormat("'$'#,###,###.##");
		
		System.out.println("¿Cuantos productos desea comprar?");
			b=sc.nextByte();
			
		do {
			System.out.println("Ingrese el valor del producto "+a);
			n=sc.nextDouble();
				t=t+n;
				a++;
				
		}while(a<=b);
		
		System.out.println("El monto total es: "+t);
		
		if(t>=1500){
			t=t*1.11;
		}else{
			t=t*1.10;
		}
		System.out.println("El resultado con aumento total es: "+format.format(t));
	}

}

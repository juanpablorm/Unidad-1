package neup;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Programa10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		byte numero=0;
		int suma=0;
		DecimalFormat format = new DecimalFormat("'$'#,###,###.##");
		
		do{
			System.out.println("ingrese numero:");
			numero = sc.nextByte();
			if(numero >=0 && numero <=76){
				
				
			}
		} while (numero<=76);

		System.out.println();
	}
	

}
package vape;

import java.util.Scanner;
public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Selecciona "
				+ "1- Pulgadas/Centimetro "
				+ "2- Pies/Centimetros "
				+ "3- Pies/Pulgadas ");
		byte opc1 = sc.nextByte();
		switch (opc1){
		
		case 1:
			System.out.println("Ingrese las pulgadas");
			float cm = sc.nextFloat();
			double a = cm*2.54;
			System.out.println("Su resultado en centimetros es: "+a);
			break;
		case 2:
			System.out.println("Ingrese las pies");
			float ft = sc.nextFloat();
			double b = ft*30.48;
			System.out.println("Su resultado en centimetros es: "+b);
			break;
		case 3:
			System.out.println("Ingrese las pies");
			float pi = sc.nextFloat();
			double c = pi*12;
			System.out.println("Su resultado en pulgadas es: "+c);
			
			break;
			
		default:
			System.out.println("Ese no vale");
			break;
		}

	}
}
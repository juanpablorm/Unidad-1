package vape;

import java.util.Scanner;
public class Programa08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Selecciona el dia del 1-7");
		byte num_sem = sc.nextByte();
		switch (num_sem){
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
			
		default:
			System.out.println("Ese no vale");
			break;
		}
		
	}

}


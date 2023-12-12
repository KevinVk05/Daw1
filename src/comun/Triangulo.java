package comun;

import java.util.Scanner;

public class Triangulo {
	static final double pi = 3.14;
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Intro lado 1");
			int ladoc1=in.nextInt();
			System.out.println("Intro lado 2");
			int ladoc2=in.nextInt();
			double area=calcularArea(ladoc1, ladoc2);
			System.out.println(area);
			System.out.println("Introduce radio");
			int radio=in.nextInt();
			System.out.println(calcularAreaCilindro(radio));
		}
		public static double calcularArea(int lado1, int lado2) {
			return (lado1*lado2)/2;
			
		}
		public static double calcularAreaCilindro(int radio) {
			return (2*pi*radio)+(2*pi*(radio*radio));
		}
		

	}




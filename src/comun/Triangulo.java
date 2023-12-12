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
			System.out.println(calcularArea(ladoc1, ladoc2));
		}
		public static double calcularArea(int lado1, int lado2) {
			return (lado1*lado2)/2;
			
		}
}

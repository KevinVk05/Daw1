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
			System.out.println("Introduce el diametro de la circunferencia");
			double diametro = in.nextDouble();
			System.out.println("introduce el radio de la circunferencia");
			double radio = in.nextDouble();
			calcularPerimetroyRadio(diametro,radio);
		}
		public static double calcularArea(int lado1, int lado2) {
			return (lado1*lado2)/2;
			
		}
		public static void calcularPerimetroyRadio(double radio, double diametro) {
			double pi = 3.14;
			double perimetro = 2*pi*radio;
			double area = pi * radio * radio;
			System.out.println("el perimetro de la circunferencia es: "+ perimetro+" el area de la circunferencia es: "+ area);
		}
		


}

package project;

import java.util.Locale;
import java.util.Scanner;

import entities.Medidas;

public class Area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			Medidas medidas = new Medidas();	
			
			System.out.println("Enter rectangle width and height: ");
			double altura =	medidas.altura = sc.nextDouble();
			double largura = medidas.largura = sc.nextDouble();
		
				
			double area = medidas.calculoArea(altura, largura);
			
			System.out.println("AREA: " + area);
			
			double perimetro = medidas.calculoPerimetro(altura, largura );
			
			System.out.println("PERIMETER: " + perimetro);
			
			
			double diagonal = medidas.calculoDiagonal(altura, largura );
			
			System.out.println("DIAGONAL: " + diagonal);
			
			
	
		sc.close();
	}

}

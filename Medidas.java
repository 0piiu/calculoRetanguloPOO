package entities;

public class Medidas {

	public double altura;	
	public double largura;	
	
	public double calculoArea(double a, double b) {
		
		double valueArea  = a * b;
	
		return valueArea;
	}

	public double calculoPerimetro(double a, double b) {
			
		double soma = 2 * (a + b);
		
		return soma;
	}
		
	public double calculoDiagonal(double a, double b ) {
			
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		
		double soma = a + b;
		
		soma = Math.sqrt(soma);
		
		return soma;
	}
}

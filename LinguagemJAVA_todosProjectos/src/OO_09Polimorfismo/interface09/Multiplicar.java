package OO_09Polimorfismo.interface09;


public class Multiplicar implements Calculador {

	public double calcular(double a, double b) {
		double result = a * b;
		return result;
	}

}

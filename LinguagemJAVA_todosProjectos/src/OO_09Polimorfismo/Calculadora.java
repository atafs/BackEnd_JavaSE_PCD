package OO_09Polimorfismo;

public class Calculadora {

	public double calcular(double a, double b, char c) {
		double resultado = 0.0;

		if (c == '+') {
			resultado = a + b;
		} else if (c == '-') {
			resultado = a - b;
		} else if (c == '/') {
			resultado = a / b;
		} else if (c == '*') {
			resultado = a * b;
		}

		return resultado;
	}
}

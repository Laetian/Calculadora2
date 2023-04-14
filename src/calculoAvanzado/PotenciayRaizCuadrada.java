package calculoAvanzado;

public class PotenciayRaizCuadrada {

	public void potencia(double base, double exponente) {
		System.out.println("Potencia de " + base + " exponente " + exponente + " es: " + Math.pow(base, exponente));

	}

	public void raizCuadrada(double base, double exponente) {

		System.out.println(
				"Raiz  de " + base + " exponente " + exponente + " es: " + Math.pow(base, (double) 1 / exponente));
	}

}

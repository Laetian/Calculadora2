package calculoAvanzado;

public class PotenciayRaizCuadrada {

	public void potencia(double base, double exponente ) {
		double resultado = 0;
		for(int i=0;i<exponente;i++) {
			resultado+=base*base;
		}
		System.out.println("Potencia de "+base+" exponente "+exponente+" es: "+resultado);
		
	}
	public void raizCuadrada(double base, double exponente) {

		System.out.println("Raiz  de "+base+" exponente "+exponente+" es: "+Math.pow(base,(double)1/exponente));
	}
	
}

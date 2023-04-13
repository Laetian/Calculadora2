package menu;

import calculoAvanzado.PotenciayRaizCuadrada;
import calculoAvanzado.SenoCosenoTangente;

public class MenuCalculoAvanzado {

	public void menuCalculoAvanzado() {

		PotenciayRaizCuadrada potenciayRaizCuadrada = new PotenciayRaizCuadrada();
		SenoCosenoTangente senoCosenoTangente = new SenoCosenoTangente();
		Inputs inputs = new Inputs();
		int opcion = 0;
		Double inputA = 0.0;
		Double inputB = 0.0;

		boolean salir = false;

		System.out.println("¡Bienvenido a la calculadora!");
		do {
			System.out.println("\n Elija la opcion que quiera ejecutar pulsando"
					+ "\n 1 para potencia \n 2 para raiz  \n 3 para seno \n 4 para coseno \n 5 para tangente \n 0 para salir a menu principal ");
			opcion = inputs.opcion();

			if (opcion >= 0 && opcion <= 5) {
				switch (opcion) {
				case 0:
					System.out.println("Volviendo a menu principal");
					salir = true;
					break;
				case 1:
					inputA = inputs.input(3);
					inputB = inputs.input(4);
					potenciayRaizCuadrada.potencia(inputA, inputB);
					salir = inputs.continuar();
					break;
				case 2:
					inputA = inputs.input(3);
					inputB = inputs.input(4);
					potenciayRaizCuadrada.raizCuadrada(inputA, inputB);
					salir = inputs.continuar();
					break;
				case 3:
					inputA = inputs.input(5);
					senoCosenoTangente.seno(inputA);
					salir = inputs.continuar();
					break;
				case 4:
					inputA = inputs.input(5);
					senoCosenoTangente.coseno(inputA);
					salir = inputs.continuar();
					break;
				case 5:
					inputA = inputs.input(5);
					senoCosenoTangente.tangente(inputA);
					salir = inputs.continuar();
					break;
				}
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuCalculoAvanzado();
			}
		} while (salir == false);

	}

}

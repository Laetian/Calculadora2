package menu;

import java.util.Scanner;

import calculoAvanzado.PotenciayRaizCuadrada;
import calculoAvanzado.SenoCosenoTangente;

public class MenuCalculoAvanzado {

	public void menuCalculoAvanzado() {

		PotenciayRaizCuadrada potenciayRaizCuadrada = new PotenciayRaizCuadrada();
		SenoCosenoTangente senoCosenoTangente = new SenoCosenoTangente();
		int opcion = 0;
		Double inputA = 0.0;
		Double inputB = 0.0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		System.out.println("¡Bienvenido a la calculadora!");
		do {
			System.out.println("\n Elija la opcion que quiera ejecutar pulsando"
					+ "\n 1 para potencia \n 2 para raiz  \n 3 para seno \n 4 para coseno \n 5 para tangente \n 0 para salir a menu principal ");
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuCalculoAvanzado();
			}

			if (opcion >= 0 && opcion <= 5) {
				switch (opcion) {
				case 0:
					System.out.println("Volviendo a menu principal");
					salir = true;
					break;
				case 1:
					inputA = input(1);
					inputB = input(2);
					potenciayRaizCuadrada.potencia(inputA, inputB);
					salir = continuar();
					break;
				case 2:
					inputA = input(1);
					inputB = input(2);
					potenciayRaizCuadrada.raizCuadrada(inputA, inputB);
					salir = continuar();
					break;
				case 3:
					inputA = input(3);
					senoCosenoTangente.seno(inputA);
					salir = continuar();
					break;
				case 4:
					inputA = input(3);
					senoCosenoTangente.coseno(inputA);
					salir = continuar();
					break;
				case 5:
					inputA = input(3);
					senoCosenoTangente.tangente(inputA);
					salir = continuar();
					break;
				}
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuCalculoAvanzado();
			}
		} while (salir == false);

	}

	public Double input(int opcion) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double input = 0;
		if (opcion == 1) {
			System.out.println("Introduce la base: ");
		}
		if (opcion == 2) {
			System.out.println("Introduce el exponente: ");
		}
		if (opcion == 3) {
			System.out.println("Introduce el número sobre el que calcular: ");
		}

		if (sc.hasNextDouble()) {
			input = sc.nextDouble();
		} else {
			System.out.println("Input no valido, debes introducir un número");
			input = input(1);
		}
		return input;
	}

	public boolean continuar() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String si = "s";
		String no = "n";
		System.out.println("¿Quiere continuar operando? s/n");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase(si)) {
			return false;
		}
		if (response.equalsIgnoreCase(no)) {
			System.out.println("Volviendo a menu principal");
			return true;
		} else {
			System.out.println("Input no válido, debe introdcur una opción válida");
			continuar();
			return false;
		}
	}

}

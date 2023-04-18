package menu;

import java.util.Scanner;

public class Inputs {

	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);

	public Double input(int opcion) {

		double input;

		if (opcion == 1) {
			System.out.println("Introduce el primer número: ");
		}
		if (opcion == 2) {
			System.out.println("Introduce el segundo número: ");
		}

		if (opcion == 3) {
			System.out.println("Introduce la base: ");
		}

		if (opcion == 4) {
			System.out.println("Introduce el exponente: ");
		}

		if (opcion == 5) {
			System.out.println("Introduce el número sobre el que calcular: ");
		}

		if (sc.hasNextDouble()) {
			input = sc.nextDouble();
			return input;
		} else {
			System.out.println("Input no valido, debes introducir un número");
			sc.next();
			return  input(opcion);
		}

	}

	public int opcion() {

		int input = 0;
		if (sc.hasNextInt()) {
			input = sc.nextInt();
			return input;
		} else {
			System.out.println("Input no valido, debes introducir un número");
			sc.next();
			return opcion();
		}


	}

	public boolean continuar() {

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
			return continuar();
		}

	}
}

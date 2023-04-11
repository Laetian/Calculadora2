package menu;

import java.util.Scanner;

import calculobasico.MultiplicacionyDivision;
import calculobasico.SumayResta;



public class MenuCalculoBasico {
	
	public void menuCalculoBasico() {

		SumayResta sumayResta = new SumayResta();
		MultiplicacionyDivision multiplicacionyDivision = new MultiplicacionyDivision();
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		int opcion = 0;
		Double inputA = 0.0;
		Double inputB = 0.0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		System.out.println("¡Bienvenido a la calculadora!");
		do {
			System.out.println("\n Elija la opcion que quiera ejecutar pulsando"
					+ "\n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir \n 0 para salir a menu principal ");
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuCalculoBasico();
			}

			if (opcion >= 0 && opcion <= 4) {
				switch (opcion) {
				case 0:
					menuPrincipal.menuPrincipal();
 
					break;
				case 1:
					inputA = input(1);
					inputB = input(2);
					sumayResta.suma(inputA, inputB);
					salir = continuar();
					break;
				case 2:
					inputA = input(1);
					inputB = input(2);
					sumayResta.resta(inputA, inputB);
					salir = continuar();
					break;
				case 3:
					inputA = input(1);
					inputB = input(2);
					multiplicacionyDivision.multiplicacion(inputA, inputB);
					salir = continuar();
					break;
				case 4:
					inputA = input(1);
					inputB = input(2);
					multiplicacionyDivision.division(inputA, inputB);
					salir = continuar();
					break;
				}
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuCalculoBasico();
			}
		} while (salir == false);

	}
	
	public Double input(int opcion) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double input = 0;
		if (opcion == 1) {
			System.out.println("Introduce el primer número: ");
		}
		if (opcion == 2) {
			System.out.println("Introduce el segundo número: ");
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

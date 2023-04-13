package menu;

import java.util.Scanner;

import calculobasico.MultiplicacionyDivision;
import calculobasico.SumayResta;

public class MenuCalculoBasico {

	public void menuCalculoBasico() {

		SumayResta sumayResta = new SumayResta();
		MultiplicacionyDivision multiplicacionyDivision = new MultiplicacionyDivision();
		Inputs input = new Inputs();
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
					System.out.println("Volviendo a menu principal");
					salir = true;
					break;
				case 1:
					inputA = input.input(1);
					inputB = input.input(2);
					sumayResta.suma(inputA, inputB);
					salir = input.continuar();
					break;
				case 2:
					inputA = input.input(1);
					inputB = input.input(2);
					sumayResta.resta(inputA, inputB);
					salir = input.continuar();
					break;
				case 3:
					inputA = input.input(1);
					inputB = input.input(2);
					multiplicacionyDivision.multiplicacion(inputA, inputB);
					salir = input.continuar();
					break;
				case 4:
					inputA = input.input(1);
					inputB = input.input(2);
					multiplicacionyDivision.division(inputA, inputB);
					salir = input.continuar();
					break;
				}
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuCalculoBasico();
			}
		} while (salir == false);

	}
}

package menu;

import java.util.Scanner;

public class MenuPrincipal {

	MenuCalculoBasico menuCalculoBasico = new MenuCalculoBasico();
	MenuCalculoAvanzado menuCalculoAvanzado = new MenuCalculoAvanzado();

	int opcion = 0;
	Double inputA = 0.0;
	Double inputB = 0.0;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	boolean salir = false;

	public void menuPrincipal() {

		System.out.println("¡Bienvenido a la calculadora!");
		do {
			System.out.println("\n Elija la opcion que quiera ejecutar pulsando"
					+ "\n 1 para calculo básico \n 2 para calculo avanzado \n 0 para salir del programa");
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuPrincipal();
			}

			if (opcion >= 0 && opcion <= 2) {
				switch (opcion) {
				case 0:
					salir = true;
					break;
				case 1:
					menuCalculoBasico.menuCalculoBasico();
					break;
				case 2:
					menuCalculoAvanzado.menuCalculoAvanzado();
					break;
				}
			} else {
				System.out.println("Input no válido, debe introdcur una opción válida");
				menuPrincipal();
			}
		} while (salir == false);

	}

}
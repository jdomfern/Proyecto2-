import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		menuUsuario();
	}
	private static void menuUsuario() {
		Scanner sc= new Scanner(System.in);
		int opcion;



		System.out.println("************************\n\tBienvenid@\n");
		do {
			pantallazoMenu(); // En los metodos hemos almacenado los sysout del menu

			System.out.println("Introduzca una opci�n");
			opcion = sc.nextInt();
			switch (opcion) { // En cada case esta indicado el contenido del metodo anterior
			case 1: Metodos.incorporarPersonas();
			break;

			case 2:menuBusqueda();


			break;
			case 3:
				System.out.println("VUELVA PRONTO!");
				break;
			default:
				System.out.println("Introduzca una opci�n v�lida");
			}
		} while (opcion != 3); // Mientras no se escoja salir se sigue ejecutando
	}




	private static void menuBusqueda() {
		Scanner sc= new Scanner(System.in);
		int eleccion;
		eleccionBusqueda(); // En los metodos hemos almacenado los sysout del menu

		System.out.println("Seleccione una opcion");
		eleccion = sc.nextInt();
		switch (eleccion) { // En cada case esta indicado el contenido del metodo anterior
		case 1: 
			break;

		case 2:

			break;
		case 3:

			break;
		case 4:
			
			break;
		default:
			System.out.println("Introduzca una opcion valida");
		}
	}
	private static void eleccionBusqueda() {
		System.out.println("�C�mo desea buscar pareja?\n");
		System.out.println("1.Con filtros\n");
		System.out.println("2.Persona con m�s cosas en com�n\n");
		System.out.println("3.Personas con menos cosas en com�n\n");
		System.out.println("4.B�squeda aleatoria\n");
		System.out.println("*********************");

	}
	private static void pantallazoMenu() {
		System.out.println("�Qu� desea hacer?\n");
		System.out.println("1.A�adir a una nueva persona\n");
		System.out.println("2.Buscar emparejamiento\n");
		System.out.println("3.Salir del programa\n");
		System.out.println("*********************");
	}

}





package ej2;

import java.util.Scanner;

/*
 * Eloi Martorell
 * Marc Lopez
 * Ixabel
 * Java 1.8
 * 
 * */
public class ej2App {

	//static Scanner sc para invocarlo desde los metodos también
	static Scanner sc = new Scanner(System.in);

	// Creamos un array de objetos de la clase VideoJuego
	static Videojuego arrayVideojuegos[] = new Videojuego[5];
	// Creamos un array de objetos de la clase Serie
	static Serie arraySeries[] = new Serie[5];

	public static void main(String[] args) {
		
		//metodo para rellenar algunos arrays
		rellenarArrays();

		//usamos el metodo para imprimir por pantalla el menú
		imprimirPantalla();


		int proces = sc.nextInt();
		
		//menu con sus diferentes opciones
		while (proces != 0) {

			switch (proces) {
			case 1:
				mostrarSeries(arraySeries);
				imprimirPantalla();
				proces = sc.nextInt();

				break;
			case 2:
				mostrarVideojuegos(arrayVideojuegos);
				System.out.println("");
				imprimirPantalla();
				proces = sc.nextInt();
				
				break;

			case 3:
				entregarJuegos(arrayVideojuegos);
				imprimirPantalla();
				proces = sc.nextInt();
				break;
				
			case 4:
				entregarSeries(arraySeries);
				imprimirPantalla();
				proces = sc.nextInt();
				break;
				
			case 5:
				devolverJuegos(arrayVideojuegos);
				imprimirPantalla();
				proces = sc.nextInt();
				break;
				
			case 6:
				devolverSeries(arraySeries);
				imprimirPantalla();
				proces = sc.nextInt();
				break;
				
			case 7:
				juegosEntregados(arrayVideojuegos);
				imprimirPantalla();
				proces = sc.nextInt();
				break;
			case 8:
				seriesEntregados(arraySeries);
				imprimirPantalla();

				proces = sc.nextInt();
				break;
			case 9:
				comprarHorasTemporadas(arraySeries);
				imprimirPantalla();
				proces = sc.nextInt();
				break;
			case 10:
				compararHorasVideojuego(arrayVideojuegos);
				imprimirPantalla();
				proces = sc.nextInt();
				break;

			default:
				//comprobamos que se ha introducido el numero correcto
				System.out.println("");
				System.out.println("Tienes que introducir una de las opciones:");
				imprimirPantalla();
				proces = sc.nextInt();

				break;
			}

		}
		
		//cerramos teclado
		sc.close();

	}

	// metodo comparar con array de objetos como parametro
	public static void compararHorasVideojuego(Videojuego[] v) {
		
		
		System.out.println("                                 ");
		System.out.println("----- Juego con mas horas: -----");
		System.out.println("                                 ");


		int num = 0;
		int id = 0;

		for (int i = 0; i < v.length; i++)
			if (v[i].getHorasEstimadas() > num) {
				num = v[i].getHorasEstimadas();
				id = i;
			}

		System.out.println("El juego con mas horas es " + v[id].getTitulo() + " con " + v[id].getHorasEstimadas()
				+ " horas estimadas.");

	}

	// metodo comparar con array de objetos como parametro
	public static void comprarHorasTemporadas(Serie[] s) {
		

		System.out.println("                                 ");
		System.out.println("----- Serie con mas temporadas: -----");
		System.out.println("                                 ");
		

		int num = 0;
		int id = 0;

		for (int i = 0; i < s.length; i++)
			if (s[i].getNumeroTemporada() > num) {
				num = s[i].getNumeroTemporada();
				id = i;
			}

		System.out.println("El juego con mas horas es " + s[id].getTitulo() + " con " + s[id].getNumeroTemporada()
				+ " horas estimadas.");

	}

	// moostrar todas las series
	public static void mostrarSeries(Serie[] s) {

		System.out.println("                                 ");
		System.out.println("----- Las Mejores Series 2021 -----");
		System.out.println("                                 ");

		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i]);

		}

	}

	// moostrar todas los videojuegos
	public static void mostrarVideojuegos(Videojuego[] v) {

		System.out.println("                                 ");
		System.out.println("----- Los Mejores Videojuegos 2021 -----");
		System.out.println("                                 ");

		for (int i = 0; i < v.length; i++) {

			System.out.println(v[i]);

		}

	}

	// Entregar algunos juegos con el mï¿½todo entregar()
	public static void entregarJuegos(Videojuego[] v) {

		

		mostrarVideojuegos(arrayVideojuegos);

		System.out.println("                                 ");
		System.out.println("----- Entregar Juegos -----");
		System.out.println("                                 ");

		System.out.println("Que juego quieres entregar");
		int idjuego = sc.nextInt();

		// Decir que objeto nos han devuelto
		v[idjuego].entregar();

		// Mostrar objeto devuelto

		System.out.println(v[idjuego]);

	}

	//metodo para devolver videojuegos
	public static void devolverJuegos(Videojuego[] v) {

		
		mostrarVideojuegos(arrayVideojuegos);

		System.out.println("                                 ");
		System.out.println("----- Devolver Juegos -----");
		System.out.println("                                 ");

		System.out.println("Que juego quieres devolver");
		int idjuego = sc.nextInt();

		// Decir que objeto nos han devuelto
		v[idjuego].devolver();

		// Mostrar objeto devuelto

		System.out.println(v[idjuego]);

	}
	
	//metodo para devolver series
	public static void devolverSeries(Serie[] s) {

		
		mostrarSeries(arraySeries);

		System.out.println("                                 ");
		System.out.println("----- Devolver Juegos -----");
		System.out.println("                                 ");

		System.out.println("Que serie quieres devolver");
		int idjuego = sc.nextInt();

		// Decir que objeto nos han devuelto
		s[idjuego].devolver();

		// Mostrar objeto devuelto

		System.out.println(s[idjuego]);

	}

	// Entregar algunos juegos con el mï¿½todo entregar()
	public static void entregarSeries(Serie[] s) {

		
		mostrarSeries(arraySeries);

		// DONE Entregar series
		System.out.println("                                 ");
		System.out.println("----- Entregar Series -----");
		System.out.println("                                 ");

		System.out.println("Que serie quieres entregar");
		int idserie = sc.nextInt();

		// Decir que objeto nos han devuelto
		s[idserie].entregar();

		// Mostrar objeto devuelto

		System.out.println(s[idserie]);

	}

	// Entregar algunos juegos con el mï¿½todo entregar()
	public static void entregarVideojuegos(Videojuego[] v) {

		

		mostrarVideojuegos(arrayVideojuegos);

		// DONE Entregar Videojueos
		System.out.println("                                 ");
		System.out.println("----- Entregar Videojuegos -----");
		System.out.println("                                 ");

		System.out.println("Que videojuego quieres entregar");
		int idvideo = sc.nextInt();

		// Decir que objeto nos han devuelto
		v[idvideo].entregar();

		// Mostrar objeto devuelto

		System.out.println(v[idvideo]);

	}

	// Contar los videojuegos hay entregadas. Al contarlas, devolverlas
	public static void juegosEntregados(Videojuego[] v) {

		System.out.println("                                 ");
		System.out.println("----- Juegos Entregados -----");
		System.out.println("                                 ");

		for (int i = 0; i < v.length; i++) {

			if (v[i].isEntregado() == true) {
				System.out.println(v[i]);
			}

		}

	}

	// Contar cuantas serieshay entregadas. Al contarlos, devolverlos
	public static void seriesEntregados(Serie[] s) {

		System.out.println("                                 ");
		System.out.println("----- Series Entregadas -----");
		System.out.println("                                 ");

		for (int i = 0; i < s.length; i++) {

			if (s[i].isEntregado() == true) {
				System.out.println(s[i]);
			}

		}

	}
	
	//metodo para compactar el menu
	public static void imprimirPantalla() {
		System.out.println("");
		System.out.println("");
		System.out.println("1 - Todas las Series 2 - Todos los Videojuegos 3 - Entregar Videojuegos  4 - Entregar Series");
		System.out.println("5 - Devolver Videojuegos  6 - Devolver Series 7 - Juegos Entregados  8 - Serie Entregados");
		System.out.println("9 - Comparar Horas Series 10 - Comparar horas videojuegos 0 - Salir");
		System.out.println("");
		System.out.println("");
	}

	// Entregar algunos juegos con el mï¿½todo entregar()
	public static void rellenarArrays() {

		// Creamos objetos en cada posicion de arrayVideojuegos d

		arrayVideojuegos[0] = new Videojuego("Tomb Raider: Legend", 19, "Aventura", "Humansoft");
		arrayVideojuegos[1] = new Videojuego("Elden Ring ", 98, "accion", "Humansoft");
		arrayVideojuegos[2] = new Videojuego("Red Dead Redemption 2 ", 43, "Accion", "Humansoft");
		arrayVideojuegos[3] = new Videojuego("The Last of Us Remasterizado ", 21, "Aventura", "Humansoft");
		arrayVideojuegos[4] = new Videojuego("Persona 5", 12, "Rol", "Humansoft");

		// Creamos un objeto en cada posiciï¿½n de arraySeries

		arraySeries[0] = new Serie("Pose", 1, "drama", "FX Productions");
		arraySeries[1] = new Serie("Eternals", 4, "aventura", "FX Productions");
		arraySeries[2] = new Serie("Red", 2, "miedo", "FX Productions");
		arraySeries[3] = new Serie("Amor ocasional", 2, "comedia", "FX Productions");
		arraySeries[4] = new Serie("Mystery", 3, "misterio", "FX Productions");

	}

}
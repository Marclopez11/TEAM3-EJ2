package ej2;

public class ej2App {

	public static void main(String[] args) {

		// Creamos un array de objetos de la clase VideoJuego
		Videojuego arrayVideojuegos[] = new Videojuego[5];
		// Creamos un array de objetos de la clase Serie
		Serie arraySeries[] = new Serie[5];

		// Creamos objetos en cada posicion de arrayVideojuegos d

		arrayVideojuegos[0] = new Videojuego("Tomb Raider: Legend", 19, "Aventura", "Humansoft");
		arrayVideojuegos[1] = new Videojuego("Elden Ring ", 98, "accion", "Humansoft");
		arrayVideojuegos[2] = new Videojuego("Red Dead Redemption 2 ", 43, "Accion", "Humansoft");
		arrayVideojuegos[3] = new Videojuego("The Last of Us Remasterizado ", 21, "Aventura", "Humansoft");
		arrayVideojuegos[4] = new Videojuego("Persona 5", 12, "Rol", "Humansoft");

		// Creamos un objeto en cada posici�n de arraySeries

		arraySeries[0] = new Serie("Pose", 1, "drama", "FX Productions");
		arraySeries[1] = new Serie("Eternals", 4, "aventura", "FX Productions");
		arraySeries[2] = new Serie("Red", 2, "miedo", "FX Productions");
		arraySeries[3] = new Serie("Amor ocasional", 2, "comedia", "FX Productions");
		arraySeries[4] = new Serie("Mystery", 3, "misterio", "FX Productions");

		// moostrar todas las series

		System.out.println("                                 ");
		System.out.println("----- Las Mejores Series 2021 -----");
		System.out.println("                                 ");

		for (int i = 0; i < arraySeries.length; i++) {

			System.out.println(arraySeries[i]);

		}

		// moostrar todas los videojuegos

		System.out.println("                                 ");
		System.out.println("----- Los Mejores Videojuegos 2021 -----");
		System.out.println("                                 ");

		for (int i = 0; i < arrayVideojuegos.length; i++) {

			System.out.println(arrayVideojuegos[i]);

		}

		// Entregar algunos juegos con el m�todo entregar()

		System.out.println("                                 ");
		System.out.println("----- Entregar Juegos -----");
		System.out.println("                                 ");

		// Decir que objeto nos han devuelto
		arrayVideojuegos[0].entregar();
		arrayVideojuegos[4].entregar();

		// Mostrar objeto devuelto

		System.out.println(arrayVideojuegos[0]);
		System.out.println(arrayVideojuegos[4]);

		//Done devolver juegos
		System.out.println("                                 ");
		System.out.println("----- Devolver Juegos -----");
		System.out.println("                                 ");

		arrayVideojuegos[2].devolver();
		arrayVideojuegos[1].devolver();

		System.out.println(arrayVideojuegos[2]);
		System.out.println(arrayVideojuegos[1]);

		// Entregar algunas devolver con el m�todo devolver()

		System.out.println("                                 ");
		System.out.println("----- Devolver Series -----");
		System.out.println("                                 ");

		// Decir que objeto nos han devuelto

		arraySeries[2].devolver();
		arraySeries[1].devolver();



		// Mostrar objeto devuelto
		System.out.println(arraySeries[2]);
		System.out.println(arraySeries[1]);

		//DONE Entregar series
		System.out.println("                                 ");
		System.out.println("----- Entregar Series -----");
		System.out.println("                                 ");

		arraySeries[4].entregar();
		arraySeries[0].entregar();

		System.out.println(arraySeries[4]);
		System.out.println(arraySeries[0]);

		// Contar los videojuegos hay entregadas. Al contarlas, devolverlas

		System.out.println("                                 ");
		System.out.println("----- Juegos Entregados -----");
		System.out.println("                                 ");

		for (int i = 0; i < arrayVideojuegos.length; i++) {

			if (arrayVideojuegos[i].isEntregado() == true) {
				System.out.println(arrayVideojuegos[i]);
			}

		}

		// Contar cuantas serieshay entregadas. Al contarlos, devolverlos

		System.out.println("                                 ");
		System.out.println("----- Series Entregadas -----");
		System.out.println("                                 ");

		for (int i = 0; i < arraySeries.length; i++) {

			if (arraySeries[i].isEntregado() == true) {
				System.out.println(arraySeries[i]);
			}

		}
		
		System.out.println("                                 ");
		System.out.println("----- Juego con mas horas: -----");
		System.out.println("                                 ");
		compararHorasVideojuego(arrayVideojuegos);
		
		System.out.println("                                 ");
		System.out.println("----- Serie con mas temporadas: -----");
		System.out.println("                                 ");
		comprarHorasTemporadas(arraySeries);

	}

	//metodo comparar con array de objetos como parametro
	public static void compararHorasVideojuego(Videojuego[] v) {

		int num = 0;
		int id = 0;

		for (int i = 0; i < v.length; i++)
			if(v[i].getHorasEstimadas() > num){
				num = v[i].getHorasEstimadas();
				id = i;
			}
		
		System.out.println("El juego con mas horas es " + v[id].getTitulo() + " con " + v[id].getHorasEstimadas() + " horas estimadas.");

	}
	
	//metodo comparar con array de objetos como parametro
	public static void comprarHorasTemporadas(Serie[] s) {

		int num = 0;
		int id = 0;

		for (int i = 0; i < s.length; i++)
			if(s[i].getNumeroTemporada() > num){
				num = s[i].getNumeroTemporada();
				id = i;
			}
		
		System.out.println("El juego con mas horas es " + s[id].getTitulo() + " con " + s[id].getNumeroTemporada() + " horas estimadas.");

	}

}
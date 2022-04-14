package ej2;

public class ej2App {
	
	public static void main(String[] args) {

    //Creamos un array de objetos de la clase VideoJuego
    Videojuego arrayVideojuegos[]=new Videojuego[5];
    //Creamos un array de objetos de la clase Serie
    Serie arraySeries[]=new Serie[5];

    //Creamos objetos en cada posicion de arrayVideojuegos
    arrayVideojuegos[0]=new Videojuego("Tomb Raider: Legend", 7.5, true, "Aventura", "Humansoft");

    //Creamos un objeto en cada posición de arraySeries
    arraySeries[0]=new Serie("Pose", 1, true, "drama", "FX Productions");
	
	}
}
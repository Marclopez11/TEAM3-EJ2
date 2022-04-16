package ej2;

/*
 * Ixabel
 * Java 1.8
 * 
 * */

public interface Entregable {
	
//M�todo entregar. Cambia el atributo prestado a true. 
public void entregar();

//M�todo devolver. Cambia el atributo prestado a false.
public void devolver();

//Devuelve el estado del atributo prestado.
public boolean isEntregado();

//Compara las horas estimadas en los videojuegos y en las series el n�mero de temporadas d
public void compareTo(Object a);

}
package ej2;

public interface Entregable {
	
//M�todo entregar. Cambia el atributo prestado a true. 
public void entregar();

//M�todo devolver. Cambia el atributo prestado a false.
public void devolver();

//Devuelve el estado del atributo prestado.
public boolean isEntregado();

//Compara las horas estimadas en los videojuegos y en las series el n�mero de temporadas
public void compareTo(Object a);

}
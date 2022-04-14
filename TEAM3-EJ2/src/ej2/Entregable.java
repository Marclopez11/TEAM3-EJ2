package ej2;


public interface Entregable {
	
//Método entregar. Cambia el atributo prestado a true. 
public void entregar();

//Método devolver. Cambia el atributo prestado a false.
public void devolver();

//Devuelve el estado del atributo prestado.
public Boolean isEntregado();

//Compara las horas estimadas en los videojuegos y en las series el número de temporadas
public void compareTo(Object a);


}
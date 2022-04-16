package ej2;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

public class Videojuego implements Entregable {

	private String titulo;
	private int horasEstimadas;
	private Boolean entregado;
	private String genero;
	private String compania;

	//por defecto
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compania = "";

	}

	//con dos parametros titulo y horas
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compania = "";

	}

	//con todos los parametros
	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	public String getcompania() {
		return compania;
	}

	public void setcompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}

	
	@Override
	public void entregar() {
		
		this.entregado = true;
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stubd
		
		return this.entregado;
		
	}

	@Override
	public void compareTo(Object a) {
		int aInt = (int) a;

        if(this.horasEstimadas < aInt) {
            System.out.println("Tiene menos temporadas.");
        }else if (this.horasEstimadas > aInt) {
            System.out.println("Tiene mas temporadas.");
        }else {
            System.out.println("Tiene las mismas temporadas");
        }
		
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

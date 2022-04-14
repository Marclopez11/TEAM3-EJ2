package ej2;

public class Serie implements Entregable{
	
	//titulo numero de teporadas entregado genero creador
	
	protected String titulo;
	protected int numeroTemporada;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	//por defecto
	protected Serie() {
		this.titulo = "";
		this.numeroTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	protected Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	//todo menos entregado
	protected Serie(String titulo, int numeroTemporada, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporada = numeroTemporada;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporada() {
		return numeroTemporada;
	}

	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporada=" + numeroTemporada + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	

}

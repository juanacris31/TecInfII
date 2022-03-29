package POO;

public class Pelicula {
	private String titulo;
	private String genero;
	private String director;
	private int a�o;
	private double duracion;
	private Boolean visto;
	public Pelicula() {
		super();
	}
	public Pelicula(String titulo,  String director) {
		super();
		this.titulo = titulo;
		this.genero = "Ficcion";
		this.director = director;
		this.a�o = 1999;
		this.duracion = 2.5;
		this.visto = false;
	}
	public Pelicula(String titulo, String genero, String director, int a�o, double duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.a�o = a�o;
		this.duracion = duracion;
		this.visto = false;

	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", a�o=" + a�o
				+ ", duracion=" + duracion + ", visto=" + visto + "]";
	}


}

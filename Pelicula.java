package POO;

public class Pelicula {
	private String titulo;
	private String genero;
	private String director;
	private int año;
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
		this.año = 1999;
		this.duracion = 2.5;
		this.visto = false;
	}
	public Pelicula(String titulo, String genero, String director, int año, double duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.año = año;
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
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", año=" + año
				+ ", duracion=" + duracion + ", visto=" + visto + "]";
	}


}

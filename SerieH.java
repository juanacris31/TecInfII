package POO;

public class SerieH extends Pelicula {
	private int num_temporadas;

	public SerieH(String titulo,  String director) {
		super();
		this.setNum_temporadas(1);
	}

	public int getNum_temporadas() {
		return num_temporadas;
	}

	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}

	

}

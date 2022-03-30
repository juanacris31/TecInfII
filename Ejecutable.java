package POO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pelicula> pelicula=new ArrayList<Pelicula>(); //rray que guarda PELIS
		List<SerieH> serie=new ArrayList<SerieH>(); //rray que guarda SERIES
        Pelicula p= new Pelicula("Encantada","Will Smith");
        pelicula.add(p);
        Pelicula p1= new Pelicula("Encantada2","Will Smith");
        pelicula.add(p1);
        Pelicula p2= new Pelicula("Hechizada","Eugenio Derbez");
        pelicula.add(p2);
        Pelicula p3= new Pelicula("Dora", "ficcion", "Eugenio Derbez", 2020, 2.30);
        pelicula.add(p3);
        Pelicula p4= new Pelicula("Carrie", "terror", "Stephen king", 1999, 1.30);        
        pelicula.add(p4);
        
        SerieH s= new SerieH("euphoria", "Harry");
        serie.add(s);
        SerieH s1= new SerieH("elite", "Pedro Paramo");
        serie.add(s1);
        SerieH s2= new SerieH("malcom in the middle", "John");
        serie.add(s2);
        SerieH s3= new SerieH("gambito de dama","Carlos Rivera" );  
        serie.add(s3);
        SerieH s4= new SerieH("chicas buenas","Robert K" ); 
        serie.add(s4);

for(int i=0; i<5;i++) {
	System.out.println(pelicula.get(i));
	System.out.println(serie.get(i));

}


	}

}

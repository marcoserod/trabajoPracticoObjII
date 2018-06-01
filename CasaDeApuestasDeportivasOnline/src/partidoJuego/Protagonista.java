package partidoJuego;

import java.util.ArrayList;
import java.util.List;

public abstract class Protagonista {
	String nombre;
	List<String> resultados;
	
	
	public Protagonista(String nombre) {
		this.nombre = nombre;
		this.resultados = new ArrayList<String>();
	}
	
	public abstract String getNombre();
	public abstract List<String> getResultados();
	
}

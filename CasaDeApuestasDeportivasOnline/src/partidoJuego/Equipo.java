package partidoJuego;

import java.util.List;

public class Equipo extends Protagonista{
	
	private List<Deportista> deportistas;
	
	public Equipo(String nombre, List<Deportista> deportistas) {
		super(nombre);
		this.deportistas = deportistas;
		
		
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public List<String> getresultados() {
		return this.resultados;
	}
	
	public List<Deportista> getDeportistas() {
		return this.deportistas;
	}

}

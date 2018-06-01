package partidoJuego;

import java.util.List;

public class Deporte {
	private String tipoOponente;
	private List<String> posiblesResultados;
	
	public Deporte(String tipoOponente, List<String> posiblesResultados) {
		this.tipoOponente = tipoOponente;
		this.posiblesResultados = posiblesResultados;
	}
	
	public String getTipoOponente() {
		return this.tipoOponente;
	}
	
	public List<String> getPosiblesResultados() {
		return this.posiblesResultados;
	}
	
}
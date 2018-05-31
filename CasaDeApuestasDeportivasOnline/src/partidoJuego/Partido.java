package partidoJuego;

import java.util.Date;
import java.util.List;


public class Partido {
	private Date fechaDeComienzo;
	private String horaDeComienzo;
	private String lugar;
	private Estado estadoResultado;
	private String resultado;
	private List <Protagonista> oponentes;
	

	public Partido(String lugar) {
		this.fechaDeComienzo = new Date();
		this.lugar = lugar;
		this.estadoResultado  = new NoIniciado();
	}

	public Date getFechaDeComienzo() {
		return this.fechaDeComienzo;
	}
	
	public String getLugar() {
		return this.lugar;
	}
	
	public List<Protagonista> getOponentes(){
		return this.oponentes;
	}
	
	public String getResultado() {
		Estado noIniciado = new NoIniciado();
		if (this.estadoResultado.equals(noIniciado)){
			new RuntimeException("El partido no ha inciado");
		}
		
		return this.resultado;
	}
	 
	
	public void nextState(Estado estado) {
		if (this.estadoResultado != estado)  {
			this.estadoResultado = estado;
		} else {
			new RuntimeException("No puede volver al estado anterior");
		}
	}
	
}


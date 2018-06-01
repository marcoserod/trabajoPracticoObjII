package cuotaDeApuesta;
import partidoJuego.*;

public class CuotaDeApuesta {

	private Algoritmo algoritmoDeProbabilidad;
	private Protagonista protagonistaA;
	private Protagonista protagonistaB;
	
	public CuotaDeApuesta(Partido partido) {
		this.protagonistaA = partido.getOponentes().get(0);
		this.protagonistaB = partido.getOponentes().get(1);
		this.algoritmoDeProbabilidad = new HistoriaReciente();
	}
	
	
	public int cuotaEmpate() {
		return 1 + (1-this.algoritmoDeProbabilidad.probabilidadDeEmpate(this.protagonistaA, this.protagonistaB));
	}
	
	public int cuotaVictoriaA() {
		return 1 + (1 - this.algoritmoDeProbabilidad.probabilidadDeVictoria(this.protagonistaA, this.protagonistaB));
	}
	
	public int cuotaVictoriaB() {
		return 1 + (1-this.algoritmoDeProbabilidad.probabilidadDeVictoria(this.protagonistaB, this.protagonistaA));
	}
	
	
}

package cuotaDeApuesta;
import partidoJuego.*;

import java.util.List;

public class HistoriaReciente extends Algoritmo {

	
	@Override
	public int probabilidadDeEmpate(Protagonista protagonistaA,Protagonista protagonistaB) {
		return super.probabilidadDeEmpate(protagonistaA, protagonistaB) + super.probabilidadDeEmpate(protagonistaB,protagonistaA) / 2;	
	}
	
	
	public List <String> resultados(Protagonista protagonistaA,Protagonista protagonistaB){
		return protagonistaA.getResultados().subList(this.mySubList(protagonistaA)-11,this.mySubList(protagonistaA)-1);
	}
	
	public int mySubList(Protagonista protagonista){
		return protagonista.getResultados().size();
	}
	
	
}

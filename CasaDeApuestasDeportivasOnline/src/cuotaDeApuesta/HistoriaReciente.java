package cuotaDeApuesta;

import java.util.List;

public class HistoriaReciente extends Algoritmo {

	
	@Override
	public int probabilidadDeEmpate(Protagonista protagonistaA,Protagonista protagonistaB) {
		return super.probabilidadDeEmpate(protagonistaA) + super.probabilidadDeEmpate(protagonistaB)) / 2;	
	}
	
	
	public List <String> resultados(Protagonista protagonistaA,Protagonista protagonistaB){
		return protagonistaA.resultadosUltimosPartidos(10);
	}
	
}

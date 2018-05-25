package cuotaDeApuesta;

import java.util.List;

public class CompetenciaHistorica extends Algoritmo {

	public List <String> resultados(Protagonista protagonistaA,Protagonista protagonistaB){
		return protagonistaA.resultadosContraOponente(protagonistaB);	
	}
	
	
}

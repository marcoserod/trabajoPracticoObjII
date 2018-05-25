package cuotaDeApuesta;

import java.util.List;

public abstract class Algoritmo {

	public int probabilidadDeVictoria(Protagonista protagonistaA,Protagonista protagonistaB) {
		return this.cuantosPartidosEsperados(this.resultados(protagonistaA, protagonistaB),"Victoria")
					/this.resultados(protagonistaA, protagonistaB).size();
	}
	
	public int probabilidadDeEmpate(Protagonista protagonistaA,Protagonista protagonistaB) {
		return this.cuantosPartidosEsperados(this.resultados(protagonistaA, protagonistaB), "Empate")
				/this.resultados(protagonistaA, protagonistaB).size();
	}
	
	public abstract List <String> resultados(Protagonista protagonistaA,Protagonista protagonistaB);
	
	public int cuantosPartidosEsperados(List<String> resultados,String resultadoConcreto) {
		int contador = 0;
		for(int i = 1;i < resultados.size();i++) {
			contador += this.resultadoEsperado(resultados.get(i), resultadoConcreto);
		}
		return contador;
		
	}
	
	public int resultadoEsperado(String resultado,String resultadoConcreto){
		if(resultado == resultadoConcreto) {
			return 1;
		}
		else {
			return 0;
		} 
	}
}

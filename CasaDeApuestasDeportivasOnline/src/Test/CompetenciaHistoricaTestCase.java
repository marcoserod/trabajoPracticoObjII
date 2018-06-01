package Test;

import static org.junit.Assert.*;
import partidoJuego.*;

import java.util.ArrayList;

import org.mockito.*;

import cuotaDeApuesta.CompetenciaHistorica;

import org.junit.Before;
import org.junit.Test;

public class CompetenciaHistoricaTestCase {
	private CompetenciaHistorica algoritmoCH;
	
	
	@Mock private Protagonista boca;
	@Mock private Protagonista river;
	
	@Spy
	ArrayList<String> resultados = new ArrayList<String>();
	
	@Before
	public void setUp() {
		resultados = Mockito.spy(resultados);
		boca = Mockito.mock(Protagonista.class);
		river = Mockito.mock(Protagonista.class);
		algoritmoCH = new CompetenciaHistorica();
	}

	@Test
	public void testAlgortimoCH() {
		Mockito.when(algoritmoCH.resultados(boca, river)).thenReturn(resultados);
		assertEquals(algoritmoCH.resultados(boca, river),resultados);
	}

}

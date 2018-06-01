package Test;

import static org.junit.Assert.*;
import partidoJuego.*;
import cuotaDeApuesta.*;

import java.util.ArrayList;

import org.mockito.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class HistoriaRecienteTestCase {
	private HistoriaReciente algoritmoHR;
	
	
	@Mock private Protagonista boca;
	@Mock private Protagonista river;
	
	@Spy
	ArrayList<String> resultados = new ArrayList<String>();
	
	@Before
	public void setUp() {
		resultados = Mockito.spy(resultados);
		boca = Mockito.mock(Protagonista.class);
		river = Mockito.mock(Protagonista.class);
		algoritmoHR = new HistoriaReciente();
	}
	
	@Test
	public void testHistoriaReciente() {
		algoritmoHR.mySubList(boca);
		Mockito.verify(boca.getResultados());

}
}

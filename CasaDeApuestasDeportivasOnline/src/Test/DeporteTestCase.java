package Test;

import org.mockito.*;
import static org.junit.Assert.*;
import partidoJuego.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class DeporteTestCase {
	
	private Deporte futbol;
	@Spy
	ArrayList<String> spiedList = new ArrayList<String>();
	
	@Before
	public void setUp() throws Exception { 
		spiedList.add("Empate");
		spiedList.add("Victoria");
		spiedList.add("Derrota");
		futbol = new Deporte("Individual",spiedList);
	}
	
	@Test
	public void testFutbolSeIniciaComoDeporte() {
		assertEquals("Individual",futbol.getTipoOponente());
		assertTrue(futbol.getPosiblesResultados().contains("Victoria"));
		assertTrue(futbol.getPosiblesResultados().contains("Empate"));
		assertTrue(futbol.getPosiblesResultados().contains("Derrota"));
	
	}
	

}

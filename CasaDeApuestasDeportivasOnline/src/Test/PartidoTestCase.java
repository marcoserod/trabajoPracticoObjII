package Test;

import static org.junit.Assert.*;
import partidoJuego.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.Date;

public class PartidoTestCase {
	private Partido metegol;
	private NoIniciado estado;
	
	
	@Mock private Date mockUnaFecha;
	@Mock private Estado mockUnEstado;
	@Mock private Equipo Boca;
	@Mock private Equipo River;
	
	@Spy
	ArrayList<Protagonista> spiedList = new ArrayList<Protagonista>();
	
		
	@Before
	public void setUp() {
	mockUnEstado = Mockito.mock(Estado.class);
	mockUnaFecha = Mockito.mock(Date.class);
	Boca = Mockito.mock(Equipo.class);
	River = Mockito.mock(Equipo.class);
	spiedList.add(Boca);
	spiedList.add(River);
	
	metegol = new Partido("Monumental", spiedList);
	estado = new NoIniciado();

	}

	@Test
	public void testPartidoBocaRiverIniciado() {
		assertEquals("Monumental", metegol.getLugar());
		assertNotEquals(estado.estadoPartido(), metegol.getEstado());
		assertEquals(new Date(), metegol.getFechaDeComienzo());
		assertTrue(metegol.getOponentes().contains(Boca));
		assertTrue(metegol.getOponentes().contains(River));		
	}

}

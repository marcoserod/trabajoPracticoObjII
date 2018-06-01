package Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import partidoJuego.*;
import java.util.ArrayList;

public class DeportistaTestCase {

	
	private Deportista dinho;
	
	@Before
	public void setUp() throws Exception{
		dinho = new Deportista("Ronaldo", "Moreira", "Porto Alegre", "21 de Marzo de 1980");
	}
	
	
	
	@Test
	public void testDeportistaIniciado() {
		assertEquals("Ronaldo",dinho.getNombre());
		assertEquals("Moreira",dinho.getApellido());
		assertEquals("Porto Alegre",dinho.getLugarNacimiento());
		assertEquals("21 de Marzo de 1980", dinho.getFechaNacimiento());
		assertEquals(new ArrayList<String>(),dinho.getResultados());
	}

}

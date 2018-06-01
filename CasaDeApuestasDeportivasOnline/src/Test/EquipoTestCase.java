package Test;
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import org.junit.Before;
import partidoJuego.*;
import org.mockito.*;

public class EquipoTestCase {

		private Equipo tiburonesPapiFC;
		
		@Mock private Deportista mockDeportista1;
		@Mock private Deportista mockDeportista2;
		@Mock private Deportista mockDeportista3;
		@Mock private Deportista mockDeportista4;
		@Mock private Deportista mockDeportista5;
		
		@Spy
		ArrayList<Deportista> spiedList = new ArrayList<Deportista>();
		
		@Before
		public void setUp() throws Exception{
			
			mockDeportista1 = Mockito.mock(Deportista.class);
			mockDeportista2 = Mockito.mock(Deportista.class);
			mockDeportista3 = Mockito.mock(Deportista.class);
			mockDeportista4 = Mockito.mock(Deportista.class);
			mockDeportista5 = Mockito.mock(Deportista.class);
			spiedList.add(mockDeportista1);
			spiedList.add(mockDeportista2);
			spiedList.add(mockDeportista3);
			spiedList.add(mockDeportista4);
			spiedList.add(mockDeportista5);
			tiburonesPapiFC = new Equipo("Tiburones Papi Fc", spiedList);
		}

		@Test
		public void testTiburonesFCiniciaConEquipoYSinResultados() {
			assertEquals("Tiburones Papi Fc",tiburonesPapiFC.getNombre());
			assertEquals(new ArrayList<String>(), tiburonesPapiFC.getResultados());
			assertTrue(tiburonesPapiFC.getDeportistas().contains(mockDeportista1));
		}
		

	}

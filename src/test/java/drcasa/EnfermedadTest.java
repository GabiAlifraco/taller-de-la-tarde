package drcasa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class EnfermedadTest {
	
private Infecciosa malaria; 
private Persona frank;

	@Before
	public void inicializarEscenario(){
		 malaria = new Infecciosa();
		 frank = new Persona();
		frank.setCantidadCelulasTotales(1000);
	}
	
	@Test
public void unaEnfermedadInfecciosaEsAgresiva(){
	//precondiciones-escenario-context-fixture
	malaria.setCantidadCelularAmenazadass(101);
	//se hace algo
	boolean esAgresiva = malaria.esAgresiva(frank);
	//postcondiciones - se verifica ese algo
	Assert.assertTrue(esAgresiva);
}

	@Test
public void unaEnfermedadInfecciosaNoEsAgresiva(){
	//precondiciones-escenario-context-fixture
	malaria.setCantidadCelularAmenazadass(100);
	//se hace algo
	boolean esAgresiva = malaria.esAgresiva(frank);
	//postcondiciones - se verifica ese algo
	Assert.assertFalse(esAgresiva);
}
	
}

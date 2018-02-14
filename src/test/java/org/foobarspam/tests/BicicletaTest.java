package org.foobarspam.tests;

import static org.junit.Assert.*;

import org.foobarspam.bicicleta.Bicicleta;
import org.junit.Test;

public class BicicletaTest {

	@Test
	public void constructorTest() {
		int biciId = 200;
		Bicicleta bici = new Bicicleta(biciId);
		
		assertEquals(biciId, bici.getId());
	}

}

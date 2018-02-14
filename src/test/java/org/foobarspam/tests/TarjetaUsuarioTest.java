package org.foobarspam.tests;

import static org.junit.Assert.*;

import org.foobarspam.tarjetaUsuario.TarjetaUsuario;
import org.junit.Test;

public class TarjetaUsuarioTest {

	@Test
	public void constructorTest() {
		String id = "ABC123";
		Boolean activada = true;
		TarjetaUsuario user = new TarjetaUsuario(id, activada);
		
		assertEquals(id, user.getId());
		assertEquals(activada, user.getActivada());
	}

}

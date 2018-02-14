package org.foobarspam.tests;

import static org.junit.Assert.*;

import org.foobarspam.estacion.Estacion;
import org.junit.Before;
import org.junit.Test;

public class EstacionTests {

	Estacion estacion;
	
	@Before
	public void setUp() {
		estacion = new Estacion(1, "Manacor", 6);
	}
	
	@Test
	public void getIdTest() {
		int id = 1;
		
		assertEquals(id, estacion.getId());
	}
	
	@Test
	public void getAnclajesTest() {
		int anclajes = 6;
		
		assertEquals(anclajes, estacion.getNumeroAnclajes());
	}
	
	@Test
	public void getDireccionTest() {
		String direccion = "Manacor";
		
		assertEquals(direccion, estacion.getDireccion());
	}

}

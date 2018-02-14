package org.foobarspam.tests;

import static org.junit.Assert.*;

import org.foobarspam.estacion.Estacion;
import org.foobarspam.tarjetaUsuario.TarjetaUsuario;
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
	
	@Test
	public void getAnclajesLibresTest() {
		int anclajesLibres = 6;		
		assertEquals(anclajesLibres, estacion.getAnclajesLibres());
	}
	
	@Test
	public void leerTarjetaUsuarioTest() {
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
		
		Boolean estadoUsuario = estacion.leerTarjetaUsuario(tarjetaUsuario);
		
		assertEquals(true, estadoUsuario);
	}
	

}

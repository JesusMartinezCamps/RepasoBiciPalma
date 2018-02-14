package org.foobarspam.estacion;

import java.util.ArrayList;

import org.foobarspam.bicicleta.Bicicleta;

public class Estacion {
	//attributes
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	private ArrayList<Bicicleta> anclajes = new ArrayList<Bicicleta>();
	
	//constructor	
	public Estacion(int id, String direccion, int numeroAnclaje) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclaje;
	}

	//getters & setters
	public int getId() {
		return this.id;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}
	//methods
	public void consultarEstacion() {
		System.out.println("id: " + getId());
		System.out.println("direccion: " + getDireccion());
		System.out.println("numeroAnclajes: " + getNumeroAnclajes());
	}
}

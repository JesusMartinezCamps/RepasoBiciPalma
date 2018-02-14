package org.foobarspam.estacion;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import org.foobarspam.bicicleta.Bicicleta;

public class Estacion {
	//attributes
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes;
	
	//constructor
	public Estacion(int id, String direccion, int numeroAnclaje) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclaje;
		this.anclajes =  new Bicicleta[numeroAnclajes];
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
	public Bicicleta[] getAnclajes(){
		return anclajes;
	}
	public int getAnclajesLibres() {
		int libres = 0;
		
		for (int i = 0; i < getAnclajes().length; i++) {
			if(getAnclajes()[i] == null)
				libres ++;
		}
		return libres;
	}
	
	
	//methods
	public void consultarEstacion() {
		System.out.println("id: " + getId());
		System.out.println("direccion: " + getDireccion());
		System.out.println("numeroAnclajes: " + getNumeroAnclajes());
	}
	
	public int anclajesLibres() {
		return getAnclajesLibres();
	}
		
	public int generarAnclaje() {
		return ThreadLocalRandom.current().nextInt(0, getNumeroAnclajes());
	}

	public void anclarBicicleta(Bicicleta bicicleta) {		
		for (int i = 0; i < getAnclajes().length; i++) {
			if(getAnclajes()[i] == null) {
				getAnclajes()[i] = bicicleta;
				mostrarAnclaje(bicicleta, i);
				break;
			}
		}
	}

	private void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
		System.out.println("bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + (numeroAnclaje + 1));		
	}

	public void consultarAnclajes() {
		for (int i = 0; i < getAnclajes().length; i++) {
			String estadoAnclaje = "";
			if(getAnclajes()[i] == null)
				estadoAnclaje = "Libre";
			else
				estadoAnclaje = Integer.toString(getAnclajes()[i].getId());
			
			System.out.println("Anclaje " + i + " " + estadoAnclaje);
		}
		
	}
}

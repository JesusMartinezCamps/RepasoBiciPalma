package org.foobarspam.estacion;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import org.foobarspam.bicicleta.Bicicleta;

public class Estacion {
	//attributes
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	private int anclajesLibres = 0;
	private ArrayList<Bicicleta> anclajes = new ArrayList<Bicicleta>();
	
	//constructor
	public Estacion(int id, String direccion, int numeroAnclaje) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclaje;
		this.anclajesLibres = numeroAnclaje;
		this.anclajes.ensureCapacity(numeroAnclaje);
		System.out.println("tamaño " + anclajes.size());
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
	public int getAnclajesLibres() {
		return this.anclajesLibres;
	}
	public void anclarBici() {
		anclajesLibres = anclajesLibres -1;
	}
	public ArrayList<Bicicleta> getAnclajes(){
		return anclajes;
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
		//for (int i = 0; i < getNumeroAnclajes(); i++) {
			getAnclajes().add(bicicleta);
			anclarBici();
			mostrarAnclaje(bicicleta, getAnclajes().size());
		//}
	}

	private void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
		System.out.println("bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + numeroAnclaje);		
	}

	public void consultarAnclajes() {
		System.out.println("tamaño " + getAnclajes().size());
		for (int i = 0; i < getAnclajes().size(); i++) {
			//System.out.println("Anclaje " + i + " " + getAnclajes().get(1));
		}
		
	}
}

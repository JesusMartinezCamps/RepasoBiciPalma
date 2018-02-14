package org.foobarspam.tarjetaUsuario;

public class TarjetaUsuario {
	//attributes
	private String id = "";
	private Boolean activada = false;
	
	
	//constructor
	public TarjetaUsuario(String id, boolean activada) {
		this.id = id;
		this.activada = activada;
	}
	
	//getters & setters
	public String getId() {
		return this.id;
	}
	public Boolean getActivada() {
		return this.activada;
	}

}

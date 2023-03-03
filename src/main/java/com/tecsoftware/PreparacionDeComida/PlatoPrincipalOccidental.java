package com.tecsoftware.PreparacionDeComida;

import java.math.BigDecimal;

public class PlatoPrincipalOccidental implements IPlatoPrincipal {

	
	private String nombre;
	private Double precio;
	
	public PlatoPrincipalOccidental(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "PlatoPrincipalOccidental [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}

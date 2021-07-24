package com.itac.ciro.app.entity;

public class Persona {
	int id;
	String nombres;
	String apellidos;

	public Persona(int id, String nombres, String apellidos) {		
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public Persona() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}

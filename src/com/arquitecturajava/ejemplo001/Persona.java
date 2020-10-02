package com.arquitecturajava.ejemplo001;

public class Persona {

	private int edad;
	private String nombre;

	/**
	 * Constructor por defecto. Siempre existe si no hay otro constructor
	 * sobrecargado con parametros. Si existe otro constructor sobrecargado, hay que
	 * definir este explicitamente.
	 */
	public Persona() {

		this.edad = 20;

	}

	/**
	 * Constructor con parametros. Sirve para construir la instancia de la Persona
	 * inicializando valores directamente.
	 * 
	 * @param edad   edad de la persona.
	 * @param nombre nombre de la persona.
	 */
	public Persona(int edad, String nombre) {

		this.setEdad(edad);
		this.nombre = nombre;

	}

	/**
	 * Método para devolver la edad de la persona.
	 * 
	 * @return edad de la persona.
	 */
	public int getEdad() {

		return this.edad;

	}

	/**
	 * Método para establecer la edad de la persona.
	 * 
	 * @param edad valor de la edad a establecer.
	 */
	public void setEdad(int edad) {

		if (edad >= 100) {
			this.edad = 99;
		} else if (edad < 0) {
			this.edad = 0;

		} else {
			this.edad = edad;

		}

	}

	/**
	 * Te da el valor del nombre.
	 * 
	 * @return nombre de la persona.
	 */
	public String getNombre() {

		return this.nombre;
	}

	/**
	 * Establecer el valor del nombre.
	 * 
	 * @param nombre valor del nombre a establecer.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	

}

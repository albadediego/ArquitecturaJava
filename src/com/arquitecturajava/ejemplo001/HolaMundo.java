package com.arquitecturajava.ejemplo001;

public class HolaMundo {

	public static void main(String[] args) {

		System.out.println("Hola mundo");
		System.out.println("Hola mundo");

		// Crear una instancia de tipo Persona.
		Persona persona1 = new Persona(-5, "Julia");
		Persona persona2 = new Persona();
		
		System.out.println("Edad persona1: " +persona1.getEdad());
		System.out.println("Nombre persona1: " +persona1.getNombre());
		System.out.println("Edad persona2: " +persona2.getEdad());
		System.out.println("Nombre persona2:" +persona2.getNombre());
		
		persona1.setEdad(-20);
		persona1.setNombre("Maria");
		persona2.setEdad(30);
		persona2.setNombre("Jose");

		System.out.println("Edad persona1: " +persona1.getEdad());
		System.out.println("Nombre persona1: " +persona1.getNombre());
		System.out.println("Edad persona2: " +persona2.getEdad());
		System.out.println("Nombre persona2:" +persona2.getNombre());
		
		System.out.println(persona1);
		
	}

}

package sprint;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
// la clase usuario implementa la interfaz asesoria de donde obtendra el metodo analizar usuario
public abstract class  Usuario implements Asesoria{
	//atributos generales del usuario
	private String nombre;
	private String fechaNacimiento;
	private Integer rut;

	
	public Usuario() {}

	// constructor del usuario estos atributos seran heredados a los otros tipos de usuario
	public Usuario (String nombre, String  fechaNacimiento, Integer rut){
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
		
		
	}
	
// metodos accesores al estar los atributos encasuplados(privados) para poder utilizarlos en las otras clases las traremos con get y set

	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public String  getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String  fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public  Integer getRut() {
		return rut;
	}
	
	public void setRut( Integer rut) {
		this.rut= rut;
	}
	
	// con el toString podemos acceder a atributos especificos del usuario 
	@Override 
	public String toString() {
		return "Nombre: " + nombre + " \n RUT " + rut + " \n Fecha de nacimiento " + fechaNacimiento;
	}
	
	//con este metodo podemos calcular la edad del usuario tomando como referencia la fecha de nacimiento, siendo un atributo heredado del usuario a sus tipos, se podria calcular la edad de cada uno dellos
	public abstract String mostrarEdad();
	
	
	
	//sobreescribimos el metodo 
	@Override
	public String analizarUsuario() {
		String fechaNacimientoStr = getFechaNacimiento(); // Obtener la fecha de nacimiento como String
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter); // Convertir la cadena a LocalDate
	    
	    LocalDate fechaActual = LocalDate.now();
	    int edad = Period.between(fechaNacimiento, fechaActual).getYears(); // Calcular la edad
        return "El usuario tiene " + edad + " años" +" \nEl RUT del usuario es " + rut;
	}



}

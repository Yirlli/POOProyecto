package sprint;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Profesional extends Usuario{
	//atributos propios del tipo de usuario
	private String titulo;
	private String fechaIngreso;
	
	
	//creamos el constructor el cual incluye los atributos heredados del usuario y los atributos propios de su tipo
	public Profesional(String nombre, String  fechaNacimiento,  Integer rut, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, rut);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
		
		
	}

	// metodos accesores de los atributos propios del tipo de usuario
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	//sobreescribimos el metodo analizar usuario donde se muestran los datos solicitados
	
	@Override
	public String toString() {
		return "Profesional [\nNombre: " +getNombre() + "\nRun : " + getRut() + "\nEdad :" + mostrarEdad()+"" +analizarUsuario() + "]" 
				;
	}
	
	@Override
	public String analizarUsuario() {
		super.analizarUsuario();
		return "El titulo del usuario es: " + titulo + " \nLa fecha de ingreso del usuario es: " + fechaIngreso;
	}
	
	@Override
	public String mostrarEdad() {
		String fechaNacimientoStr = getFechaNacimiento(); // Obtener la fecha de nacimiento como String
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter); // Convertir la cadena a LocalDate
	    
	    LocalDate fechaActual = LocalDate.now();
	    int edad = Period.between(fechaNacimiento, fechaActual).getYears(); // Calcular la edad
		return "El usuario tiene "+ edad + "años";
	}


}

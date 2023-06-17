package sprint;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Administrativo extends Usuario {

	//atributos propios del tipo de usuario
	private String area;
	private String experienciaPrevia;
	
	
	//creamos el constructor el cual incluye los atributos heredados del usuario y los atributos propios de su tipo
	public Administrativo(String nombre, String  fechaNacimiento, Integer rut, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
		
		
		
	}
	// metodos accesores de los atributos propios del tipo de usuario

	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}


	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	//sobreescribimos el metodo analizar usuario donde se muestran los datos solicitados
	@Override
    public String  analizarUsuario() {
        super.analizarUsuario();
        return "Area: " + area +"\nExperiencia previa: " + experienciaPrevia;
    }
	    
	@Override
	public String toString() {
		return "Administrativo [Nombre : "+ getNombre()+ " "+ mostrarEdad()+"\nRun : " + getRut() +""+analizarUsuario()+ "]";
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

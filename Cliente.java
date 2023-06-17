package sprint;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente extends Usuario {
	//atributos propios del tipo de usuario
	
	private Capacitacion capacitacion;
	private Accidente accidente;
	private VisitaTerreno visitaTerreno;
	private String apellidos;
	private Integer telefono;
	private String afp;
	private int sistemaDeSalud;
	private String direccion;
	private String comuna;
	private int edad;
	


	
	
	//creamos el constructor el cual incluye los atributos heredados del usuario y los atributos propios de su tipo
	public Cliente(String nombre, String fechaNacimiento, Integer rut, String apellidos, Integer telefono,  String afp, int sistemaDeSalud, String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, rut);
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud =sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	
	
	// metodos accesores de los atributos propios del tipo de usuario

	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public Integer getTelefono() {
		return telefono;
	}



	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}



	public String getAfp() {
		return afp;
	}



	public void setAfp(String afp) {
		this.afp = afp;
	}



	public int getSistemaDeSalud() {
		return sistemaDeSalud;
	}



	public void setSistemaDeSalud(int sistemaDeSalud) {
		this.sistemaDeSalud = sistemaDeSalud;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getComuna() {
		return comuna;
	}



	public void setComuna(String comuna) {
		this.comuna = comuna;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	// con el toString podemos acceder a los atributos especificados del usuario para mostrarlo por consola
	@Override
	public String toString() {
		return "Cliente [Nombre " + getNombre() + "\nApellidos :" + apellidos + "\nRun " +getRut() +"\n"+mostrarEdad()+ "\nTelefono : (+569) " + telefono + " \nAFP : " +obtenerSistemaSalud() + analizarUsuario() + "]";
	}
	


// con el metodo concatenamos el nombre y el apellido del usuario, al ser el nombre un atributo heredado del Usuario podemos acceder a el a traves de un get o  a traves de super
	public String obtenerNombre() {
		return "El nombre completo es :" +getNombre() + "" +apellidos;
	}
	
	//con este metodo al ser el sistema de salud del tipo int (ingresando num solo 1 o 2) con las condicionales podemos retonar un valor especificado
	 public String obtenerSistemaSalud() {
	        if (sistemaDeSalud == 1) {
	            return "Fonasa";
	        } else if (sistemaDeSalud == 2) {
	            return "Isapre";
	        } else {
	            return "Desconocido";
	        }
	    }
	 
		//sobreescribimos el metodo analizar usuario donde se muestran los datos solicitados
	 
	
	@Override
    public  String analizarUsuario() {
		  super.analizarUsuario();
	        return "Direccion  :" +direccion + "Comuna  :"+comuna;
       
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


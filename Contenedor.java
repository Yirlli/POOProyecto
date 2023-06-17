package sprint;
import java.time.LocalDate;

import java.util.*;
import java.util.regex.*;

import project.Content;

public class Contenedor {
    Scanner scanner = new Scanner(System.in);
	private List<Asesoria>usuarios;
	private List<Capacitacion>capacitaciones;
	String valiDate = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
	String dias = "(lunes|martes|miercoles|jueves|viernes|sabado|domingo)";
	String horasV = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
	Integer duracion;
	String duracionStr = String.valueOf(duracion);
	/*String anolimite = "12/12/1875";*/ //retomar 
	
	public Contenedor() {
		usuarios = new ArrayList<>();
		capacitaciones = new ArrayList<>();
	}
	
	public void almacenarCliente(Scanner scanner) {
		System.out.println("------------------------------------------------");
		System.out.println("Los campos que tengan asterisco son obligatorios");
		System.out.println("------------------------------------------------");
		
		
		String nombre = scanner.nextLine();
		while(nombre.length() < 10 || nombre.length() > 50) {
			System.out.println("Ingrese el nombre del cliente*: ");
			nombre = scanner.nextLine();
		}
		System.out.println("Ingrese fecha de nacimiento del cliente (dd/mm/aaaa)* : ");
		String fechaNacimiento = scanner.next();
		while(fechaNacimiento.isBlank() || fechaNacimiento.isEmpty() || !Pattern.matches(valiDate, fechaNacimiento)) {
			System.out.println("Ingrese fecha de nacimiento del cliente (dd/mm/aaaa)*: ");
			fechaNacimiento = scanner.next();
		}
		
		System.out.println("Ingrese el rut del cliente*: ");
		Integer rut = scanner.nextInt();
		while(rut > 99999999) {
			System.out.println("Ingrese el rut del cliente*: ");
			rut = scanner.nextInt();
		}

		String apellidos  = scanner.nextLine();
		while(apellidos.length() < 10 || apellidos.length() > 50) {
			System.out.println("Ingrese los apellidos del cliente*: ");
			apellidos  = scanner.nextLine();
		}
		System.out.println("Ingrese el telefono del cliente*: ");
		Integer telefono = scanner.nextInt();
		while(telefono == null) {
			System.out.println("Ingrese el telefono del cliente*: ");
			telefono  = scanner.nextInt();
		}

		System.out.println("Ingrese la afp del cliente: ");
		String afp = scanner.next();
		while(afp.length() < 4 || afp.length() > 30) {
			System.out.println("Ingrese la afp del cliente*: ");
			afp = scanner.next();
		}
		System.out.println("-----------------------------------------");
		System.out.println("Ingrese el sistema de salud del cliente: ");
		System.out.println("      1 - Fonasa | 2 - Isapre  "          );
		System.out.println("-----------------------------------------");
		int sistemaDeSalud = scanner.nextInt();
		while(sistemaDeSalud != 1 && sistemaDeSalud !=2) {
			System.out.println("-----------------------------------------");
			System.out.println("Ingrese el sistema de salud del cliente: ");
			System.out.println("      1 - Fonasa | 2 - Isapre  "          );
			System.out.println("-----------------------------------------");
			sistemaDeSalud = scanner.nextInt();
		}

		String direccion = scanner.nextLine();
		while(direccion.length() > 70 || direccion.isEmpty()) {
			System.out.println("Ingrese la direccion del cliente: ");
			direccion = scanner.nextLine();
		}
		System.out.println("Ingrese la comuna del cliente: ");
		String comuna = scanner.nextLine();
		while(comuna.length() > 50 || comuna.isEmpty()) {
			System.out.println("Ingrese la comuna del cliente: ");
			comuna = scanner.nextLine();
		}
		System.out.println("Ingrese la edad del cliente*: ");
		int edad = scanner.nextInt();
		while(edad > 150 || edad < 0) {
			System.out.println("Ingrese la edad del cliente*: ");
			edad = scanner.nextInt();
		}
		Cliente cliente = new Cliente(nombre, fechaNacimiento, rut, apellidos, telefono, afp, sistemaDeSalud, direccion, comuna, edad);
		usuarios.add(cliente);
	}
	
	public void almacenarProfesional(Scanner scanner) {
		System.out.println("------------------------------------------------");
		System.out.println("Los campos que tengan asterisco son obligatorios");
		System.out.println("------------------------------------------------");
		

        String nombre = scanner.nextLine();
		while(nombre.length() < 10 || nombre.length() > 50) {
			System.out.println("Ingrese el nombre del profesional*: ");
			nombre = scanner.nextLine();
		}

        System.out.print("Ingrese fecha de nacimiento del profesional (dd/mm/aaaa)*: ");
        String fechaNacimiento = scanner.next();
		while(fechaNacimiento.isBlank() || fechaNacimiento.isEmpty() || !Pattern.matches(valiDate, fechaNacimiento)) {
			System.out.println("Ingrese fecha de nacimiento del profesional (dd/mm/aaaa)*: ");
			fechaNacimiento = scanner.next();
		}

        System.out.print("Ingrese el rut del profesional*: ");
        Integer rut = scanner.nextInt();
		while(rut > 99999999) {
			System.out.println("Ingrese el rut del profesional: ");
			rut = scanner.nextInt();
		}


        String titulo = scanner.nextLine();
        while(titulo.isBlank()) {
            System.out.print("Ingrese el titulo del profesional*: ");
            titulo = scanner.nextLine();
        }

        System.out.print("Fecha de ingreso (dd/mm/aaaa): ");
        String fechaIngreso = scanner.nextLine();
        while(fechaIngreso.isBlank() || !Pattern.matches(valiDate, fechaIngreso)) {
        	fechaIngreso = scanner.nextLine();

        }

        Profesional profesional = new Profesional( nombre, fechaNacimiento, rut, titulo, fechaIngreso);
        usuarios.add(profesional);
  }
	
	public void almacenarAdministrativo(Scanner scanner) {
		System.out.println("------------------------------------------------");
		System.out.println("Los campos que tengan asterisco son obligatorios");
		System.out.println("------------------------------------------------");
		

		String nombre = scanner.nextLine();
		while(nombre.length() < 10 || nombre.length() > 50) {
			System.out.println("Ingrese el nombre del administrativo*: ");
			nombre = scanner.nextLine();
		}
		System.out.println("Ingrese fecha de nacimiento del administrativo (dd/mm/aaaa)*: ");
		String fechaNacimiento = scanner.next();
		scanner.nextLine();
		while(fechaNacimiento.isBlank() || fechaNacimiento.isEmpty() || !Pattern.matches(valiDate, fechaNacimiento)) {
			System.out.println("Ingrese fecha de nacimiento del adminisitrativo (dd/mm/aaaa)*: ");
			fechaNacimiento = scanner.next();
			scanner.nextLine();
		}
		System.out.println("Ingrese el rut del administrativo*: ");
		Integer rut = scanner.nextInt();
		while(rut > 99999999) {
			System.out.println("Ingrese el rut del administrativo*: ");
			rut = scanner.nextInt();
		}

		String area = scanner.nextLine();
		while(area.length() < 5 || area.length() > 20 || area.isBlank()) {
			System.out.println("Ingrese el area del administrativo*: ");
			area = scanner.nextLine();
		}

		String experienciaPrevia = scanner.nextLine();
		while(experienciaPrevia.length() > 100 || experienciaPrevia.isEmpty()) {
			System.out.println("Ingrese la experiencia previa del administrativo: ");
			experienciaPrevia = scanner.nextLine();
		}
		Administrativo administrativo = new Administrativo(nombre, fechaNacimiento, rut, area, experienciaPrevia);
		usuarios.add(administrativo);
	}
	
	
	public void almacenarCapacitacion(Scanner scanner) {
		System.out.println("------------------------------------------------");
		System.out.println("Los campos que tengan asterisco son obligatorios");
		System.out.println("------------------------------------------------");
		

		System.out.println("Ingrese el identificador de la capacitacion*: ");
		Integer identificador = scanner.nextInt();
		while(identificador == null) {
			System.out.println("Ingrese el identificador de la capacitacion*: ");
			identificador = scanner.nextInt();
		}
		System.out.println("Ingrese el rut del cliente*: ");
		Integer rutCliente = scanner.nextInt();
		while(rutCliente > 99999999 || rutCliente == null) {
			System.out.println("Ingrese el rut del cliente*: ");
			rutCliente = scanner.nextInt();
		}
		System.out.println("Ingrese el dia de la capacitacion: ");
		String dia = scanner.next().toLowerCase();
		while(!Pattern.matches(dias, dia)) {
			System.out.println("Ingrese el dia de la capacitacion: ");
			dia = scanner.next().toLowerCase();
		};
		System.out.println("Ingrese la hora de la capacitacion (HH:MM 24H): ");
		String hora = scanner.next();
		while(!Pattern.matches(horasV, hora)) {
			System.out.println("Ingrese la hora de la capacitacion (HH:MM 24H): ");
			hora = scanner.next();
		}

		String lugar = scanner.nextLine();
		while(lugar.length() < 10 || lugar.length() > 50 || lugar.isBlank()) {
			System.out.println("Ingrese el lugar de la capacitacion*: ");
			lugar = scanner.nextLine();
		}
		System.out.println("Ingrese la duracion de la capacitacion (en HORAS): ");
		duracion = scanner.nextInt();
		while(duracionStr.length() > 70) {
			System.out.println("Ingrese la duracion de la capacitacion (en HORAS): ");
			duracion = scanner.nextInt();
		}
		System.out.println("Ingrese la cantidad de asistentes*: ");
		int cantidadAsistentes = scanner.nextInt();
		while(cantidadAsistentes < 0 || cantidadAsistentes > 1000) {
			System.out.println("Ingrese la cantidad de asistentes*: ");
			cantidadAsistentes = scanner.nextInt();
		}
		Capacitacion capacitacion = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
		capacitaciones.add(capacitacion);
	}
	public void eliminarUsuario(Scanner scanner) {
		System.out.println("------------------------------------------------------");
		System.out.println("Ingrese el RUT de la persona a la que desea eliminar: ");
		System.out.println("------------------------------------------------------");
		Integer rut = scanner.nextInt();
		for(int i = 0; i < usuarios.size(); i++) {
			Asesoria usuario = usuarios.get(i);
	        if (usuario instanceof Cliente && ((Cliente) usuario).getRut().equals(rut)) {
	            usuarios.remove(i);
	            System.out.println("Usuario eliminado correctamente.");
	            return;
	        } else if (usuario instanceof Profesional && ((Profesional) usuario).getRut().equals(rut)) {
	            usuarios.remove(i);
	            System.out.println("Usuario eliminado correctamente.");
	            return;
	        } else if (usuario instanceof Administrativo && ((Administrativo) usuario).getRut().equals(rut)) {
	            usuarios.remove(i);
	            System.out.println("Usuario eliminado correctamente.");
	            return;
	        }
		}
	}
	public void listarUsuarios() {
	       for (Asesoria usuario : usuarios) {
	            System.out.println(usuario.toString());
	        }
	}
	public void listarUsuariosPorTipo(Scanner scanner) {
		System.out.println("------------------------------------------------------");
		System.out.println("     Ingrese el tipo de usuario que desee ver:        ");
		System.out.println("      Cliente, Profesional o Administrativo           ");
		System.out.println("------------------------------------------------------");
		String tipo = scanner.next();
		for (Asesoria usuario : usuarios) {
	        if (usuario instanceof Cliente && tipo.equals("cliente")) {
	        	Cliente cliente = (Cliente)usuario;
	            System.out.println(cliente.toString());
	            return;
	        } else if (usuario instanceof Profesional && tipo.equals("profesional")) {
	        	Profesional profesional = (Profesional)usuario;
	            System.out.println(profesional.toString());
	            return;
	        } else if (usuario instanceof Administrativo && tipo.equals("administrativo")) {
	        	Administrativo administrativo = (Administrativo)usuario;
	            System.out.println(administrativo.toString());
	            return;
	        }
        }
	}
	public void listarCapacitaciones() {
	       for (Capacitacion capacitacion : capacitaciones) {
	            System.out.println(capacitacion.mostrarDetalle());
	 	       for (Asesoria usuario : usuarios) {
	 	    	   if(usuario instanceof Cliente) {
	 	    		   Cliente cliente = (Cliente)usuario;
	 	    		   if(cliente.getRut() == capacitacion.getRutCliente()) {
	 	    			   System.out.println(cliente.obtenerNombre());
	 	    			   break;
	 	    		   }
	 	    	   }
	 	       }
	        }
	}
	
	
}

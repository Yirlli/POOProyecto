package sprint;

import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main (String [] args ) {
	       
		  Contenedor contenedor = new Contenedor();
	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        System.out.println("----Bienvenido-------");
	        System.out.println("-- Sistema operativo " + LocalDate.now());
	        System.out.println("Empresa de capacitaciones y asesorías ----Gosling------");
	        do {
	            System.out.println("Menú Principal");
	            System.out.println("1. Almacenar cliente");
	            System.out.println("2. Almacenar profesional");
	            System.out.println("3. Almacenar administrativo");
	            System.out.println("4. Almacenar capacitación");
	            System.out.println("5. Eliminar usuario");
	            System.out.println("6. Listar usuarios");
	            System.out.println("7. Listar usuarios por tipo");
	            System.out.println("8. Listar capacitaciones");
	            System.out.println("9. Salir");
	            System.out.print("Ingrese una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    contenedor.almacenarCliente(scanner); 
	                    break;
	                case 2:
	                    contenedor.almacenarProfesional(scanner); 
	                    break;
	                case 3:
	                    contenedor.almacenarAdministrativo(scanner);
	                    break;
	                case 4:
	                    contenedor.almacenarCapacitacion(scanner);
	                    break;
	                case 5:
	                    contenedor.eliminarUsuario(scanner); 
	                    break;
	                case 6:
	                    contenedor.listarUsuarios();
	                    break;
	                case 7:
	                    contenedor.listarUsuariosPorTipo(scanner); 
	                    break;
	                case 8:
	                    contenedor.listarCapacitaciones();
	                    break;
	                case 9:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción incorrecta. Por favor, ingrese nuevamente.");
	            }

	            System.out.println();
	        } while (opcion != 9);

	        scanner.close();
	    }


}

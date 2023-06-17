package sprint;

import java.util.ArrayList;
import java.util.List;

public class Listado {

	//se crea una lista partiendo de asesoria
private List<Asesoria> usuarios;
    
    public Listado() {
    	//creamos la lista de usuaarios donde se var a guarsar los datos
        usuarios = new ArrayList<>();
    }
    //creamos un metodo para agregar los usuarios a la lista
    public void agregarUsuario(Asesoria usuario) {
        usuarios.add(usuario);
    }
    // con el ciclo for recorremos la lista de usuarios para poder ver cada uno de los usuarios registrados
    public void analizarUsuarios() {
        for (Asesoria usuario : usuarios) {
            usuario.analizarUsuario();
            System.out.println();
        }
    }
}

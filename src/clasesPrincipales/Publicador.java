package clasesPrincipales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Publicador extends Persona {
	
	public Publicador() {
		super();
	}
	public Publicador(String nombre, String id, String apellido, String telefono, String contrasena, String usuario) {
		super(nombre, id, apellido, telefono,contrasena, usuario);
		
	}
	/* verifica si el id existe en las bases de datos, para despues en otro metodo de la clase administrador crearle una carpeta*/
	public boolean verificarId(String ruta, String idRevisar) {
        String linea;
        boolean id = false;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                if (partes.length > 0 && partes[1].equals(idRevisar)) {
                    id = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return id;
    }
	
}

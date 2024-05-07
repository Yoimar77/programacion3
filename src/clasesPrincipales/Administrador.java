package clasesPrincipales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import logger.Logger;

public class Administrador extends Persona {

	public Administrador(String nombre, String id, String apellido, String telefono, String contrasena,
			String usuario) {
		super(nombre, id, apellido, telefono, contrasena, usuario);
	}

	public Administrador() {
	}

	/*
	 * Registra a una persona con sus respectivos datos en el archivo CSV
	 * correspondiente a su rol
	 */
	public static boolean registrarPersona(String nombre, String id, String apellido, String telefono, String rol) {
		String archivo = obtenerRutaArchivo(rol);

		// Verificar si la persona ya está registrada en el archivo
		if (verificarPersonaRegistrada(archivo, nombre, id, apellido, telefono)) {
			JOptionPane.showMessageDialog(null, "La persona ya está registrada.");
			return false;
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
			writer.write(nombre + "," + id + "," + apellido + "," + telefono + "\n");
			Logger.log("Se registró a un nuevo " + rol + ": " + nombre);
			return true;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al escribir en el archivo");
			e.printStackTrace();
			Logger.log("Error al escribir en el archivo: " + e.getMessage());
			return false;
		}
	}

	private static String obtenerRutaArchivo(String rol) {
		String archivo = "";
		switch (rol) {
		case "publicador":
			archivo = "C:\\Users\\CELUMANIA\\eclipse-workspace\\ProyectoProgramacionIII\\src\\basesDeDatosCSV\\publicadores.csv";
			break;
		case "cliente":
			archivo = "C:\\\\Users\\\\CELUMANIA\\\\eclipse-workspace\\\\ProyectoProgramacionIII\\\\src\\\\basesDeDatosCSV\\clientes.csv";
			break;
		case "gestorEnvio":
			archivo = "C:\\\\Users\\\\CELUMANIA\\\\eclipse-workspace\\\\ProyectoProgramacionIII\\\\src\\\\basesDeDatosCSV\\gestorEnvio.csv";
			break;
		case "gestorAdministrativo":
			archivo = "C:\\\\Users\\\\CELUMANIA\\\\eclipse-workspace\\\\ProyectoProgramacionIII\\\\src\\\\basesDeDatosCSV\\\\gestorAdministrativo.csv";
			break;
		}
		return archivo;
	}

	private static boolean verificarPersonaRegistrada(String archivo, String nombre, String id, String apellido,
			String telefono) {
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
			String linea;
			while ((linea = reader.readLine()) != null) {
				String[] campos = linea.split(",");
				if (campos[0].equals(nombre) && campos[1].equals(id) && campos[2].equals(apellido)
						&& campos[3].equals(telefono)) {
					return true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void crearCarpeta(String rol, String nombre, boolean registroExitoso) {
		if (registroExitoso) {
			String rutaCarpeta = "src\\" + rol + "\\" + nombre;
			try {
				File carpeta = new File(rutaCarpeta);
				if (!carpeta.exists()) {
					carpeta.mkdir();
					JOptionPane.showMessageDialog(null, "Carpeta creada exitosamente");
					// Aquí llamo al método log de la clase logger

					Logger.log("Se creó la carpeta para " + rol + ": " + nombre);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error al crear la carpeta");
				e.printStackTrace();
				// Aquí llamo al método log de la clase logger
				Logger.log("Error al crear la carpeta: " + e.getMessage());
			}
		}
	}
}

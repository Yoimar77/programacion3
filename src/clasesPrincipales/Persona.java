package clasesPrincipales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Persona {
	String nombre;
	String id;
	String apellido;
	String telefono;
	String contrasena ;
	String usuario;
	public Persona(String nombre, String id, String apellido, String telefono, String contrasena, String usuario) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.apellido = apellido;
		this.telefono = telefono;
		this.contrasena= contrasena;
		this.usuario=usuario;
	}
	public Persona() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena=contrasena;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	

	
	
}

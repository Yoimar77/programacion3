package ingreso;

public class DividirNombre {
	public DividirNombre() {
		
	}
	public String[] dividirNombre(String nombre) {
        String[] partes = nombre.split(" ");
        
        return partes;
	}

	
	
}

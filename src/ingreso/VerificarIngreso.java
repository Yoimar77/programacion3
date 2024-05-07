package ingreso;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import model.LoginAdministrador;
public class VerificarIngreso {
	 public void Verificaringreso (){
	    	
	    }
	String usuario="";
	String contrasena="";
	/* verifica al momento que se elige el rol de administrador, los datos de acceso */
	public boolean verificarDatosAdministrador() {
		boolean login=false;
		contrasena=LoginAdministrador.textFieldContraseñaAdministrador.getText();
		usuario=LoginAdministrador.textFieldUsuarioAdministrador.getText();
		if(usuario.equals("yoimar vargas restrepo")&&contrasena.equals("1096671492")) {
			login=true;
		}
		return login;
	}
	/* verifica al momento que se elige cualquier rol, los datos de acceso */
    public static boolean verificarAcceso(String nombre, String id, String rol) {
        String archivo = "";
        boolean login=false;
        String nombreCompleto;
        switch (rol) {
            case "publicadores":
                archivo = "publicadores.csv";
                break;
            case "clientes":
                archivo = "clientes.csv";
                break;
            case "gestorEnvio":
                archivo = "gestorEnvio.csv";
                break;
            case "gestorAdministrativo":
                archivo = "gestorProcesamiento.csv";
                break;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("basesDeDatosCSV/" + archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                nombreCompleto=datos[0]+" "+datos[2];
                if (nombreCompleto.equals(nombre) && datos[1].equals(id)) {
                    login=true;
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return login;
    }
   
}

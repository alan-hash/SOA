
package Modelo;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import wssoap.WSBDatos;
import wssoap.WSBDatos_Service;

/**
 *
 * @author Angel Alan Gonzalez Escalona 
 */
public class ModeloUsuario {
WSBDatos_Service obj=new WSBDatos_Service();
WSBDatos  puerto= obj.getWSBDatosPort();

public String registrarAlta(String consultsql){
    
    String leyenda;
    leyenda=puerto.altas(consultsql); 
    return leyenda;
}
   
   public String modificarRegistro(String datos, String condicion) {
    String leyenda;
    leyenda = puerto.modifica(datos, condicion);
    return leyenda;
        
    }
   
    public String borrarRegistro(String consultsql) {
    String leyenda;
    leyenda=puerto.baja(consultsql);
    return leyenda;
    }

    public Usuario consultarDatos(String consultsql) {
    String leyenda;
    leyenda=puerto.buscar(consultsql);
    return new Gson().fromJson(leyenda, Usuario.class);
    }

 
  

   

   
 
 








   



}

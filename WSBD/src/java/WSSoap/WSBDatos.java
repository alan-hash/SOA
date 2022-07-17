/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSSoap;

import Modelo.MDB;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jazmi
 */
@WebService(serviceName = "WSBDatos")
public class WSBDatos {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "altas")
    public String altas(@WebParam(name = "sqlconsultaalta") String sqlconsultaalta) {
        //TODO write your implementation code here:
        MDB administradorBD =  new MDB();
		
		String leyenda;
                //insertar
                //leyenda= administradorBD.registrarAlta("tbusuarios", "null, 'Pedro','usuarioMartínez',1234");
                leyenda= administradorBD.registrarAlta("tbusuarios", sqlconsultaalta);
                //Debe quedar asi: null, 'Juan','usuarioMendes',123
		
		return(leyenda);
        
    }
    @WebMethod(operationName = "baja")
    public String baja(@WebParam(name = "sqlconsultaalta") String sqlconsultaalta) {
        //TODO write your implementation code here:
        MDB administradorBD =  new MDB();
		
		String leyenda;
              
		leyenda = administradorBD.borrarRegistro("tbusuarios", sqlconsultaalta);
                //queda id=3
		return(leyenda);
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modifica")
    public String modifica(@WebParam(name = "datos") String datos, @WebParam(name = "condicion") String condicion) {
        //TODO write your implementation code here:
         MDB administradorBD =  new MDB();
        String leyenda;
        leyenda = administradorBD.modificarRegistro("tbusuarios", datos, condicion);
      //   
       return(leyenda);
        
    }
    
    
    
      
    @WebMethod(operationName = "buscar")
    public String buscar(@WebParam(name = "condicion") String condicion) {
        //TODO write your implementation code here:
        MDB administradorBD =  new MDB();
        final List<ArrayList<String>> datos = administradorBD.consultarDatos("tbusuarios", "*", condicion);
      //   
        for(ArrayList<String> a : datos) return new Gson().toJson(new Usuario(a.get(0), a.get(1), a.get(3), a.get(3)));
        return "vacio";
    }
    
    public static void main(final String[] args) {
                MDB administradorBD =  new MDB();
        final List<ArrayList<String>> datos = administradorBD.consultarDatos("tbusuarios", "*", "id='11'");
        datos.forEach(Buscar ->Buscar.forEach((dato) -> {
            System.out.println(dato);
        }));
    }
     

    
    
}

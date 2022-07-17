/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientebd;

import Controlador.ControladorUsuario;
import Modelo.ModeloUsuario;
import Vista.FrmClienteBD;
//import wssoap.WSBDatos;
//import wssoap.WSBDatos_Service;
/**
 *
 * @author jazmi
 */
public class ClienteBdUsuario {
//WSBDatos_Service obj=new WSBDatos_Service();
//WSBDatos  puerto= obj.getWSBDatosPort();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ModeloUsuario objModelo=new ModeloUsuario();
        FrmClienteBD objVista=new FrmClienteBD ();
        ControladorUsuario objController;
        
      
        objController = new ControladorUsuario(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
    }
    
}

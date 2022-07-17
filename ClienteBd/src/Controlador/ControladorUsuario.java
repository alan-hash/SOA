
package Controlador;
/**
 *
 * @author Angel Alan Gonzalez Escalona 
 */
//import Modelo.MDB;
import Modelo.ModeloUsuario;
import Modelo.Usuario;
import Vista.FrmClienteBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
//import wssoap.WSBDatos;
//import wssoap.WSBDatos_Service;


public class ControladorUsuario implements ActionListener{
  private FrmClienteBD _view; //el formulario 
  private ModeloUsuario _model;//el manejador de bases de datos


    
    public ControladorUsuario(FrmClienteBD view, ModeloUsuario modelo){
      this._model=modelo;
       this._view=view;
       this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario 
       this._view.cmdActualizar.addActionListener(this);
       this._view.cmdBuscar.addActionListener(this);
       this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
       this._view.cmdActualizar.addActionListener(this);
       this._view.cmdLimpiar.addActionListener(this);
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
         // System.out.print("paso");
        leyenda=_model.registrarAlta(" null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtUsuario.getText() +" ', "+_view.txtpsw.getText() );
       
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obtenindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
        
}if (e.getSource()==_view.cmdActualizar){
  String buscar="El dato se modifico exitosamente";
  
    try {
        
        buscar =_model.modificarRegistro("nombre='"+_view.txtNombre.getText()+"',Usuario='"+_view.txtUsuario.getText()+"',psw="+_view.txtpsw.getText()+"","id="+_view.txtCondicion.getText());

//buscar =_model.modificarRegistro("tbusuarios","nombre='"+_view.txtNombre.getText()+"',Usuario='"+_view.txtUsuario.getText()+"',Psw='"+_view.txtpsw.getText()+_view.txtCondicion.getText());
    } catch (Exception ex) {  
} 
  JOptionPane.showMessageDialog(null, buscar);
  limpiar();
}
if (e.getSource()==_view.cmdLimpiar){ 
limpiar();
    }

if (e.getSource()==_view.cmdBuscar){ //Si el botón presionado fue el de buscar
    Usuario Buscar =_model.consultarDatos("id="+_view.txtCondicion.getText());
    
    try {
        _view.txtNombre.setText(Buscar.getNombre());
        _view.txtUsuario.setText(Buscar.getUsuario());
        _view.txtpsw.setText(Buscar.getContra());
        
        } catch (Exception ex) { 
         String Eliminar="El ID : "+_view.txtCondicion.getText()+" No existe";
        
        
        }
        String Eliminar="El ID : "+_view.txtCondicion.getText()+" Fue encontrado exitosamente";
        JOptionPane.showMessageDialog(null, Eliminar);
       limpiar();
    

}
if (e.getSource()==_view.cmdEliminar){
    String Eliminar="Los datos del id"+_view.txtCondicion.getText()+"se eliminaron correctamente";
     try {
        Eliminar=_model.borrarRegistro("id="+_view.txtCondicion.getText());
        
        } catch (Exception ex) { }
        JOptionPane.showMessageDialog(null, Eliminar);
       limpiar();  
}

        
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtNombre.setText(null);
_view.txtUsuario.setText(null);
_view.txtpsw.setText(null);
_view.txtCondicion.setText(null);

}



}

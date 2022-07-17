package Controlador;

import Modelo.Modelo;
import Modelo.Usuario;
import pkgVista.Formulario;
import javax.swing.JOptionPane;



public class Controlador {

    private final Modelo model;
    private final Formulario view;
    
    public Controlador(final Modelo model, final Formulario view) {
        this.model = model;
        this.view = view;
        this.register();
    }
    
    private void register() {
        this.create();
        this.read();
        this.update();
        this.delete();
        this.cancel();
    }
    
    private void create() {
        this.view.cmdAlta.addActionListener((e) -> {
            this.model.create(new Usuario(
                    this.view.txtNombre.getText(), 
                    this.view.txtUsuario.getText(), 
                    Integer.valueOf(this.view.txtpsw.getText())
            ));
            this.alert("Usuario guardado", "El usuario se guardo correctamente!", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    private void read() {
        this.view.cmdBuscar.addActionListener((e) -> {
           
            final String id=this.view.txtCondicion.getText();
            final Usuario user = this.model.read(id);
            this.view.txtNombre.setText(user.getNombre());
            this.view.txtUsuario.setText(user.getUsuario());
            this.view.txtpsw.setText(String.valueOf(user.getPsw()));
            this.alert("Usuario encontrado", "Se encontro el usuario correctamente!", JOptionPane.INFORMATION_MESSAGE);
        }
        );
         
    }
    
    private void update() {
        this.view.cmdActualizar.addActionListener((e) -> {
            final int id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el id del usuario"));
            this.model.update(new Usuario(
                    id,
                    this.view.txtNombre.getText(), 
                    this.view.txtUsuario.getText(), 
                    Integer.valueOf(this.view.txtpsw.getText())
            ));
            this.alert("Usuario actualizado", "Se actualizo el usuario correctamente!", JOptionPane.INFORMATION_MESSAGE);
        });
        
    }
    
    private void delete() {
        this.view.cmdEliminar.addActionListener((e) -> {
            final String id = JOptionPane.showInputDialog("Ingrese el id del usuario");
            this.model.delete(id);
            this.alert("Usuario eliminado", "Los datos del id "+view.txtCondicion.getText()+" se eliminaron correctamente", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    private void cancel() {
        this.view.cmdLimpiar.addActionListener((e) -> {
            this.view.txtNombre.setText("");
            this.view.txtUsuario.setText("");
            this.view.txtpsw.setText("");
            this.view.txtCondicion.setText("");
        });
    }
    
    private void alert(final String title, final String message, final int jOptionPaneIcon) {
        JOptionPane.showMessageDialog(null, message, title, jOptionPaneIcon);
    }
}

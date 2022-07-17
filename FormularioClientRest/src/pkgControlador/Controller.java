/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgControlador;
import javax.swing.JOptionPane;
import pkgModel.Model;
import pkgModel.User;
import pkgVista.View;


public class Controller {

    private final Model model;
    private final View view;
    
    public Controller(final Model model, final View view) {
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
        this.view.getBtnCreate().addActionListener((e) -> {
            this.model.create(new User(
                    this.view.getTxtName().getText(), 
                    this.view.getTxtUser().getText(), 
                    Integer.valueOf(this.view.getTxtPassword().getText())
            ));
            this.alert("Usuario guardado", "El usuario se guardo correctamente!", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    private void read() {
        this.view.getBtnRead().addActionListener((e) -> {
            final String id = JOptionPane.showInputDialog("Ingrese el id del usuario");
            final User user = this.model.read(id);
            this.view.getTxtName().setText(user.getNombre());
            this.view.getTxtUser().setText(user.getUsuario());
            this.view.getTxtPassword().setText(String.valueOf(user.getPsw()));
            this.alert("Usuario encontrado", "Se encontro el usuario correctamente!", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    private void update() {
        this.view.getBtnUpdate().addActionListener((e) -> {
            final int id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el id del usuario"));
            this.model.update(new User(
                    id,
                    this.view.getTxtName().getText(), 
                    this.view.getTxtUser().getText(), 
                    Integer.valueOf(this.view.getTxtPassword().getText())
            ));
            this.alert("Usuario actualizado", "Se actualizo el usuario correctamente!", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    private void delete() {
        this.view.getBtnDelete().addActionListener((e) -> {
            final String id = JOptionPane.showInputDialog("Ingrese el id del usuario");
            this.model.delete(id);
            this.alert("Usuario eliminado", "Se elimino el usuario correctamente!", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    private void cancel() {
        this.view.getBtnCancel().addActionListener((e) -> {
            this.view.getTxtName().setText("");
            this.view.getTxtUser().setText("");
            this.view.getTxtPassword().setText("");
        });
    }
    
    private void alert(final String title, final String message, final int jOptionPaneIcon) {
        JOptionPane.showMessageDialog(null, message, title, jOptionPaneIcon);
    }
}

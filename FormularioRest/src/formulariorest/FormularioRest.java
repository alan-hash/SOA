/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariorest;

import ClienteRest.NewJerseyClient;
import Controlador.Controlador;
import Modelo.Modelo;
import pkgVista.Formulario;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author LALO
 */
public class FormularioRest {

     public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final Exception ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            final Modelo model = new Modelo(new NewJerseyClient());
            final Formulario view = new  Formulario();
            final Controlador controller = new Controlador(model, view);
            view.setVisible(true);
        });
    } 
}

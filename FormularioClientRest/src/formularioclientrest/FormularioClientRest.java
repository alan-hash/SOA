/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioclientrest;

import pkgControlador.Controller;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import pkgModel.Model;
import pkgClientRest.NewJerseyClient;
import pkgVista.View;

public class FormularioClientRest {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            final Model model = new Model(new NewJerseyClient());
            final View view = new View();
            final Controller controller = new Controller(model, view);
            view.setVisible(true);
        });
    }    
}

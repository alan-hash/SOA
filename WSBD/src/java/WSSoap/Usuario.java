/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSSoap;

/**
 *
 * @author LALO
 */
public class Usuario {
    
    private String id, nombre, usuario, contra;

    public Usuario(String id, String nombre, String usuario, String contra) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }
}

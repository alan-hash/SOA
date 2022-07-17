/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LALO
 */
public class Usuario {
      private int id;
    private String nombre;
    private String usuario;
    private int psw;
    
    public Usuario(int id, String nombre, String usuario, int psw) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.psw = psw;
    }
    
    public Usuario(String nombre, String usuario, int psw) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.psw = psw;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getPsw() {
        return psw;
    }
    
}

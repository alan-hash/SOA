/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ClienteRest.NewJerseyClient;
import com.google.gson.Gson;

/**
 *
 * @author LALO
 */
public class Modelo {
    private final NewJerseyClient client;
    private static final Gson GSON = new Gson();

    public Modelo(NewJerseyClient client) {
        this.client = client;
    }
    
    public void create(final Usuario user) {
        this.client.create_JSON(GSON.toJson(user));
    }
    
    public Usuario read(final String id) {
        return GSON.fromJson(this.client.find_JSON(String.class, id), Usuario.class);
    }
    
    public void update(final Usuario user) {
        this.client.edit_JSON(GSON.toJson(user), String.valueOf(user.getId()));
    }
    
    public void delete(final String id) {
        this.client.remove(id);
    }

    
}

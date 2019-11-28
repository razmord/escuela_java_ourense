/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo;

import java.io.Serializable;

/**
 *
 * @author Equipo 6
 */
public class Usuario implements Serializable {
    
    private int id;
    private String email;
    private String password;
    private String nombre;
    private int edad;

    public Usuario() {
    }

    public Usuario(int id, String email, String password, String nombre, int edad) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", email=" + email + ", password=" + password + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}

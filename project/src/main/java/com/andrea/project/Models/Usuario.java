package com.andrea.project.Models;



public class Usuario{
    int id;
    String nombre;
    String apellido;
    String username;
    String password;
    String correoElectronico;
    String direccion;
    //Getters
    public String getApellido() {
        return apellido;
    }
    public int getId() {
        return id;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

    //Setters
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
}

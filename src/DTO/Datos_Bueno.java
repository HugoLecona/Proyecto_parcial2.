/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Lecona
 */
public class Datos_Bueno {
    String Nombre;
    int telefono;
    int celular;
    String Direccion;
    int id;

    public Datos_Bueno(String Nombre, int telefono, int celular, String Direccion, int id) {
        this.Nombre = Nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.Direccion = Direccion;
        this.id = id;
    }

    public Datos_Bueno() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

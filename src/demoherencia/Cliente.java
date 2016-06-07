/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author Jorge Antonio
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String email;
    private String telefono;
    
    public Cliente (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = new String();
    }
    
    
    public String getNombre () {
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    
    
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    } 
    
    
    
    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion () {
        return direccion;
    }
    
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public String getOcupacion() {
        return ocupacion;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    
}
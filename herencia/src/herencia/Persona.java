/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/* Clase Padre Persona */
public class Persona {
    private String nombre;
    private String apellidos;
    private String domicilio;
    private int edad;
    
    /* Constructor */
    public Persona(String nombre, String apellidos, String domicilio, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.edad = edad;        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

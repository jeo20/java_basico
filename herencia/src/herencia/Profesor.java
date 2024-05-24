/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author m26344676
 */
public final class Profesor extends Persona {
    /* atributo cedula*/
    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public Profesor(String nombre, String apellidos, String domicilio, int edad) {
        super(nombre, apellidos, domicilio, edad);
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"PROFESOR \nNombre: " + getNombre() + " " + getApellidos() + "\nDomicilio: " + getDomicilio() + "\nEdad: " + getEdad() + "\nCedula: " + getCedula());
    }
}

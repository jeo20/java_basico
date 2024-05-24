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
public final class Alumno extends Persona {
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Alumno(String nombre, String apellidos, String domicilio, int edad) {
        super(nombre, apellidos, domicilio, edad);        
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"ALUMNO \nNombre: " + getNombre() + " " + getApellidos() + "\nDomicilio: " + getDomicilio() + "\nEdad: " + getEdad() + "\nMatricula: " + getMatricula());
    }
}

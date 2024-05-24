/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author m26344676
 */
public class Persona {
    
    /* CONSTRUCTOR PERSONA */
    /*
    public Persona (String _nombre, String _fechaNacimiento, int _edad){
        nombre = _nombre;
        fechaNacimiento = _fechaNacimiento;
        edad = _edad;
    }*/
            
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    private String fechaNacimiento;
    private int edad;
    
    /* METODO CREAPERSONA
    public void creaPersona(String _nombre, String _fechaNacimiento, int _edad){
        nombre = _nombre;
        fechaNacimiento = _fechaNacimiento;
        edad = _edad;
    }*/
    
    public int suma(int valor1, int valor2){
        return valor1 + valor2;
    }
    
    public double suma(double valor1, double valor2){
        return valor1 + valor2;
    }    
}

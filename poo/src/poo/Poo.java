/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author m26344676
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        persona objPersona = new persona();
        objPersona.creaPersona("JeO","06-03-1978", 46);
        System.out.println("Persona Creada");
        System.out.println("Nombre: "+ objPersona.getNombre());
        System.out.println("Fecha de Nacimiento: "+ objPersona.getFechaNacimiento());       
        System.out.println("Edad: "+ objPersona.getEdad());
       
       
        Persona objPersona = new Persona("Jorge","06/03/1978", 46);
        JOptionPane.showMessageDialog(null, objPersona.getNombre() + " "+objPersona.getFechaNacimiento() + " " +objPersona.getEdad());
        */
        
        Persona objPersona = new Persona();
        
        /* SOBRECARGA DE METODOS */
        JOptionPane.showMessageDialog(null, objPersona.suma(15,23));
        
        JOptionPane.showMessageDialog(null, objPersona.suma(15.59,23.265));

        
    }
    
}

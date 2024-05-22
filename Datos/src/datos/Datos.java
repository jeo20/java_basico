/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/* import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;*/
/**
 *
 * @author m26344676
 */
public class Datos {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader("salida.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine()) != null){
            System.out.println(cadena);
        }
    }

        /**
         * @param args the command line arguments
         */
        /*
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        
        String text = input.nextLine();
        
        System.out.println("Hola " + text);

        System.out.print("Numero 1: ");
        String numeroUno = input.nextLine();
        
        System.out.print("Numero 2: ");
        String numeroDos = input.nextLine();
        
        int resultado = Integer.parseInt(numeroUno) * Integer.parseInt(numeroDos);
        
        System.out.println("Resultado: " + resultado); 

        
        System.setOut(new PrintStream(new FileOutputStream("salida.txt")));
        System.out.println("Mi Archivo");
        for(int i = 1; i < 21; i++){
            System.out.println(i);
        }*/

}

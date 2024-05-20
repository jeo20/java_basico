/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sentencias;

/**
 *
 * @author m26344676
 */
public class Sentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* if else
        int a = 15;
        int b = 26;
        int c = 10;
        
        if(a > b){
            if (a > c){
                System.out.println("A es mayor");            
            }else{
                System.out.println("C es mayor");            
            }            
        } else if(b > c) {
            System.out.println("B es mayor");                        
        } else{
            System.out.println("C es mayor");            
        } */

     
        /* switch
        char letra = 'O';
        switch (letra){
            
            case 'M':
                System.out.println("Letra M");            
                break;
                
            case 'N':
                System.out.println("Letra N");
                break;
                
            case 'O':
                System.out.println("Letra O");
                break;    
        */

        /* while
        int numero = 1;
        while (numero <= 10){
            System.out.println(numero);
            numero ++;
        */    
        
        /* do while
        int numero = 10;
        do{
           System.out.println("si ingresa");
           numero --;
        } while(numero > 1);
        */
        
        /* for
        for(int n = 1; n<=10; n++){
             System.out.println(n);
        }
        */
        
        /* tabla de multiplicacion con for
        int numero = 8;
        for(int n = 1; n<=10; n++){
            int resultado = numero * n;
             System.out.println(numero + "*"+ n + "=" +resultado);
        }
        */
        
        /* tabla de multiplicacion con while
        int numero = 5;
        int n = 1;
        while (n<=10){
            int resultado = numero * n;
            System.out.println(numero + "*"+ n + "=" +resultado);
            n++;
        }*/
        
        /* tabla de multiplicacion con while
        int numero = 1;
        int n = 1;
        while (n <= 10) {
            int resultado = n % 2;
            if (resultado == 0) {
                System.out.println(n + " Es un numero par");
            } else {
                System.out.println(n + " Es un numero impar");
            }
        n++;
        }*/
        
        /* piramide */
        int limite = 10;
        for (int i=1; i< limite; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }        
    }
    
}

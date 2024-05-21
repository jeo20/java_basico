/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author m26344676
 */
public class Arreglos {
    /* ARREGLOS */
    /*     
    public static void main(String[] args) {
        int [] numeros = new int[10];
        for (int i=0; i<10; i++){
            numeros[i] = i;
            System.out.println(numeros[i]);
        }

    }
    public static void main(String[] args) {
        int[] datos = new int[10];
        int resultado = 0;
        for(int i = 0; i < 10; i++){
            datos[i] = (int) (Math.random() * 9);
            resultado = resultado + datos[i];
        }
        System.out.println("La suma de los valores es: "+resultado);
    }*/
    /* MATRICES */
        public static void main(String[] args) {
        int[][] numero = new int[4][4];
        for(int i = 0; i < 4; i++){ /* for que recorre las filas de la matriz*/
            for(int j = 0; j < 4; j++){/* for que recorre las columnas*/
                numero[i][j] = (int)(Math.random() * 9);
                System.out.print(numero[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;


public class Ejercicio_5 {

        public static void main(String[] args) {
            int[] arreglo = new int[15];

            // Llenar el arreglo de forma dinámica
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = i + 1;
            }

            // Imprimir el arreglo
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }
        }
    }


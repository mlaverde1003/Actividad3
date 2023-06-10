/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;


public class Ejercicio_8 {

    public static void main(String[] args) {
        int[] arreglo = new int[15];
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Llenar el arreglo con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(201) - 100;  // Generar números entre -100 y 100
        }

        // Contar la cantidad de positivos, negativos y ceros
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                positivos++;
            } else if (arreglo[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Imprimir el arreglo y los resultados
        System.out.println("Arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\n\nCantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }

}

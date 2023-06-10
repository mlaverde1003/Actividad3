/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;

public class Ejercicio_11 {
   

    public static void main(String[] args) {
        int[][] matriz = new int[4][6];
        int sumaEdades = 0;
        int totalEstudiantes = matriz.length * matriz[0].length;

        // Llenar la matriz con edades aleatorias
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(18) + 7;  // Generar edades entre 7 y 24 años
                sumaEdades += matriz[i][j];
            }
        }

        // Calcular el promedio de edades
        double promedioEdades = (double) sumaEdades / totalEstudiantes;

        // Imprimir la matriz con las edades
        System.out.println("Matriz con las edades:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimir el promedio de edades
        System.out.println("\nPromedio de edades: " + promedioEdades);
    }
}

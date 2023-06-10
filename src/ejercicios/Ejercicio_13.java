/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;


public class Ejercicio_13 {       

    public static void main(String[] args) {
        int n = 4; // Tamaño de la matriz

        // Crear la matriz
        int[][] matriz = new int[n][n];

        // Llenar la matriz con los valores correspondientes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = i;
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("[" + i + "][" + j + "] ");
            }
            System.out.println();
        }
    }
}

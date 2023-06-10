/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones de la matriz al usuario
        System.out.print("Ingrese el número de filas y columnas (N): ");
        int n = scanner.nextInt();

        // Verificar que las dimensiones sean válidas
        if (n <= 0) {
            System.out.println("Las dimensiones ingresadas no son válidas.");
            return;
        }

        // Crear la matriz y llenarla dinámicamente
        int[][] matriz = new int[n][n];
        llenarMatriz(matriz);

        // Imprimir la matriz
        System.out.println("Matriz generada:");
        imprimirMatriz(matriz);
    }

    // Método para llenar la matriz con valores dinámicos
    public static void llenarMatriz(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = i + j + 1;
            }
        }
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

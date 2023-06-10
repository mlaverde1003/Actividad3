/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones de las matrices al usuario
        System.out.print("Ingrese el número de filas y columnas (N): ");
        int n = scanner.nextInt();

        // Verificar que las dimensiones sean válidas
        if (n <= 0) {
            System.out.println("Las dimensiones ingresadas no son válidas.");
            return;
        }

        // Crear las matrices
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];

        // Leer los elementos de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        leerMatriz(matriz1, scanner);

        // Leer los elementos de la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        leerMatriz(matriz2, scanner);

        // Calcular la matriz resultante (suma de las dos matrices)
        int[][] matrizResultante = sumarMatrices(matriz1, matriz2);

        // Imprimir las matrices
        System.out.println("Primera matriz:");
        imprimirMatriz(matriz1);

        System.out.println("Segunda matriz:");
        imprimirMatriz(matriz2);

        System.out.println("Matriz resultante (suma):");
        imprimirMatriz(matrizResultante);
    }

    // Método para leer los elementos de una matriz
    public static void leerMatriz(int[][] matriz, Scanner scanner) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para sumar dos matrices
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int n = matriz1.length;
        int[][] matrizResultante = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizResultante[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizResultante;
    }

    // Método para imprimir una matriz
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

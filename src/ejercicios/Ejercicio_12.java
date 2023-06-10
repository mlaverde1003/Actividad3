/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;


public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones de la matriz al usuario
        System.out.print("Ingrese el número de filas (máximo 10): ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas (máximo 10): ");
        int columnas = scanner.nextInt();

        // Verificar que las dimensiones sean válidas
        if (filas <= 0 || filas > 10 || columnas <= 0 || columnas > 10) {
            System.out.println("Las dimensiones ingresadas no son válidas.");
            return;
        }

        // Crear la matriz y llenarla con los números de Fibonacci
        int[][] matriz = generarMatrizFibonacci(filas, columnas);

        // Imprimir la matriz
        System.out.println("Matriz Fibonacci:");
        imprimirMatriz(matriz);
    }

    // Método para generar una matriz con los números de Fibonacci
    public static int[][] generarMatrizFibonacci(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = num1;
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
        }

        return matriz;
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

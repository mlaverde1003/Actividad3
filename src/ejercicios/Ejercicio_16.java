/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;

public class Ejercicio_16 {

    public static void main(String[] args) {
        int n = 5; // Tamaño de la matriz
        int[][] matriz = generarMatrizAleatoria(n);

        // Imprimir la matriz
        System.out.println("Matriz generada:");
        imprimirMatriz(matriz);

        // Encontrar el número mayor y menor
        int mayor = encontrarMayor(matriz);
        int menor = encontrarMenor(matriz);

        System.out.println("El número mayor de la matriz es: " + mayor);
        System.out.println("El número menor de la matriz es: " + menor);
    }

    // Método para generar una matriz aleatoria con números pares
    public static int[][] generarMatrizAleatoria(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = random.nextInt(101); // Generar número aleatorio entre 0 y 100
                matriz[i][j] = num * 2; // Multiplicar por 2 para obtener número par
            }
        }

        return matriz;
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

    // Método para encontrar el número mayor de la matriz
    public static int encontrarMayor(int[][] matriz) {
        int mayor = matriz[0][0];
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        return mayor;
    }

    // Método para encontrar el número menor de la matriz
    public static int encontrarMenor(int[][] matriz) {
        int menor = matriz[0][0];
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }
}

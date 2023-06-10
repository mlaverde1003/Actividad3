/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;


public class Ejercicio_7 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Inicializar la matriz en 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1;
            }
        }

        // Colocar 0 en la diagonal transversal
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][matriz.length - 1 - i] = 0;
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


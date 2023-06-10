/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

public class Ejercicio_6 {


        public static void main(String[] args) {
            int[][] matriz = new int[5][6];
            int numeroImpar = 1;

            // Llenar la matriz con números impares
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = numeroImpar;
                    numeroImpar += 2;
                }
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


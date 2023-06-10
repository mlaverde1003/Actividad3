
package ejercicios;

import java.util.Random;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int[] arreglo = new int[20];
        int pares = 0;
        int impares = 0;

        // Llenar el arreglo con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101);  // Generar números aleatorios entre 0 y 100
        }

        // Contar la cantidad de números pares e impares
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Imprimir el arreglo y los resultados
        System.out.println("Arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\n\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}


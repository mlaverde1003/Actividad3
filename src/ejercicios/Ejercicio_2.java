/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gersonjimenez
 */
public class Ejercicio_2 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número natural: ");
        int numero = sc.nextInt();

        int raizDigital = calcularRaizDigital(numero);
        System.out.println("La raíz digital de " + numero + " es: " + raizDigital);
    }

    public static int calcularRaizDigital(int numero) {
        while (numero >= 10) {
            int sumaDigitos = 0;
            while (numero > 0) {
                int digito = numero % 10;
                sumaDigitos += digito;
                numero /= 10;
            }
            numero = sumaDigitos;
        }
        return numero;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Numeros;
import java.util.Scanner;

/**
 *
 * @author emont
 */
public class Menu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el tamanio del arreglo (numero de filas y columnas): ");
        int tamanio = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        int[][] matriz = new int[tamanio][tamanio];

        System.out.println("Ingrese los numeros para el arreglo:");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        while (true) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Numeros");
            System.out.println("2. Caracteres");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (opcion == 1) {
                System.out.println("Seleccione una operacion para el ejercicio de numeros:");
                System.out.println("a. Obtener el numero que mas se repite");
                System.out.println("b. Obtener la cantidad de numeros pares");
                System.out.println("c. Obtener la cantidad de numeros impares");
                System.out.println("d. Obtener la suma de los numeros en la diagonal");
                System.out.println("e. Obtener la cantidad de numeros multiplos de 5");
                char subOpcion = scanner.nextLine().charAt(0);

                switch (subOpcion) {
                    case 'a':
                        System.out.println("Numero que mas se repite: " + Numeros.obtenerNumeroMasRepetido(matriz));
                        break;
                    case 'b':
                        System.out.println("Cantidad de numeros pares: " + Numeros.obtenerCantidadPares(matriz));
                        break;
                    case 'c':
                        System.out.println("Cantidad de numeros impares: " + Numeros.obtenerCantidadImpares(matriz));
                        break;
                    case 'd':
                        System.out.println("Suma de los numeros en la diagonal: " + Numeros.obtenerSumaDiagonal(matriz));
                        break;
                    case 'e':
                        System.out.println("Cantidad de numeros multiplos de 5: " + Numeros.obtenerCantidadMultiplosDe5(matriz));
                        break;
                    default:
                        System.out.println("Opción invalida");
                }
            } else if (opcion == 2) {
                
                
                
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion invalida");
            }
        }
    }
}
    

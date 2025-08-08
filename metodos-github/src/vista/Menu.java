/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Caracteres;
import controlador.Numeros;
import java.util.Arrays;
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
        String[][] matrizCadenas = new String[tamanio][tamanio];

        System.out.println("Ingrese los numeros para el arreglo:");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz[i][j] = scanner.nextInt();
            }
             scanner.nextLine(); 
        }
        System.out.println("Ingrese las cadenas para el arreglo:");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matrizCadenas[i][j] = scanner.nextLine();
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
                 System.out.println("Seleccione una operación para el ejercicio de caracteres:");
    System.out.println("a. Cadenas que comienzan con 'o'");
    System.out.println("b. Cadena con 5 vocales");
    System.out.println("c. Cadenas que contienen 'sa'");
    char subOpcion = scanner.nextLine().toLowerCase().charAt(0); // Convertir a minúsculas para mayor flexibilidad

    switch (subOpcion) {
        case 'a':
            System.out.println("Cadenas que comienzan con 'o': " + Arrays.toString(Caracteres.encontrarCadenasConO(matrizCadenas)));
            break;
        case 'b':
            String cadenaCincoVocales = Caracteres.encontrarCadenaConCincoVocales(matrizCadenas);
            System.out.println("Cadena con 5 vocales: " + (cadenaCincoVocales != null ? cadenaCincoVocales : "No se encontró ninguna cadena con 5 vocales"));
            break;
        case 'c':
            System.out.println("Cadenas que contienen 'sa': " + Arrays.toString(Caracteres.encontrarCadenasConSa(matrizCadenas)));
            break;
        default:
            System.out.println("Opción inválida");
    }
                
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion invalida");
            }
        }
    }
   
}
    


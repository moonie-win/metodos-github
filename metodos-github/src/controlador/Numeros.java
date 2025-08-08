/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author emont
 */
public class Numeros {

    public static int obtenerNumeroMasRepetido(int[][] matriz) {
    int maxRepeticiones = 0;
    int numeroMasRepetido = matriz[0][0];

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            int contador = 0;
            for (int k = 0; k < matriz.length; k++) {
                for (int l = 0; l < matriz[k].length; l++) {
                    if (matriz[i][j] == matriz[k][l]) {
                        contador++;
                    }
                }
            }
            if (contador > maxRepeticiones) {
                maxRepeticiones = contador;
                numeroMasRepetido = matriz[i][j];
            }
        }
    }
    return numeroMasRepetido;
}

    public static int obtenerCantidadPares(int[][] matriz) {
        int contadorPares = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (num % 2 == 0) {
                    contadorPares++;
                }
            }
        }
        return contadorPares;
    }

    public static int obtenerCantidadImpares(int[][] matriz) {
        int contadorImpares = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (num % 2 != 0) {
                    contadorImpares++;
                }
            }
        }
        return contadorImpares;
    }

    public static int obtenerSumaDiagonal(int[][] matriz) {
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        return sumaDiagonal;
    }

    public static int obtenerCantidadMultiplosDe5(int[][] matriz) {
        int contadorMultiplos = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (num % 5 == 0) {
                    contadorMultiplos++;
                }
            }
        }
        return contadorMultiplos;
    }
}
    


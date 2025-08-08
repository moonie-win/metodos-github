/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author emont
 */
public class Caracteres {
   public static void main(String[] args) {
        // Ejemplo de matriz bidimensional de cadenas (reemplaza con tu entrada real)
        String[][] cadenas = {
                {"naranja", "manzana", "plátano"},
                {"oso", "ordenador", "oliva"},
                {"murcielago", "caique", "castillo"}
        };

        System.out.println("Cadenas que comienzan con 'o': " + Arrays.toString(encontrarCadenasConO(cadenas)));
        System.out.println("Cadena con 5 vocales: " + encontrarCadenaConCincoVocales(cadenas));
        System.out.println("Cadenas que contienen 'sa': " + Arrays.toString(encontrarCadenasConSa(cadenas)));
    }

    public static String[] encontrarCadenasConO(String[][] arr) {
        List<String> resultado = new ArrayList<>();
        for (String[] fila : arr) {
            for (String str : fila) {
                if (str.toLowerCase().startsWith("o")) {
                    resultado.add(str);
                }
            }
        }
        return resultado.toArray(new String[0]);
    }

    public static String encontrarCadenaConCincoVocales(String[][] arr) {
        for (String[] fila : arr) {
            for (String str : fila) {
                if (tieneCincoVocales(str)) {
                    return str;
                }
            }
        }
        return null; // o lanza una excepción si no existe tal cadena
    }

    private static boolean tieneCincoVocales(String str) {
        int contador = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador == 5;
    }

    public static String[] encontrarCadenasConSa(String[][] arr) {
        List<String> resultado = new ArrayList<>();
        for (String[] fila : arr) {
            for (String str : fila) {
                if (str.toLowerCase().contains("sa")) {
                    resultado.add(str);
                }
            }
        }
        return resultado.toArray(new String[0]);
    }
}  



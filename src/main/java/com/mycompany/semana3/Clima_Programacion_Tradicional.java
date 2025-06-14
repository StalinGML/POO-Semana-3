package com.mycompany.semana3;

import java.util.Scanner;

/**
 * Programa: Promedio semanal del clima (Programación Tradicional)
 * Autor: Stalin Gabriel Mendieta López
 * 
 * Este programa solicita las temperaturas de los 7 días de la semana,
 * calcula el promedio y lo muestra en pantalla, utilizando funciones tradicionales.
 */

public class Clima_Programacion_Tradicional {

    // Lista de días de la semana
    public static final String[] DIAS = {
        "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"
    };

    // Función para mostrar encabezado
    public static void mostrarEncabezado() {
        System.out.println("==============================================");
        System.out.println("    PROMEDIO SEMANAL DEL CLIMA EN QUININDE");
        System.out.println("          (Programacion Tradicional)");
        System.out.println("==============================================");
    }

    // Función para ingresar temperaturas
    public static float[] ingresarTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        float[] temperaturas = new float[7];
        System.out.println("\nIngrese las temperaturas diarias en grados C:");
        for (int i = 0; i < 7; i++) {
            System.out.print("- Temperatura dia " + DIAS[i] + ": ");
            temperaturas[i] = scanner.nextFloat();
        }
        return temperaturas;
    }

    // Función para calcular el promedio
    public static float calcularPromedio(float[] temperaturas) {
        float suma = 0;
        for (float temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.length;
    }

    // Función para mostrar el resultado
    public static void mostrarResultado(float promedio) {
        System.out.printf("\nEl promedio semanal del clima es de: %.2f  C\n", promedio);
        System.out.println("==============================================");
    }

    // Función principal
    public static void main(String[] args) {
        mostrarEncabezado();
        float[] temps = ingresarTemperaturas();
        float promedio = calcularPromedio(temps);
        mostrarResultado(promedio);
    }
}
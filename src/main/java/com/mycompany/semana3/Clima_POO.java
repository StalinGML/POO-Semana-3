package com.mycompany.semana3;

import java.util.Scanner;

/**
 * Programa: Promedio semanal del clima (POO)
 * Autor: Stalin Gabriel Mendieta López
 * 
 * Este programa aplica el paradigma orientado a objetos, encapsulando
 * los datos y comportamientos en una clase llamada ClimaSemanal.
 */

public class Semana3 {

    // Clase interna que representa un clima semanal
    static class ClimaSemanal {
        private float[] temperaturas; // atributo encapsulado
        public static final String[] DIAS = {
            "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"
        };

        // Constructor
        public ClimaSemanal() {
            temperaturas = new float[7];
        }

        // Método para mostrar encabezado
        public void mostrarEncabezado() {
            System.out.println("=============================================");
            System.out.println("   PROMEDIO SEMANAL DEL CLIMA EN GUAYAQUIL   ");
            System.out.println("    (Programacion Orientada a Objetos)   ");
            System.out.println("=============================================");
        }

        // Método para ingresar temperaturas con días
        public void ingresarTemperaturas() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nIngrese las temperaturas diarias en grados C:");
            for (int i = 0; i < temperaturas.length; i++) {
                System.out.print("- Temperatura dia " + DIAS[i] + ": ");
                temperaturas[i] = scanner.nextFloat();
            }
        }

        // Método para calcular el promedio
        public float calcularPromedio() {
            float suma = 0;
            for (float temp : temperaturas) {
                suma += temp;
            }
            return suma / temperaturas.length;
        }

        // Método para mostrar el promedio
        public void mostrarPromedio() {
            float promedio = calcularPromedio();
            System.out.printf("\n El promedio semanal del clima es de: %.2f C\n", promedio);
            System.out.println("=============================================");
        }
    }

    // Método principal
    public static void main(String[] args) {
        ClimaSemanal clima = new ClimaSemanal();
        clima.mostrarEncabezado();
        clima.ingresarTemperaturas();
        clima.mostrarPromedio();
    }
}

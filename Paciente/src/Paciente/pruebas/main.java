/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class_1.java to edit this template
 */
package Paciente.pruebas;

/**
 *
 * @author José
 */
import Paciente.Paciente;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        Paciente paciente1 = null, paciente2 = null, paciente3 = null;
        // Variables de salida

        // Variables auxiliares
        //para calculos intermedios
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PACIENTES");
        System.out.println("----------------------");
        System.out.println(" ");
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        //Mostramos a nuestros pacientes
        System.out.println("Intento crear un paciente de nombre Antonio");
        System.out.println();
        try {
            paciente1 = new Paciente("Antonio González",
                    -1, -1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error al insertar crear: " + ex.getMessage());
        }
        System.out.println();

        System.out.println("Vamos a crear dos objetos paciente");
        System.out.println();

        paciente2 = new Paciente("Julián Piqueras Gómez",
                0, 0);
        System.out.println(paciente2.toString());
        System.out.println();

        paciente3 = new Paciente("Fulgencio Perez",
                5, 1);
        System.out.println(paciente3.toString());
        System.out.println();

        //Actualizamos los gastos a raiz de los pinchazos del dia de hoy
        System.out.println("Actualizamos el gasto aucumulado de Julian con dos pinchazos de 7025.50");
        paciente2.actualizarGastoAcumulado(2, (float) 7025.50);
        System.out.println(paciente2.toString());
        System.out.println();

        System.out.println("Actualizamos el gasto aucumulado de Fulgencio con 5 pinchazos de 76.87");
        paciente3.actualizarGastoAcumulado(5, (float) 76.87);
        System.out.println(paciente3.toString());
        System.out.println();

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("TIPOS DE PACIENTE");
        System.out.println("-----------------");
        System.out.println();
        System.out.println("El tipo de paciente de: Julián Pirqueras Gómez es: "
                + paciente2.tipoPaciente());
        System.out.println();
        System.out.println("El tipo de paciente de: Fulgencio Pérez es: "
                + paciente3.tipoPaciente());
        System.out.println();
    }
}

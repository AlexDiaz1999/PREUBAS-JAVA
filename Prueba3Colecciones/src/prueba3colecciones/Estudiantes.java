/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3colecciones;

import java.util.*;

/**
 *
 * @author alexd
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantEstudiantes = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < cantEstudiantes; i++) {
            System.out.print("\nIngrese el nombre del estudiante " + (i + 1) + ": ");
            nombres.add(sc.nextLine());

            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones.add(sc.nextDouble());
            sc.nextLine();  
        }

        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = suma / cantEstudiantes;

        System.out.println("\nPromedio de calificaciones: " + promedio);
        
        if (promedio > 7) {
            System.out.println("Los Estudiantes Aprobaron");
        } else {
            System.out.println("Los Estudiantes Reprobaron");
        }

        sc.close();
    }

}

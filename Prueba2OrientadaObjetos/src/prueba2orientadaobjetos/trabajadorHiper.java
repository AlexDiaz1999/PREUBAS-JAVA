/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2orientadaobjetos;

import java.util.*;

/**
 *
 * @author alexd
 */
public class trabajadorHiper {

    private String Nombre;
    private Double Salario;

    public trabajadorHiper(String nombre, double salario) {
        this.Nombre = nombre;
        this.Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public void aumentarSalario(double aumento) {
        Salario += aumento;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Salario: $" + Salario);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = sc.nextDouble();

        trabajadorHiper empleado = new trabajadorHiper(nombre, salario);
        empleado.mostrarInformacion();
        
        System.out.print("\nIngrese el valor del aumento salarial: ");
        double aumento = sc.nextDouble();
        empleado.aumentarSalario(aumento);
        
        System.out.println("\nDespués del aumento:");
        empleado.mostrarInformacion();

        sc.close();

    }

}

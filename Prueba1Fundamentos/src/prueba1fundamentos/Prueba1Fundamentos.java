/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1fundamentos;

import java.util.Scanner;

/**
 *
 * @author alexd
 */
public class Prueba1Fundamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        double area;

        System.out.print("Introduce el radio de un círculo: ");
        radio = sc.nextDouble();
        area = Math.PI * (radio * radio);

        System.out.println("El área de una circunferencia de radio " + radio + " es: " + area);
    }

}

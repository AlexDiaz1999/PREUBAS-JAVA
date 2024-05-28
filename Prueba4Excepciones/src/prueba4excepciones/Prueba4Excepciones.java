/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4excepciones;
import java.util.*;
/**
 *
 * @author alexd
 */
public class Prueba4Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();

            double resultado = division(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida.");
        } finally {
            sc.close();
        }
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
    }
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba5leerarchivos;
import java.io.*;

/**
 *
 * @author alexd
 */
public class Prueba5LeerArchivos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Archivo = "C:\\Users\\alexd\\Desktop\\PROYECTOS\\Prueba5LeerArchivos\\src\\prueba5leerarchivos\\prueba5.txt";
        int suma = 0;

        try (
            BufferedReader leer = new BufferedReader(new FileReader(Archivo))) {
            String linea;

            while ((linea = leer.readLine()) != null) {
                suma += Integer.parseInt(linea);
            }

            System.out.println("La suma de los números en el archivo es: " + suma);

        } catch (FileNotFoundException e) {
            System.out.println("Error el archivo no se encontró.");
        } catch (NumberFormatException e) {
            System.out.println("Error el archivo contiene datos no válidos.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}

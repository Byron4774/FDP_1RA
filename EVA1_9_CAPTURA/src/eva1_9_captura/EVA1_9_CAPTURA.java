/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//CREAMOS EL SCANNER
        
        System.out.println("Introduce el nombre completo: ");
        //COMO CAPTURAR EN JAVA
        nombre = input.nextLine();//CAPTURA TEXTO
        
        System.out.println("Introduce la edad: ");
        edad = input.nextInt();
        
        System.out.println("introduce el promedio: ");
        promedio = input.nextDouble();
        
        System.out.println("El nombre es: ");
        System.out.println(nombre);
        System.out.println("La edad es:");
        System.out.println(edad);
        System.out.println("El promedio es:");
        System.out.println(promedio);
                
    }
    
}

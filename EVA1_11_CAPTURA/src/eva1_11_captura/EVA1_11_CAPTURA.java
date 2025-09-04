/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_11_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        //CALCULO DE VELOCIDAD
        double velocidad, kilometro, Metro, Segundo;
       
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
        System.out.println("La distancia es: ");
        Metro = input.nextDouble();
        
        System.out.println("El tiempo es: ");
        Segundo = input.nextDouble();
        
        velocidad = Metro / Segundo;
        //CALCULAR LA VELOCIDAD (M/S)
        System.out.println("La velocidad en M/S es: ");
        System.out.println(velocidad);
        
        kilometro = velocidad * 3.6;
        System.out.println("La velocidad en KM/H es: ");
        System.out.println(kilometro);
        
    }
    
}

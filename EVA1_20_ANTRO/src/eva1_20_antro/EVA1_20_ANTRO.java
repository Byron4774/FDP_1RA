/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_20_ANTRO {
    
    final static int ACCESO_EDAD = 18;
    final static String ACCESO_INE = "si";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ine;
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("******CONTROL DE ACCESO*******");
        System.out.println("Antro El Cerro del Amanecer");
        System.out.println("Edad: ");
        edad = input.nextInt();
        System.out.println("Tiene Ine? si o no: ");
        ine = input.next();

         
        if(edad >= (ACCESO_EDAD)){
            if(ine.equals(ACCESO_INE)){
                System.out.println("ACCESO CONCEDIDO!!");
            }else{
                System.out.println("ACCESO DENEGADO!!");
            }
        }else{
            System.out.println("ACCESO DENEGADO!!");
        }
    }
}    

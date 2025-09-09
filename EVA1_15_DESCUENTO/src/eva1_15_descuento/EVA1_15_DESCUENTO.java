/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_15_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double venta;
        
        System.out.println("Introduce el Monto de la Compra: ");
        venta = input.nextDouble();
     
        if (venta >= 1000){
            System.out.println("Se le dara un descuento del 15%: ");
            System.out.print("Usted debe pagar: ");
            System.out.println(venta - (venta*0.15));
           
        }else {
            System.out.println("No se le aplicara descuento");
            System.out.print("Usted debe pagar: ");
            System.out.println(venta);
                    
        }
        
       
               
    }
    
}

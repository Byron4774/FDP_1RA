/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_16_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double nUNO, nDOS;
        
        System.out.println("Introduce el Primer Numero: ");
        nUNO = input.nextDouble();
        
        System.out.println("Introduce el Segundo Numero: ");
        nDOS = input.nextDouble();
     
        if (nUNO >= nDOS){
            System.out.print("El mayor numero es el primer numero: ");
            System.out.println(nUNO);
           
        }else {
            System.out.print("El mayor numero es el segundo numero: ");
            System.out.println(nDOS);
    }
    
}
    }

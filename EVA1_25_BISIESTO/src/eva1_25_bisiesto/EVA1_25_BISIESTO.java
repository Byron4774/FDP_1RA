/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here//DIVISIONES
        Scanner input = new Scanner(System.in);
        int num1;
        int resi, resi2, resi3;
        
        System.out.println("Introduce el año: ");
        num1 = input.nextInt();
        resi = num1 % 4;
        resi2 = num1 % 100;
        resi3 = num1 % 400;
        
        if(resi == 0){
      
            if(resi2 == 0){
                               
            
                if(resi3 == 0 && resi2 == 0){
                System.out.println("Es Bisiesto");
            }else{
                System.out.println("No es Bisiesto");
            }
        
       
            }
        }else{
            System.out.println("No es Bisiesto");
        }
    }
}

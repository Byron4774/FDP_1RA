/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int Calif;
      
        
        System.out.println("Cuanta fue tu Calificacion Obtenida?");
        Calif = input.nextInt();
        
        if (Calif >= 0 && Calif <59){
            System.out.println("Su Calificacion equivale a: F");
        }
        else if(Calif <=69 && Calif > 59){
            System.out.println("Su Calificacion equivale a: D");
        }
        else if (Calif <=79 && Calif > 69){
            System.out.println("Su Calificacion equivale a: C");
        }
        else if (Calif <=90 && Calif > 79){
            System.out.println("Su Calificacion equivale a: B");
        }
        else if (Calif <=100 && Calif > 90){
            System.out.println("Su Calificacion equivale a: A");
        }else{
            System.out.println("No calificable");
            
        }
}

    
}

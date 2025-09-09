/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_if_votar;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_14_IF_VOTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double edad;
        
        System.out.println("Introduce tu año de nacimiento: ");
        edad = input.nextDouble();
        
        if(edad <= 2007){
            System.out.println("Si puedes Votar!");
                    
        }else{
            System.out.println("No puedes Votar!");
        }
        
    }
    
}

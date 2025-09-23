/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_28_moneda;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_28_MONEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int usuario;
        //System.out.println("Elige aguila o sello (1/0):")
        //usuario = input.nextInt();
        //como lanzamos una moneda?
        
        if(Math.random() < 0.5){
            System.out.println("Aguila");
        }else{
            System.out.println("Sello");
        }
            
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_23_COMPRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String credito, efectivo;
        System.out.println("Tienes dinero? Si o No");
        efectivo = input.nextLine();
        System.out.println("Tienes credito? Si o No");
        credito = input.nextLine();
        if((efectivo.equals("Si")) || (credito.equals("Si"))){
            System.out.println("Puedes Comprar!");
        }else{
            System.out.println("No Puedes Comprar!");
        }
        
        
    }
    
}

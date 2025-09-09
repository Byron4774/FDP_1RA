/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION DE VARIABLES
        double califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce tu calificacion: ");
        califa = captu.nextDouble();
        
        if(califa >= 70){//SECCION VERDADERO
            System.out.println("FELICITACIONES ACREDITASTE!!");
        }else{ //SECCION FALSO OPCIONAL
            System.out.println("AZOTES!!");
        }
    }
    
}

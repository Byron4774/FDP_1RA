/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_acceso_a_tablas;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA1_22_ACCESO_A_TABLAS {
    final static String ACCESO_USU = "BYRON";
    final static String ACCESO_CONTRA = "1234";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, contra;
        Scanner input = new Scanner(System.in);
        
        System.out.println("******CONTROL DE ACCESO*******");
        System.out.println("Restaurante de la Cucaracha Crocante");
        System.out.println("Usuario: ");
        usuario = input.nextLine();
        System.out.println("Contraseña: ");
        contra = input.nextLine();
        //equals ---> compara texto
        if(usuario.equals(ACCESO_USU) && contra.equals(ACCESO_CONTRA)){
            System.out.println("ACCESO CONCEDIDO");
        }else{
            System.out.println("ACCESO DENEGADO");
        }
    }
    
}

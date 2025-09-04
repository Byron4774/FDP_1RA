/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8.pkg1_temperatura;

/**
 *
 * @author Byron
 */
public class EVA1_81_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double farenheit , celcius;
        
        farenheit = 22;
        celcius = (5*(farenheit - 32))/9;
        
        System.out.println("Su temperatura en celcius es: ");
        System.out.println(celcius);
    }
    
}

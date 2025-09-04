/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_triangulo;

/**
 *
 * @author Byron
 */
public class EVA1_7_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //AREA TRIANGULO
        //AREA = (BASE X ALTURA) ENTRE 2
        double area, base, altura; //tres variables de tipo double
        //INICIALIZACION:
        base = 11;
        altura = 3;
        //APLICA PROCEDENCIA DE OPERADORES
        area = (base * altura) / 2.0; //CUIDADO CON DIVIDIR ENTRE ENTEROS
        
        System.out.println("El area del triangulo base 10 y altura 8 es:");
        System.out.println(area);
               
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_26_operaciones;

/**
 *
 * @author Byron
 */
public class EVA1_26_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DIVISIONES
        int val1 = 7, val2 = 3;
        int resu;
        resu = val1 / val2;
        System.out.print("7/3 = ");
        System.out.println(resu);
        
        double v1 = 7.0, v2 = 3.0;
        double res;
        res = v1 / v2;
        System.out.print("7.0/3.0 = ");
        System.out.println(res);
        
        //CALCULAR EL RESIDUO
        //RESIDUO = MODULO = %
        int num1 = 2024, num2 = 4;
        int resi;
        resi = num1 % num2;//CALCULO DEL RESIDUO
        System.out.print("Residuo de 2024 % 4 = ");
        System.out.println(resi);
        if(resi == 0){
            System.out.println("Puede que sea bisiesto!!");
        }
    }
    
}

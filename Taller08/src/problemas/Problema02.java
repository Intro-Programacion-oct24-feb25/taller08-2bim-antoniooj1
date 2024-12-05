/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int contador=0; 

        for (double f = 20; f <= 100; f+=4) { 
            double c = (5.00/9.00)*(f-32);
            System.out.printf("Operación(%d) Fahrenheit: %.2f ===> "
                    + "Celcius: %.2f\n", contador , f , c);
             contador = contador + 1;

            
                
        }
     }
}
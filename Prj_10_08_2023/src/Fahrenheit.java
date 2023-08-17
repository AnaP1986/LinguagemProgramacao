/*Receba a temperatura em graus Celsius. Calcule e mostre a sua
temperatura convertida em fahrenheit F = (9*C+160) /5.*/

import javax.swing.*;


public class Fahrenheit 

{
    public static void main (String args [])
            
    {
        double C, fahrenheit;
        
        C=Double.parseDouble(JOptionPane.showInputDialog("Informe a sua temperatura: "));
        
        
        fahrenheit= (9*C+160)/5;
        
        System.out.println("A temperatura em fahrenheit é " + fahrenheit + "f");    
                
    }   
}

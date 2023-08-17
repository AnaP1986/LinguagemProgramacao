/*Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/

import javax.swing.*;
        
public class area_triangulo 
{
    public static void main (String args[])
    {
        
        int base, altura, area;
        
        base=Integer.parseInt(JOptionPane.showInputDialog("Informe a base do triângulo: "));
        altura=Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do triângulo: "));
        
        area= (base*altura)/2;
     
     System.out.println("A área do triângulo é " + area);
        
     }
            
    
}

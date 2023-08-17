/*Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
resultado. */

import javax.swing.*;
        
public class area_quadrado 
{
    public static void main (String args [])
            
    {
      int lado1, lado2, area ;
      
      lado1=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado1 do quadrado: "));
      lado2=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado2 do quadrado: "));
      
      area= lado1*lado2;
      
      System.out.println("A área do quadrado é " + area);     
        
    }
       
}

/*Receba o salário de um funcionário e mostre o novo
salário com reajuste de 15%.*/

import javax.swing.*;

public class Salario 

{
    
    public static void main(String args [])
    
    {
        
        int salario;
        double reajuste;
        
        salario= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu salário:"));
        reajuste= salario * 1.15;
        
        System.out.println("Seu salário reajustado é " + reajuste);    
    }
    
}

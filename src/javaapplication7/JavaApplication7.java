/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariie
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String names[] = new String[4];
        double notas[] = new double[4];
        double totalnotas=0;
        double notamayor =0;
        String persona="";
        
        for (int i=0;i<=3;i++){
            names[i]=JOptionPane.showInputDialog("ingrese el nombre "+(i+1));
            notas[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese nota "+(i+1)));
            totalnotas+=notas[i];
            if (notas[i] > notamayor) {
                persona=names[i];
            }
        }
        
        for (int i=0;i<=3;i++){
           System.out.print("Nombre: "+names[i]);
           System.out.print(", Nota: "+notas[i]+"\n");

        }
        System.out.print("Promedio de Notas: "+totalnotas/4+"\n");
        System.out.print("Persona con ntoa mayor: "+persona);


        
        

    }
    
}
    

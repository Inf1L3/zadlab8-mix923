/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Mateusz
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FiguraGeometryczna[] tablica=new FiguraGeometryczna[15];
        tablica[0]=new Kula(1);
        tablica[1]=new Kula(2);
        tablica[2]=new Kula(5);
        tablica[3]=new Kula(1);
        tablica[4]=new Kula(10);
        tablica[5]=new Kula(4);
        
        
        
        tablica[7]=new Kula(2);
        tablica[8]=new Kula(5);
        tablica[9]=new Kula(1);
        tablica[10]=new Kula(10);
        tablica[11]=new Kula(4);
        
        tablica[12]=new Kula(1);
        tablica[13]=new Kula(2);
        tablica[14]=new Kula(5);
        tablica[15]=new Kula(1);
        
        int z=0;
        while(z<15)
        {
          System.out.print(tablica[z].toString());
          z++;
        }
        
    }
    
}

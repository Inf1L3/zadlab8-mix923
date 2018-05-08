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
public abstract class FiguraPlaska extends FiguraGeometryczna {
    
    public abstract void obliczObwod();
    
   
    @Override
   public  String toString() {
        return "Obliczanie parametrów figury płaskiej";
    }
}

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
public class Kwadrat extends FiguraPlaska {

    Kwadrat(int i) {
        this.bok = bok;
    } 

    public float getBok() {
        return bok;
    }

    public void setBok(float bok) {
        this.bok = bok;
    }

    public float getObwod() {
        return obwod;
    }

    public void setObwod(float obwod) {
        this.obwod = obwod;
    }

    private float bok;
    private float obwod;

    
    
    
   
    public void obliczObwod() {
        obwod=4*bok;
    }
    
    @Override
   public  String toString() {
        return " To jest Kwadrat " + "obwod"+this.obwod;
    }
    
}

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
public class Prostokat  extends FiguraPlaska {
    private float bok1;
    private float bok2;
    private float obwod;

    public Prostokat(float bok1, float bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public float getBok1() {
        return bok1;
    }

    public void setBok1(float bok1) {
        this.bok1 = bok1;
    }

    public float getBok2() {
        return bok2;
    }

    public void setBok2(float bok2) {
        this.bok2 = bok2;
    }

    public float getObwod() {
        return obwod;
    }

    public void setObwod(float obwod) {
        this.obwod = obwod;
    }
    
    
    
   
    public void obliczObwod() {
        obwod=bok1*2+bok2*2;
    }
     @Override
   public  String toString() {
        return " To jest Prostokat " + "obwod"+this.obwod;
    }

    
}

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
public class Prostopadloscian extends FiguraPrzestrzenna {

    private float bok1;
    private float bok2;
    private float bok3;

    public Prostopadloscian(float bok1, float bok2, float bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
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

    public float getBok3() {
        return bok3;
    }

    public void setBok3(float bok3) {
        this.bok3 = bok3;
    }

    public float getObj() {
        return obj;
    }

    public void setObj(float obj) {
        this.obj = obj;
    }
    
    private float obj;
    
     @Override
    public void obliczObjetosc() {
      obj=bok1*bok2*bok3;    
    }
    
       @Override
   public  String toString() {
        return " To jest Prostopadloscian " + "objetosc"+this.obj;
    }
    
    
}

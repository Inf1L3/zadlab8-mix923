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
public class Kula extends FiguraPrzestrzenna {
    private float r;
    private float obj;

    public Kula(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getObj() {
        return obj;
    }

    public void setObj(float obj) {
        this.obj = obj;
    }
    
      @Override
    public void obliczObjetosc() {
        obj=(4/3)*3.14f*r*r*r;
    }
    
      @Override
   public  String toString() {
        return " To jest Kula " + "objetosc"+this.obj;
    }
    
    
}

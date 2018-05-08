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
public class Szescian extends FiguraPrzestrzenna {
    
    private float obj;
    private float bok;

    public float getObj() {
        return obj;
    }

    public void setObj(float obj) {
        this.obj = obj;
    }

    public float getBok() {
        return bok;
    }

    public void setBok(float bok) {
        this.bok = bok;
    }

    public Szescian(float bok) {
        this.bok = bok;
    }
    
    @Override
    public void obliczObjetosc() {
       obj=bok*bok*bok;
    }
    
      @Override
   public  String toString() {
        return " To jest Szescian " + "objetosc"+this.obj;
    }
}

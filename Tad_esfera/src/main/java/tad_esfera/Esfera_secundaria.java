/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tad_esfera;

/**
 *
 * @author cliente
 */
public class Esfera_secundaria {
    private double radio;
        
    public Esfera_secundaria(double numradio){
        if (numradio > 0){
            radio = numradio;
        }else{
            radio = 0;
        }
    }

    public double getradio(){
        return radio;
    }
    public double getdiametro(){
        return (2 * radio);
    }
    public double getcircunferencia(){
        return (Math.PI * getdiametro());
    }
    public double getvolumen(){
        return (4 * Math.PI * Math.pow(radio, 3))/3;
    }
    public double getarea(){
        return (4 * Math.PI * Math.pow(radio, 2));
    }
    
}

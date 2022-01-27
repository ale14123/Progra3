/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tad_esfera;

/**
 *
 * @author cliente
 */
public class Esfera_principal {
    public static void main(String[] args) {
        Esfera_secundaria dimensiones_esfera = new Esfera_secundaria(3);
        System.out.println("Las dimensiones de la esfera son:");
        System.out.println("El radio es: " + dimensiones_esfera.getradio());
        System.out.println("El diametro es: " + dimensiones_esfera.getdiametro());
        System.out.println("La circunferencia es: " + dimensiones_esfera.getcircunferencia());
        System.out.println("El área es: " + dimensiones_esfera.getarea());
        System.out.println("El volumen es: " + dimensiones_esfera.getvolumen());
    }
}

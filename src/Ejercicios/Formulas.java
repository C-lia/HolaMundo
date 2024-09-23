/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;


public class Formulas {
    
    private final double PI = Math.PI;
    
    // Propiedades de la clase
    private final double r;
    
    // Constructor de la clase
    public Formulas(double r) {
        this.r = r;
    }
    
    // Metodos de la clase
    public double areaCirculo () {
        return PI * Math.pow(r, 2);
    }
    
    public double diametroCirculo() {
        return 2 * PI * r;
    }
    
    
}

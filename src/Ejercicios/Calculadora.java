/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Celia
 */
public class Calculadora {
    
    
    //Propiedades de la clase
    private final int n1;
    private final int n2;
    
    //Constructor de la clase
    public Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    //Metodos de la clase
    public int sumar() {
        return n1 + n2;
    }
    
    public int restar() {
        return n1 - n2;
    }
    
    public int multiplicar() {
        return n1 * n2;
    }
    
    public Double dividir() {
        if(n2 == 0) {
            System.out.println("No puedes dividir entre 0 cazurro");
            return null;
        }
        return Double.valueOf(n1 / n2);
    }
}




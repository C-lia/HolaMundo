package holamundo;

import java.util.Scanner;
import Ejercicios.Calculadora;
import Ejercicios.Formulas;


public class HolaMundo {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Escribe un numero");
        int edad = consola.nextInt();
        System.out.println( "Tu edad es " + edad);
        
        
        System.out.println("Hola Mundo!!");
        
        Calculadora calculadora = new Calculadora(5, 4);
        int resultado = calculadora.sumar();
        System.out.println(resultado);
        
        Calculadora calculadora2 = new Calculadora(3, 4);
        int resultado2 = calculadora2.sumar();
        System.out.println(resultado2);
        
        var calculadora3 = new Calculadora(5, 8);
        int resultado3 = calculadora3.restar();
        System.out.println(resultado3);
        
        Calculadora calculadora4 = new Calculadora(3, 7);
        int resultado4 = calculadora4.multiplicar();
        System.out.println(resultado4);
        
        Calculadora calculadora5 = new Calculadora(3, 0);
        Double resultado5 = calculadora5.dividir();
        System.out.println(resultado5);
        
        var losPacos = Math.copySign(-5, 4);
        System.out.println(losPacos);
        
        int radio = 5;
        Formulas areaCirculo = new Formulas(radio);
        double resultado6 = areaCirculo.areaCirculo();
        System.out.println(resultado6);
        
              
                
                
     // Ejercicio 2: Par o impar
     
     int numero = 8;
     int numero2 = 5;
     
     if (numero2 % 2 == 0) {
         System.out.println("Número par");
     } else {
         System.out.println("Número impar");
     }
     
     
     // Ejercicio 3: Tabla de multiplicar
     
     //if
    // buble
     
     
     
    }
}

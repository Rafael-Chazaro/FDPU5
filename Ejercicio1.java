
import java.util.Scanner;

/**
 *
 * @author solic
 */
public class Ejercicio1 {
        public static void main(String[] args) {
        System.out.println("Ingrese el primer numero");
       
        Scanner Leer = new Scanner(System.in);
        double num1 = Leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = Leer.nextDouble();
        
        System.out.println(" La suma es : "+ Suma(num1, num2));
        System.out.println("La resta es : "+ Resta(num1, num2));
        System.out.println("La multiplicacion es: "+ Multiplicacion(num1, num2));
        System.out.println("L division es: "+ Division(num1, num2));
 }
        public static double Suma (double num1, double num2){
        return num1 + num2;    } 
         public static double Resta(double num1, double num2){
        return num1 - num2;}     
        public static double Multiplicacion(double num1, double num2){
        return num1 * num2;}
        public static double Division(double num1, double num2){
        return num1 / num2;
    }
 
}

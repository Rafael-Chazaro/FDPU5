
import java.util.Scanner;

/**
 *
 * @author solic
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    System.out.println(" Ingrese el primer numero: ");
    Scanner Leer = new Scanner(System.in);
    double num1 = Leer.nextDouble();
    System.out.println("Ingrse el segundo numero: ");
    double num2 = Leer.nextDouble();
    System.out.println("Ingrese el simbolo de la operacion matematicas: ");
    String simbolo = Leer.next();
    System.out.println("El resultado de la operacion matematicas es: "+ 
    OperacionMatematica(num1,num2,simbolo));
    }
    public static double OperacionMatematica(double num1,
       double num2, String simbolo){
       double resultado = 0;
       switch(simbolo){
           case "+":
               resultado = num1 + num2;
               break; case"-":
               resultado = num1 - num2;
               break; case "*":
               resultado = num1 * num2;
               break; case "/":
               resultado = num1 / num2;}  
               return resultado;
    }
}

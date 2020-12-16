
import java.util.Scanner;

/**
 *
 * @author solic
 */
public class Ejercicio4 {
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese un numero del 1-4 para seleccionar una operacion: ");
        System.out.println("1 - calcular el area de un cuadrado.");
        System.out.println("2 - calcular el area de un rectangulo.");
        System.out.println("3 - calcular el area de un triangulo.");
        System.out.println("4 - calcular el area de un circulo. ");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1: 
                Cuadrado(); break;
            case 2:
                Rectangulo(); break;
            case 3:
                Triangulo(); break;
            case 4:
                Circulo(); break; } }
    
    public static void Cuadrado(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la mediad del lado del cuadrado:");
        double lado = leer.nextDouble(); 
        double area = lado * lado;
        System.out.println("El area del cuadrado es: "+ area);
    }
    public static void Rectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la mediad de la base del rectangulo:");
        double base = leer.nextDouble();
        System.out.println("Ingrese la medida de la altura:");
        double altura = leer.nextDouble();
        double area = base * altura;
        System.out.println("El area del rectangulo es: "+ area);
    }
    public static void Triangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa las medida de la base del triangulo:");
        double base = leer.nextDouble();
        System.out.println("Ingresa la medida de la altura:");
        double altura = leer.nextDouble();
        double area = (base)*(altura) / 2;
        System.out.println("El area del triangulo es: "+ area);
    }
    public static void Circulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la medida del radio:");
        double radio = leer.nextDouble();
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo es: "+ area);
    }
}
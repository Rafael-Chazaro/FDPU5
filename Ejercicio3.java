
import java.util.Scanner;

/**
 *
 * @author solic
 */
public class Ejercicio3 {
        public static void main(String[] args) {
            
        System.out.println("Ingresa un mumero 1-4 para seleccionar una opcion");
        System.out.println(" 1 - Convertir de dolar a peso");
        System.out.println(" 2 - convertir peso a dolar");
        System.out.println(" 3 - convertir de euro a peso");
        System.out.println(" 4 - convertir de peso a euro");
        
        Scanner Leer = new Scanner(System.in);
        int opcion= Leer.nextInt();
        switch(opcion){
            case 1:
                DolarPeso(); break;
            case 2:
                PesoDolar(); break;
            case 3:
                EuroPeso(); break;
            case 4:
                PesoEuro(); break;  }
     } 
     public static void DolarPeso(){
     System.out.println("Ingrese la cantidad de dolares a covertir");
     Scanner Leer = new Scanner(System.in);
     double dolar = Leer.nextDouble();
     
     double pesos = dolar*20.04;
     System.out.println("El valor en pesos es:" + pesos);
     
     }
     public static void PesoDolar(){
     System.out.println("Ingrese la cantidad de Pesos a convertir a Dolares");
     Scanner Leer = new Scanner(System.in);
     double pesos =Leer.nextDouble();
     
     double dolar =pesos/20.04;
     System.out.println("Elvalor en dolarres es" + dolar);
     }     
     public static void EuroPeso(){
     System.out.println("Ingrese la cantidad de euros a converitr");
     Scanner Leer = new Scanner(System.in);
     double euro = Leer.nextDouble();
     double pesos = euro*21.50;
     System.out.println("El valor en peso es"+ pesos);
     }       
     public static void PesoEuro(){
     System.out.println("Ingrese la cantidad depesos a convertir a Euros ");
     Scanner Leer = new Scanner(System.in);
     double pesos = Leer.nextDouble();
     double euro= pesos/21.50;
     System.out.println("El valor a euro es "+ euro);
      }
     
}

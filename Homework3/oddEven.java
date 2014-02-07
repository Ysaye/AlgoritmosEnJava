/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/
import java.util.Scanner;
public class oddEven {   

   public static void main(String[] args) {
      
      	Scanner teclado = new Scanner(System.in);//entrada de informacion
        
        System.out.println("Favor de ingresar un numero \n para ver si es par  " );
        int numero = teclado.nextInt();
        
        if(numero%2==0){//condicion para ver si es par que no 
            System.out.println("El numero es par");
            
        }else{// de lo contrario
            System.out.println("El numero es impar");
        }
   }
}

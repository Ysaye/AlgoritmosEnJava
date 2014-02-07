/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/
import java.util.Scanner;

public class whileValue {   

   public static void main(String[] args) {
   	 Scanner teclado = new Scanner(System.in);// entrada de datos
        
        System.out.println("ingrese numero \n");//se pide en pantalla un numero
        int numero= teclado.nextInt();
        int contador = 0;
        
        while(contador<=numero){//se usa value para la condicion
            System.out.println("El valor actual es "+ contador); // muestra el valor actual
            contador++;
        }
   }

}

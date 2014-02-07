/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango
*/
import java.util.Scanner;
public class rangeSum {   

   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);//objeto para ingresar numeros al sistema
        
        
        System.out.println("Ingrese el limite inferior");
        int inferior = teclado.nextInt();//ingreso a la variable inferior
        System.out.println("ingrese el limite superior");
        int superior = teclado.nextInt();//ingreso a la variable supeerior
        System.out.println("solucion");//mensaje de solucion para no confundir los numeros ingresados con la solucion
        
        for(int i=inferior + 1; i<superior; i++){//va imprimir inferior mas 1 para que este dentro del limite
                                                //y se parara en menor que el limite superior
            System.out.println(i);
        }
      
   }

}

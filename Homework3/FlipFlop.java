/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java
/*
 Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/
import java.util.Scanner;

public class FlipFlop {   

   public static void main(String[] args) {
          
          int numeroActual ;     
        
        
       
          numeroActual = Integer.parseInt(args[0].toString());
        
        for(int i =0; i <= numeroActual; i++){//se utiliza una estructura de control para dar las condiciones
            if(i % 3 == 0 && i%5==0 ){
                 System.out.print("FlipFlop");
             
            }if(i % 3 == 0 && i%5!=0){                  //he imprimir en pantalla
                System.out.print("Flip");
            }
            if(i%5==0 && i%3!=0){
                System.out.print("Flop");
            }
            if(i%3!=0 && i%5!=0){
                System.out.print(i);
            }
            System.out.print(" ");
        }
       
   }

}
// fin de la aplicacion
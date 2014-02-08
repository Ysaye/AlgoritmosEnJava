/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      
      	int numero ;
        
       
         numero = Integer.parseInt(args[0].toString());
        
        if(numero%2==0){//condicion para ver si es par que no 
            System.out.println("El numero es par");
            
        }else{// de lo contrario
            System.out.println("El numero es impar");
        }
   }
}

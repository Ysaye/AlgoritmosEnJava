/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/


public class whileValue {   

   public static void main(String[] args) {
   	 int numero;
        
        
         numero= Integer.parseInt(args[0].toString());
        int contador = 0;
        
        while(contador<=numero){//se usa value para la condicion
            System.out.println("El valor actual es "+ contador); // muestra el valor actual
            contador++;
        }
   }

}

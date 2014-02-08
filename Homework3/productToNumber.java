/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(args[0].toString());
        int producto = 1;// se declaran las variables numero y producto
      
        System.out.print("1");
        
        for(int i = 2; i <=numero; i++){// se utiliza una estructura para la condicion repetitiva
            
            producto = producto * i;
            System.out.print("X" + i);
        }
        System.out.println("="+producto);
   }

}

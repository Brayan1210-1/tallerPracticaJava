package Registro;
import java.util.Scanner;
public class RegistroUsuarios {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        // Declaración de array para los nombres, el array almacena texto/String.
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
        	System.out.println( "Ingrese un nombre ");
        	nombres[i] = sc.nextLine();
        }
//        Array para la edad, esta almacena enteros/int.
        int[] edades = new int[5];
        for (int e = 0; e < edades.length; e++) {
        	System.out.println("Ingrese la edad para " + nombres[e]);
        edades[e] = sc.nextInt();
        }
        //Array para el estado, almacena texto/String
       String[] estado = new String[5];
       for ( int f = 0; f < nombres.length; f++) {
    	   System.out.println(" Ingrese el estado para la el usuario " + nombres[f]);
    	   estado[f] = sc.nextLine();
       }
       //Bucle for para mostrar los datos de los arrays.
       for ( int r = 0; r < nombres.length; r++) {
    	   //condición para saber si el usuario es menor o mayor
   if (edades[r] >= 18) {
System.out.println("El usuario " + nombres[r] + " es mayor " + " estado: " + estado[r]);
    }else {
    	System.out.println("El usuario " + nombres[r] + " es menor " + " estado: " + estado[r]);
}

	}    sc.close();
}
}
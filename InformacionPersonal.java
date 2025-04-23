package Registro;
import java.util.Scanner;

public class InformacionPersonal {
public static void main (String args[]) {
 Scanner sc = new Scanner(System.in);
  String nombre;
  int edad;
  double estatura;
  boolean esEstudiante = true;
  
  System.out.println( " Ingrese el nombre del estudiante ");
	nombre = sc.nextLine();
 
	System.out.println(" Ingrese la edad del estudiante ");
	edad = sc.nextInt();
	
	System.out.println(" Ingrese la estatura del estudiante" );
	estatura = sc.nextDouble();
	
    char inicial = nombre.charAt(0);
    	
 double [] calificaciones = new double[5];
 System.out.println(" Ingrese las notas del estudiante " + nombre + "(desde 1,0 hasta 5,0)");
 	for (int i=0; i < calificaciones.length; i++) {
 		calificaciones[i] = sc.nextDouble();
 	}
 
 	System.out.println("Hola, me llamo " + nombre + ". Tengo " + edad + " años, mido " + 
            estatura + " metros, mi inicial es " + inicial + " y es estudiante? " + esEstudiante);
	
 	System.out.print(" Las notas del estudiante son: ");
 	 
 	for (int e=0; e < calificaciones.length; e++) {
 	 System.out.println( calificaciones[e] );
 	}
 	
 sc.close();
}
}

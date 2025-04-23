package Registro;
import java.util.Scanner;

public class InformacionPersonal {
public static void main (String args[]) {
 Scanner sc = new Scanner(System.in);
 
 //Declaracion de las variables de tipo String, Double, boolean
  String nombre;
  int edad;
  double estatura;
  boolean esEstudiante = true;
  
  //inicialización de las variables por el usuario
  System.out.println( " Ingrese el nombre del estudiante ");
	nombre = sc.nextLine();
 
	System.out.println(" Ingrese la edad del estudiante ");
	edad = sc.nextInt();
	
	System.out.println(" Ingrese la estatura del estudiante" );
	estatura = sc.nextDouble();
	//Declaración e inicialización de un caracter (char)
    char inicial = nombre.charAt(0);
    
    //Declaración e inicialización del array para las calificaciones
 double [] calificaciones = new double[5];
 System.out.println(" Ingrese las notas del estudiante " + nombre);
 	for (int i=0; i < calificaciones.length; i++) {
 		calificaciones[i] = sc.nextDouble();
 	}
 //Mostrar los datos que fueron dados anteriormente
 	System.out.println("Hola, me llamo " + nombre + ". Tengo " + edad + " años, mido " + 
            estatura + " metros, mi inicial es " + inicial + " y es estudiante? " + esEstudiante);
	
 	System.out.print(" Las notas del estudiante son: ");
 	 
 	for (int e=0; e < calificaciones.length; e++) {
 	 System.out.println( calificaciones[e] );
 	}
 	
 sc.close();
}
}

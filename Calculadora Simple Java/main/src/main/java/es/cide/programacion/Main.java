//Nombre: Ángel Cristian López Torres
//DNI: 41713034G
//Fecha 10/10/2025
package es.cide.programacion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Añadimos el scanner con el nombre de variable sc
     int operacion; // Declaro una variable operación
     int numA, numB;// Declaro las variables numA y numB
     int resultado;  //Declaro la variable para las operación
     do { // Para la actividad utilizo el do while
    System.out.println("----MENÚ-----"); //Hago la interfaz menú
    System.out.println("1. Sumar"); //Muestro la opción que tendrá que introducir para hacer la suma
    System.out.println("2. Restar"); //Muestro la opción que tendrá que introducir para hacer la resta
    System.out.println("3. Multiplicar");//Muestro la opción que tendrá que introducir para multiplicar
    System.out.println("4. Dividir");//Muestro la opción que tendrá que introducir para hacer la división
    System.out.println("5. Salir");//Muestro la opción que tendrá que introducir para salir del programa
    System.out.print("Elige una opción: "); //Le pido al usuario que elija una opción
    operacion = sc.nextInt(); //Guarda el resultado en operacion
    switch (operacion){ //Inicio un switch case, que realice los siguientes casos dependiendo del valor que tenga operación
            case 1: //En caso de que el valor almacenado en operación sea 1 que es "Sumar"
            System.out.println("Introduce el primer número"); //Te pide introducir el primer número
            numA = sc.nextInt();//Guarda el valor introducido en numA
            System.out.println("Introduce el segundo número");//Te pide introducir el segundo número
            numB = sc.nextInt();//Guarda el valor introducido en numB
            resultado = numA + numB; // Guarda el resultado de la suma numA y numB en la variable "resultado"
            System.out.println("Resultado: " + resultado); //Muestra el resultado de la operación
            break; //Sale del switch
        
            case 2: //En caso de que el valor almacenado en operación sea 2 que es "Restar"
            System.out.println("Introduce el primer número"); //Te pide introducir el primer número
            numA = sc.nextInt();//Guarda el valor introducido en numA
            System.out.println("Introduce el segundo número"); //Te pide introducir el segundo número
            numB = sc.nextInt();//Guarda el valor introducido en numB
            resultado = numA - numB;// Guarda el resultado de la resta numA y numB en la variable "resultado"
            System.out.println("Resultado: " + resultado); //Muestra el resultado de la operación
            break; //Sale del switch

            case 3://En caso de que el valor almacenado en operación sea 2 que es "Multiplicar"
            System.out.println("Introduce el primer número"); //Te pide introducir el primer número
            numA = sc.nextInt(); //Guarda el valor introducido en numA
            System.out.println("Introduce el segundo número"); //Te pide introducir el segundo número
            numB = sc.nextInt(); //Guarda el valor introducido en numB
            resultado = numA * numB; // Guarda el resultado de la multiplicación entre el numA y numB en la variable "resultado"
            System.out.println("Resultado: " + resultado); //Muestra el resultado de la operación
            break; //Sale del switch
        
            case 4://En caso de que el valor almacenado en operación sea 2 que es "Dividir"
            System.out.println("Introduce el primer número"); //Te pide introducir el primer número
            numA = sc.nextInt(); //Guarda el valor introducido en numA
            System.out.println("Introduce el segundo número");
            numB = sc.nextInt(); //Guarda el valor introducido en numB
            if (numB == 0){ // Realizamos un if en caso de que el usuario quiera dividir y el numB sea igual 0
            System.out.println("No se puede realizar"); // Muestra un mensaje de error
            } else { //En caso de que no sea así
            resultado = numA / numB; // Guarda el resultado de la división entre el numA y numB en la variable "resultado"
            System.out.println("Resultado: " + resultado); //Muestra el resultado de la operación
            }
            break; //Sale del switch

            case 5://En caso de ser el valor almacenado en operación sea 5 que es "Salir"
            
            System.out.println("Adiós, espero que hayas disfrutado de mi calculadora"); // Muestra un mensaje de despedida 
            break;//Sale del switch
    }
    
    if (operacion > 5){ //Abre un if en caso de que se introduzca un numero superior a 5
            System.out.println("Error, ningún numero seleccionado"); // En caso de que no se introduzca un numero entre esos 5, se mostrará esta linea de código
            }
} while (operacion != 5); // Realiza todo ese bloque de código mientras el valor que introduzcamos en operacion sea inferior a 5, es decir mientras sea 1,2,3,4
sc.close(); //Se cierra el scanner
}
}
    

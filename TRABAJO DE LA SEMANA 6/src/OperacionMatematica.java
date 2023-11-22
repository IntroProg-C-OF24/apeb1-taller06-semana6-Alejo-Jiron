/*
 Problema-5

    Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica (suma, resta, multiplicación, división), muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.

*/
import java.util.Scanner;
public class OperacionMatematica {
    public static void main(String[] args) {
        /*
        Resolucion Del problema
        */
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese de la operacion (1 al 4)");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Suma: ");
                break;
            case 2:
                System.out.println("Resta: ");
                break;
            case 3:
                System.out.println("Multiplicacion: ");
                break;
            case 4:
                System.out.println("Division: ");
                break;
            default:
                System.out.println("Operacion no encontrada");
        }
    }
}

/*

    Problema-2

    Clasificación de un triángulo Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:

        Si todos los lados son iguales, mostrar "Triángulo equilátero".
        Si dos lados son iguales, mostrar "Triángulo isósceles".
        Si todos los lados son diferentes, mostrar "Triángulo escaleno".
        Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".


 */
import java.util.Scanner;

public class ClasificacionTriangulo {

    public static void main(String[] args) {
        /*
    Resolucion del ejercicio
         */
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3, resultado;
        System.out.println("Ingrese la medida de los 3 lados del TRIÁNGULO: ");
        lado1 = teclado.nextDouble();
        lado2 = teclado.nextDouble();
        lado3 = teclado.nextDouble();
        resultado = lado1 + lado2;
        if (resultado < lado3) {
            System.out.println("No es un triangulo");
        } else {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("El trinagulo es Equilátero");
            } else {
                if (lado1 == lado2 && lado2 != lado3) {
                    System.out.println("El triángulo es Isóceles");
                } else {
                    if (lado1 != lado2 && lado2 != lado3) {
                        System.out.println("El triángulo es Escaleno");
                    }
                }
            }
        }
    }
}

package entrega01.ejercicio05;

import java.util.Scanner;

public class challenge05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;

        System.out.print("Ingrese el valor del lado 1: ");
        lado1 = input.nextInt();
        System.out.print("Ingrese el valor del lado 2: ");
        lado2 = input.nextInt();
        System.out.print("Ingrese el valor del lado 3: ");
        lado3 = input.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero");
        } else if (lado1 == lado2 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
    }
}

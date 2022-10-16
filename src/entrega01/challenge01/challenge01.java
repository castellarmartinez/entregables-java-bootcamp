package entrega01.challenge01;

import java.util.Scanner;

public class challenge01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un número en el rango [0-15]: ");
        numero = input.nextInt();

        System.out.println(convertirNumeroAPalabra(numero));
    }

    public static String convertirNumeroAPalabra(int numero) {
        switch (numero) {
            case 0:
                return "cero";
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            case 11:
                return "once";
            case 12:
                return "doce";
            case 13:
                return "trece";
            case 14:
                return "catorce";
            case 15:
                return "quince";
            default:
                return "unknown";
        }
    }
}

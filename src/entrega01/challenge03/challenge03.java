package entrega01.challenge03;

public class challenge03 {
    public static void main(String[] args) {
        int[] arreglo = {9, 8, 6, 7, 10, 8, 8, 5, 6, 7, 8, 7, 9, 6, 10};
        double suma = 0.0;
        double promedio;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        promedio = suma / arreglo.length;

        System.out.println("El promedio de los valores del arreglo es " + promedio);
    }
}

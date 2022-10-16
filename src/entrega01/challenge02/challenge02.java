package entrega01.challenge02;

public class challenge02 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("mi");
            } else if (numero % 5 == 0) {
                System.out.println("re");
            } else if (numero % 3 == 0) {
                System.out.println("do");
            } else {
                System.out.println(numero);
            }
        }
    }
}

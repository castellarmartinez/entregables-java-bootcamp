package entrega01.challenge04;

public class challenge04 {
    public static void main(String[] args) {
        String mensaje = "Hello world!";
        String mensajeInvertido = "";

        for (int i = mensaje.length() - 1; i >= 0; i--) {
            mensajeInvertido += mensaje.charAt(i);
        }

        System.out.println("El String invertido es: ");
        System.out.println(mensajeInvertido);
    }
}

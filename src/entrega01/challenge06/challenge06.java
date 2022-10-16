package entrega01.challenge06;

public class challenge06 {
    public static void main(String[] args) {
        String oracion = "Esta forma estoy entendiendo.";
        String oracionMinusculas = oracion.toLowerCase();
        char caracterMasRepetitivo = Character.MIN_VALUE;
        int conteoCaracterMasRepetitivo = 0;

        for (int i = 0; i < oracionMinusculas.length(); i++) {
            char caracterActual = oracionMinusculas.charAt(i);
            int conteoCaracter = 1;

            if (caracterActual != caracterMasRepetitivo && caracterActual != ' '
                    && caracterActual != ',' && caracterActual != '.') {
                for (int j = i + 1; j < oracionMinusculas.length(); j++) {
                    if (oracionMinusculas.charAt(j) == caracterActual) {
                        conteoCaracter++;
                    }
                }
            }

            if (conteoCaracter > conteoCaracterMasRepetitivo) {
                conteoCaracterMasRepetitivo = conteoCaracter;
                caracterMasRepetitivo = caracterActual;
            }
        }

        System.out.println(oracion);
        System.out.printf("Carácter '%c', %d repeticiones%n", caracterMasRepetitivo, conteoCaracterMasRepetitivo);
    }
}

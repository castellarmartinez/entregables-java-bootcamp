package entrega01.challenge06;

public class challenge06 {
    public static void main(String[] args) {
        String oracion = "Esta forma estoy entendiendo.";
        String oraciónMinusculas = oracion.toLowerCase();
        char caracterMasRepetitivo = Character.MIN_VALUE;
        int conteoCaracterMasRepetitivo = 0;

        for (int i = 0; i < oraciónMinusculas.length(); i++) {
            char caracterActual = oraciónMinusculas.charAt(i);
            int conteoCaracter = 1;

            if (caracterActual != caracterMasRepetitivo && caracterActual != ' '
                    && caracterActual != ',' && caracterActual != '.') {
                for (int j = i + 1; j < oraciónMinusculas.length(); j++) {
                    if (oraciónMinusculas.charAt(j) == caracterActual) {
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

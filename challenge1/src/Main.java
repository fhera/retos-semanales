import java.util.Arrays;
import java.util.Locale;

public class Main {
    /*
     * Reto #1
     * ¿ES UN ANAGRAMA?
     * Fecha publicación enunciado: 03/01/22
     * Fecha publicación resolución: 10/01/22
     * Dificultad: MEDIA
     *
     * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean)
     * según sean o no anagramas.
     * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
     * NO hace falta comprobar que ambas palabras existan.
     * Dos palabras exactamente iguales no son anagrama.
     *
     * Información adicional:
     * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
     * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
     * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
     * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
     *
     */
    public static void main(String[] args) {
        String wordOne = "amor";
        String wordTwo = "roma";
        System.out.println(isAnagram(wordOne, wordTwo));
        System.out.println(isAnagramOther(wordOne, wordTwo));
    }

    private static Boolean isAnagram(String wordOne, String wordTwo) {
        boolean result = false;
        if (!wordOne.equals(wordTwo)) {
            String copyOne = wordOne;
            String copyTwo = wordTwo;
            for (char x : wordOne.toLowerCase().toCharArray()) {
                if (copyTwo.toLowerCase().contains(String.valueOf(x))) {
                    copyTwo = copyTwo.replaceFirst(String.valueOf(x), "");
                    copyOne = copyOne.replaceFirst(String.valueOf(x), "");
                }
            }
            if (copyOne.isEmpty() && copyTwo.isEmpty()) {
                result = true;
            }
        }
        return result;
    }

    private static Boolean isAnagramOther(String wordOne, String wordTwo) {
        boolean result = false;
        if (!wordOne.equals(wordTwo)) {
            char[] copyOne = wordOne.toCharArray();
            char[] copyTwo = wordTwo.toCharArray();
            Arrays.sort(copyOne);
            Arrays.sort(copyTwo);
            result = Arrays.equals(copyOne, copyTwo);
        }
        return result;
    }
}
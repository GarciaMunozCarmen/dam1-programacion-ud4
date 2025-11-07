import java.util.Arrays;

/**
 * Actividad: invertir un array EN SU SITIO (sin crear arrays nuevos).
 * - Devuelve la MISMA referencia que recibe (ya invertida).
 */
public class InvertirArray {

    /**
     * Invierte el contenido de 'a' en su sitio (in-place) y devuelve la misma referencia.
     * Ejemplo:
     *   ["Elefante","Perro","Serpiente","Gato","Tiburón"]
     * → ["Tiburón","Gato","Serpiente","Perro","Elefante"]
     *
     */
    public static String[] invertir(String[] a) {
        String hueco;
        String[] invertido = new String[a.length];
        if(a.length != 0){
            for (int i = 0; i <= (a.length / 2); i++) {
                hueco = a[i];
                invertido[i] = a[a.length - 1 - i];
                invertido[a.length - 1 - i] = hueco;
            }
        }
        return invertido; // devolver la MISMA referencia (ya invertida)
    }

    // ----------------------------------------------------------------------

    public static void main(String[] args) {
        // 1) Caso del enunciado
        String[] animales = {"Elefante", "Perro", "Serpiente", "Gato", "Tiburón"};
        System.out.println("Antes : " + Arrays.toString(animales));
        System.out.println("Después: " + Arrays.toString(invertir(animales)));
        // Esperado: [Tiburón, Gato, Serpiente, Perro, Elefante]
        System.out.println();

        // 2) Longitud par
        String[] pares = {"A", "B", "C", "D"};
        System.out.println("Antes : " + Arrays.toString(pares));
        System.out.println("Después: " + Arrays.toString(invertir(pares)));
        // Esperado: [D, C, B, A]
        System.out.println();

        // 3) Longitud impar
        String[] impares = {"uno", "dos", "tres"};
        System.out.println("Antes : " + Arrays.toString(impares));
        System.out.println("Después: " + Arrays.toString(invertir(impares)));
        // Esperado: [tres, dos, uno]
        System.out.println();

        // 4) Un solo elemento (debe quedar igual)
        String[] uno = {"solo"};
        System.out.println("Antes : " + Arrays.toString(uno));
        invertir(uno);
        System.out.println("Después: " + Arrays.toString(invertir(uno)));
        // Esperado: [solo]
        System.out.println();

        // 5) Vacío (debe quedar igual, sin fallos)
        String[] vacio = {};
        System.out.println("Antes : " + Arrays.toString(vacio));
        invertir(vacio);
        System.out.println("Después: " + Arrays.toString(invertir(vacio)));
        // Esperado: []
    }
}
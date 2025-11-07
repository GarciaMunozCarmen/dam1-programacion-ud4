import java.util.Arrays;

public class FiltrarImpares {
    public static void comoTexto(int[] entrada){
        for (int i = 0; i < entrada.length; i++) {
            if(entrada[i] % 2 != 0){
                System.out.print(entrada[i] + " ");
            }
        }
    }
    public static int[] comoArray(int[] entrada){
        int[] salida = new int[entrada.length];
        int indice = 0;
        for (int i = 0; i < entrada.length; i++) {
            if(entrada[i] % 2 != 0){
                salida[indice++] = entrada[i];
            }
        }
        
        return Arrays.copyOf(salida, indice);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        comoTexto(array);
        System.out.println(Arrays.toString(comoArray(array)));
    }
}

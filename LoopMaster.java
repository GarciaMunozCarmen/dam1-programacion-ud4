import java.util.Scanner;

public class LoopMaster {
    public static void contarHastaN(int n){
        System.out.println("-----");
        for (int i = 1; i <= n; i++){
            if(i == n){
                System.out.print(i);
            }else{
                System.out.print(i + " ");
            }
        }
        System.out.println("\n-----");
    }
    public static void imprimirSumaHastaN(int n){
        int suma = 0;
        while (n > 0) {
            suma += n;
            n--;
        }
        System.out.println("Suma: " + suma);
        System.out.println("-----");
    }
    public static void imprimirTablaMultiplicar(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        System.out.println("-----");
    }
    //EXTRA
    public static void tablasMultiplicarAnteriores(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("-----");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int number = sc.nextInt();
        if(number < 1){
            System.out.print("Número no válido. Introduce un número mayor de 1: ");
            number = sc.nextInt();
            contarHastaN(number);
            imprimirSumaHastaN(number);
            imprimirTablaMultiplicar(number);
            tablasMultiplicarAnteriores(number);
        }else{
            contarHastaN(number);
            imprimirSumaHastaN(number);
            imprimirTablaMultiplicar(number);
            tablasMultiplicarAnteriores(number);
        }
        sc.close();
    }
}

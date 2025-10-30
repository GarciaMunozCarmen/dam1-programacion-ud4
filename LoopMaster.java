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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int number = sc.nextInt();
        if(number < 1){
            System.out.print("Número no válido. Introduce un númeor mayor de 1: ");
            number = sc.nextInt();
        }else{
            contarHastaN(number);
            imprimirSumaHastaN(number);
            imprimirTablaMultiplicar(number);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class SumaMientrasEsPositivo {
    public static void suma(){
        Scanner sc = new Scanner(System.in);
        int number= 0;
        int add = 0;
        System.out.print("Introduce un número: ");
        number = sc.nextInt();
        while (number >= 0){
            add += number;
            System.out.print("Introduce un número: ");
            number = sc.nextInt();
        }
        System.out.println("La suma es: " + add);
        sc.close();
    }
    public static void main(String[] args) {
        suma();
    }
}

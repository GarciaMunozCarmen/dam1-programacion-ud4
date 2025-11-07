import java.util.Scanner;

public class ParImparMultiplo3 {
    public static  String parImparMultiplo3(int n){
        if(n % 2 == 0){
            if(n % 3 == 0){
                return "par y múltiplo de 3";
            }
            return "par";
        }else{
            if(n % 3 == 0){
                return "impar y múltiplo de 3";
            }
            return "impar";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int number = sc.nextInt();
        System.out.printf("El número %d es %s", number, parImparMultiplo3(number));
        sc.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void secreto(){
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        final int MIN = 0;
        int secreto = MIN + new Random().nextInt(MAX - MIN +1);
        System.out.println("Estoy pensando un número del " + MIN + " al " + MAX);
        int intento = 0;
        int intentos;
        for (intentos = 0; intento != secreto; intentos++) {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            if(intento < secreto){
                System.out.println("Mayor");
            }
            if (intento > secreto) {
                System.out.println("Menor");
            }
        }
        sc.close();
        System.out.println("Acertaste en " + intentos + " intentos, el número era " + secreto);
        
        
    }
    public static void main(String[] args) {
        secreto();
    }
}

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    final static int MAX = 100;
    final static int MIN = 0;
    public static void secreto(){
        Scanner sc = new Scanner(System.in);
        int secreto = MIN + new Random().nextInt(MAX - MIN + 1);
        int tries = 0;
        while (true) {
            System.out.print("Tu intento: ");
            try {
                String guess = sc.nextLine();
                int guessInt = Integer.parseInt(guess);
                if(guessInt > MIN && guessInt < MAX){
                    int comparacion = Integer.compare(secreto, guessInt);
                    if(comparacion > 0){
                        System.out.println("Mayor");
                    } else if (comparacion < 0) {
                        System.out.println("Menor");
                    } else {
                        tries +=1;
                        System.out.println("Acertaste en " + tries + " intentos, el número era " + secreto);
                        break;
                    }
                    continue;
                }
                System.out.println("Número no válido, introduce un número dentro del intervalo");
            } catch (NumberFormatException e) {
                System.out.println("Input no válido, introduzca un número entero");
            } finally{
                tries +=1;
            }
        }
        sc.close();
        
        
    }
    public static void main(String[] args) {
        System.out.println("Estoy pensando un número del " + MIN + " al " + MAX);
        secreto();
    }
}

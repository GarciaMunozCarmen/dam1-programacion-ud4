import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuInteractivo {
    static Scanner sc = new Scanner(System.in);
    public static void hola(){
        System.out.println("Hola");
    }
    public static void hora(){
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(hora);
    }
    public static void eco(){
        System.out.print("Texto: ");
        String frase = sc.nextLine();
        System.out.println(frase);
    }
    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("-- MENÚ --\n1. Hola\n2. Hora\n3. Eco\n4. Salir");
            System.out.print("Elige: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1-> hola();
                case 2-> hora();
                case 3-> eco();
                case 4-> System.out.println("Adios");
                default-> System.out.println("Opción no válida");
            }
        } while (option != 4);
        
        sc.close();
    }
}

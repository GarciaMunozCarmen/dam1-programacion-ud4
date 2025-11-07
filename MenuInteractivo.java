import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuInteractivo {
    static Scanner sc = new Scanner(System.in);
    public static void hola(){
        System.out.print("Introduce tu nombre: ");
        String name = sc.nextLine();
        System.out.printf("Hola %s\n\n", name);
    }
    public static void hora(){
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(hora + "\n");
    }
    public static void eco(){
        System.out.print("Texto: ");
        String frase = sc.nextLine();
        System.out.println(frase + "\n");
    }
    public static void menu(){
        String option = "0";
        do {
            System.out.println("-- MENÚ --\n1. Hola\n2. Hora\n3. Eco\n4. Salir");
            System.out.print("Elige: ");
            try {
                option = sc.nextLine();
                switch (Integer.parseInt(option)) {
                    case 1-> hola();
                    case 2-> hora();
                    case 3-> eco();
                    case 4-> System.out.println("Adios");
                    default-> {
                        System.out.println("Opción no válida");
                        System.out.println("Pulsa enter para continuar");
                        sc.nextLine();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Input no válido, introduce un número (1-4)");
                System.out.println("Pulsa enter para continuar ");
                sc.nextLine();
            }

        } while (!option.equals("4"));
        
        sc.close();
    }
    public static void main(String[] args) {
        menu();
    }
}

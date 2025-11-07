import java.util.Scanner;

public class DiaDeLaSemana {
    public static void dayNumberSwitch(int number) {
        switch (number) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número inválido");
        }
    }

    public static void dayNumberIf(int number) {
        if (number == 1) {
            System.out.println("Lunes");
        } else if (number == 2) {
            System.out.println("Martes");
        } else if (number == 3) {
            System.out.println("Miércoles");
        } else if (number == 4) {
            System.out.println("Jueves");
        } else if (number == 5) {
            System.out.println("Viernes");
        } else if (number == 6) {
            System.out.println("Sábado");
        } else if (number == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número inválido");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int number = sc.nextInt();
        dayNumberIf(number);
        dayNumberSwitch(number);
        sc.close();
    }
}

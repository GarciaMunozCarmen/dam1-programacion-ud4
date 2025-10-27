import java.util.Scanner;

public class Semaforo {

    public String accionSemaforoIf(String color){
        if(color.equalsIgnoreCase("rojo")){
            return "Para";
        }else if(color.equalsIgnoreCase("amarillo")){
            return "Atento";
        }else if(color.equalsIgnoreCase("verde")){
            return "Pasa";
        }
        return "Color inválido";
    }

    public String accionSemaforoSwitch(String color){
        return switch (color.toLowerCase()) {
            case "rojo"->  "Para";
            case "amarillo"-> "Atento";
            case "verde"-> "Pasa";
            default-> "Color inválido";
        };
    }

    public static void main(String[] args){
        Semaforo semaforo = new Semaforo();
        // Pedir color al usuario usando Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un color: ");
        String color = sc.nextLine();
        // Llamar a método accionSemaforoIf
        // Mostrar por pantalla (System.out) el resultado
        System.out.println(semaforo.accionSemaforoIf(color));
        // Llamar a método accionSemaforoSwitch
        // Mostrar por pantalla (System.out) el resultado
        System.out.println(semaforo.accionSemaforoSwitch(color));
        sc.close();
    }
}
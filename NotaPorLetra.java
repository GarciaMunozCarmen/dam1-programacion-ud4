import java.util.Scanner;

public class NotaPorLetra {
    public static void notaSwitch (char letra){
        switch(Character.toUpperCase(letra)){
            case 'A'-> System.out.println("Sobresaliente");
            case 'B'-> System.out.println("Notable");
            case 'C'-> System.out.println("Bien");
            case 'D'-> System.out.println("Suficiente");
            case 'F'-> System.out.println("Insuficiente");
            default-> System.out.println("Letra inválida");
        }
    }
    public static void notaIf (char letra){
        letra = Character.toUpperCase(letra);
        if(letra == 'A'){
            System.out.println("Sobresaliente");
        }else if(letra == 'B'){
            System.out.println("Notable");
        }else if(letra == 'C'){
            System.out.println("Bien");
        }else if(letra == 'D'){
            System.out.println("Suficiente");
        }else if(letra == 'F'){
            System.out.println("Insuficiente");
        }else{
            System.out.println("Letra inválida");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        String palabra = sc.nextLine();
        if(palabra.length() == 1){
            char letra = palabra.charAt(0);
            notaIf(letra);
            notaSwitch(letra);
        }else{
            System.out.println("Input no válido");
        }
        sc.close();
    }
}

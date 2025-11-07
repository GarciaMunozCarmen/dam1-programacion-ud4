import java.util.Scanner;

class Calificacion {

    public String obtenerCalificacion(double valor) {
        if(valor < 0 || valor > 10){
            return "Nota inválida";
        }else if(valor < 5){
            return "Insuficiente";
        }else if(valor < 6){
            return "Aprovado";
        }else if(valor < 7){
            return "Bien";
        }else if(valor < 9){
            return "Notable";
        }else{
            return "Sobresaliente";
        }

    }

    public static void main(String[] args) {
        Calificacion programa = new Calificacion();
        double nota;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la nota: ");
            nota = sc.nextDouble();
            String calificacion = programa.obtenerCalificacion(nota);
            // Mostrar calificacion
            System.out.println(calificacion);
        } while (nota < 0 || nota > 10);
        
    }
}
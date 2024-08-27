import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner miScanner1 = new Scanner(System.in);
        Scanner miScanner2 = new Scanner(System.in);
        Scanner miScanner3 = new Scanner(System.in);

        System.out.println("Bievenide a tu evaluador de clases, por favor ingresa tu calificación final de Matemática:");
        Integer calificacionMatematica = miScanner1.nextInt();
        System.out.println("Ahora, por favor ingresa tu calificación final de Lenguaje:");
        Integer calificacionLenguaje = miScanner2.nextInt();
        System.out.println("Por último, ingresa tu calificación final de Educación Física:");
        Integer calificacionEdFisica = miScanner3.nextInt();

        //MATEMÁTICA


        if (calificacionMatematica <= 3) {
            System.out.println("Reprobaste matemática");
        }
        else if (calificacionMatematica > 3 && calificacionMatematica <= 5) {
            System.out.println("No reprobaste matemática, pero tu desempeño fue insuficiente");
            }
        else if (calificacionMatematica > 5 && calificacionMatematica <= 8) {
            System.out.println("Tu desempeño en matemática fue aceptable");
        }
        else if (calificacionMatematica > 8 && calificacionMatematica <= 10) {
            System.out.println("Tu desempeño en matemática fue excelente");
        }
        else {
            System.out.println("Esta entrada es inválida");
        }

        //LENGUAJE

        if (calificacionLenguaje <= 3) {
            System.out.println("Reprobaste lenguaje");
        }
        else if (calificacionLenguaje > 3 && calificacionLenguaje <= 5) {
            System.out.println("No reprobaste lenguaje, pero tu desempeño fue insuficiente");
        }
        else if (calificacionLenguaje > 5 && calificacionLenguaje <= 8) {
            System.out.println("Tu desempeño en lenguaje fue aceptable");
        }
        else if (calificacionLenguaje > 8 && calificacionLenguaje <= 10) {
            System.out.println("Tu desempeño en lenguaje fue excelente");
        }
        else {
            System.out.println("Esta entrada es inválida");
        }

        //ED FÍSICA

        if (calificacionEdFisica <= 3) {
            System.out.println("Reprobaste Educación física");
        }
        else if (calificacionEdFisica > 3 || calificacionEdFisica <= 5) {
            System.out.println("No reprobaste Educación física, pero tu desempeño fue insuficiente");
        }
        else if (calificacionEdFisica > 5 && calificacionEdFisica <= 8) {
            System.out.println("Tu desempeño en Educación física fue aceptable");
        }
        else if (calificacionEdFisica > 8 && calificacionEdFisica <= 10) {
            System.out.println("Tu desempeño en Educación física fue excelente");
        }
        else {
            System.out.println("Esta entrada es inválida");
        }





    }
}

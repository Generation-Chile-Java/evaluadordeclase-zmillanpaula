import java.util.*;

public class LibretaDeNotas {
    public static void main(String[] args) {
        //creo un hashmap con clave string para los nombres y elemento arraylist integer para almacenar las notas
        Map<String, ArrayList<Integer>> notasPorEstudiante = new HashMap<>();
        Scanner miScanner = new Scanner(System.in);

        //SALUDO E INGRESO DE CANTIDAD DE ESTUDIANTES
        System.out.println("Bienvenide a tu libreta de notas. Aquí podrás registrar y analizar las notas de tus estudiantes. ¿Cuántos estudiantes hay en tu curso?");
        int cantidadEstudiantes = miScanner.nextInt();

        //INGRESO DE CANTIDAD DE NOTAS POR ALUMNO
        System.out.println("¿Cuántas notas deseas ingresas por estudiante?");
        int cantidadNotas = miScanner.nextInt();

        //limpiar el buffer? preguntar
        miScanner.nextLine();

        //ciclo for para ingreso de nombre tendrá como límite cantidadEstudiantes para detenerse al llegar al último estudiante
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante n° " + (i + 1) + ":");
            String nombreEstudiante = miScanner.nextLine();

            //armo un array para almacenar las notas
            ArrayList<Integer> notas = new ArrayList<>();
            //comienzo otro ciclo for dentro del anterior para ingresar todas las notas hasta el límite del array que se da por la variable cantidadNotas
            for (int n = 0; n < cantidadNotas; n++ ) {
                System.out.println("Ingrese la nota " + (n + 1) + " de " + nombreEstudiante + ":");
                //creo una variable nota para que el usuario pueda ir ingresando
                int nota = miScanner.nextInt();
                //metodo .add para agregar cada elemento al array
                notas.add(nota);


            }

            //limpiar el buffer denuevo... no entiendo eso, pero creo que es para que se quede en blanco en la consola y no vaya acumulando la información
            miScanner.nextLine();

            //Almaceno las claves y elementos en el HashMap
            notasPorEstudiante.put(nombreEstudiante, notas);

            //necesito suma de todas las notas además así que declararé esa variable
        }

        HashMap<String, Float> listaDePromedios = new HashMap<>();

        float sumatoriaNotas = 0;
        int cantidadTotalNotas = 0;

    //recorrer el HashMap
        System.out.println("Estas son las notas de tus " + cantidadEstudiantes + " estudiantes.");
        for (String nombreEstudiante : notasPorEstudiante.keySet()) {
            //invoco al array ESTO NO SE TE PUEDE OLVIDAR MALDITA SEA ESTUVISTE HORAS ACÁ
            ArrayList<Integer> notas = notasPorEstudiante.get(nombreEstudiante);


            float sumaNotasEstudiante = 0;
            int notaMaxima = notas.getFirst();
            int notaMinima = notas.getFirst();

            for ( int nota : notas)  {
                sumaNotasEstudiante+= nota;
                sumatoriaNotas += sumaNotasEstudiante;
                if (nota > notaMaxima) {
                    notaMaxima = nota;
                }
                if (nota < notaMinima) {
                    notaMinima = nota;
                }
            }

            //necesito acumular también cantidad de notas global
            cantidadTotalNotas += notas.size();

            //aquí ya calculé el promedio, le valor a la variable promedioPorEstudiante
            float promedioPorEstudiante = sumaNotasEstudiante / notas.size();
            //guardo los promedios que saqué en este for en el hashmap nuevo
            listaDePromedios.put(nombreEstudiante, promedioPorEstudiante);


            //Mostramos resultadossssss
            System.out.println(nombreEstudiante + ":" + notas);
            System.out.println("Promedio: " + promedioPorEstudiante);
            System.out.println("Nota máxima: " + notaMaxima);
            System.out.println("Nota mínima: " + notaMinima);
            System.out.println();


            // acá estoy generando el valor de sumatoriaNotas y cantidadTotalNotas para poder generar el promedioGlobal


        }
        double promedioGlobal = sumatoriaNotas / cantidadTotalNotas;

        System.out.println("Ingresa la opción que necesites: \n 1. Promedio de notas por estudiante \n 2. Calculadora de aprobación/ reprobación \n 3. Posición relativa del promedio por estudiante \n 0. Salir del menú");

        switch (miScanner.nextInt()) {
            case 1:
                System.out.println("Aquí están los promedios por estudiante:");
                for (String nombreEstudiante : listaDePromedios.keySet()) {
                    System.out.println(nombreEstudiante + ":" + listaDePromedios.get(nombreEstudiante));
                }
            break;
            case 2:
                System.out.println("Ingresa el nombre del estudiante:");
                String estudianteAprobacion = miScanner.next();

                System.out.println("Ingresa la nota del estudiante:");
                int notaCalculo = miScanner.nextInt();

                if (notaCalculo >= 4 && notaCalculo <= 10) {
                System.out.println(estudianteAprobacion + " Aprobó:)");
            }
            else if (notaCalculo < 4 && notaCalculo > 0) {
                System.out.println(estudianteAprobacion + " Reprobó :(");
            }
            else {
                    System.out.println("Esta entrada es inválida");
                }
            break;
            case 3:
                System.out.println("Ingresa el nombre del estudiante:");
                String estudiantePosicion = miScanner.next();
                System.out.println("Ingresa la nota del estudiante:");
                double notaPosicion = miScanner.nextDouble();

                if (notaPosicion >= promedioGlobal) {
                    System.out.println("La nota de " + estudiantePosicion + "está por sobre el promedio del curso");
                }
                else if (notaPosicion < promedioGlobal && notaPosicion > 0) {
                    System.out.println("La nota de " + estudiantePosicion + "está por debajo del promedio del curso");
                }
                else {
                    System.out.println("Esta entrada es inválida");
                }
            case 0:
                System.out.println("Que te vaya bien :)");





        }
    }
}

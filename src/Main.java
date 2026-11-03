import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int opcion;
        int op;

        do {
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. MCD");
            System.out.println("4. Creditos");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un numero: ");
                    int n = sc.nextInt();

                    long inicioI = System.nanoTime();
                    long resultadoI = Factorial.factorialIterativo(n);
                    long finI = System.nanoTime();

                    Factorial.contadorRecursivo = 0;

                    long inicioR = System.nanoTime();
                    long resultadoR = Factorial.factorialRecursivo(n);
                    long finR = System.nanoTime();

                    System.out.println("FACTORIAL iterativo");
                    System.out.println("Resultado: " + resultadoI);
                    System.out.println("Vueltas: " + Factorial.contadorIterativo);
                    System.out.println("Tiempo: "
                            + ((finI - inicioI) / 1_000_000.0)
                            + " ms");

                    System.out.println("FACTORIAL recursivo");
                    System.out.println("Resultado: " + resultadoR);
                    System.out.println("Llamadas: " + Factorial.contadorRecursivo);
                    System.out.println("Tiempo: "
                            + ((finR - inicioR) / 1_000_000.0)
                            + " ms");

                    break;
                case 2:
                    System.out.print("Ingrese el termino Fibonacci: ");
                    n = sc.nextInt();

                    inicioI = System.nanoTime();
                    resultadoI = Fibonacci.fibonacciIterativo(n);
                    finI = System.nanoTime();

                    Fibonacci.contadorRecursivo = 0;

                    inicioR = System.nanoTime();
                    resultadoR = Fibonacci.fibonacciRecursivo(n);
                    finR = System.nanoTime();

                    System.out.println("FIBONACCI iterativo");
                    System.out.println("Resultado: " + resultadoI);
                    System.out.println("Vueltas: " + Fibonacci.contadorIterativo);
                    System.out.println("Tiempo: "
                            + ((finI - inicioI) / 1_000_000.0)
                            + " ms");

                    System.out.println("FIBONACCI recursivo");
                    System.out.println("Resultado: " + resultadoR);
                    System.out.println("Llamadas: " + Fibonacci.contadorRecursivo);
                    System.out.println("Tiempo: "
                            + ((finR - inicioR) / 1_000_000.0)
                            + " ms");

                    break;
                case 3:
                    System.out.print("Ingrese M: ");
                    int m = sc.nextInt();

                    System.out.print("Ingrese N: ");
                    int num = sc.nextInt();

                    inicioI = System.nanoTime();
                    int resultadoMCDI = MCD.mcdIterativo(m, num);
                    finI = System.nanoTime();

                    MCD.contadorRecursivo = 0;

                    inicioR = System.nanoTime();
                    int resultadoMCDR = MCD.mcdRecursivo(m, num);
                    finR = System.nanoTime();

                    System.out.println("MCD iterativo");
                    System.out.println("Resultado: " + resultadoMCDI);
                    System.out.println("Vueltas: " + MCD.contadorIterativo);
                    System.out.println("Tiempo: "
                            + ((finI - inicioI) / 1_000_000.0)
                            + " ms");

                    System.out.println("MCD recursivo");
                    System.out.println("Resultado: " + resultadoMCDR);
                    System.out.println("Llamadas: " + MCD.contadorRecursivo);
                    System.out.println("Tiempo: "
                            + ((finR - inicioR) / 1_000_000.0)
                            + " ms");

                    break;
                case 4:
                    System.out.println("Materia:Estructura de Datos ");
                    System.out.println("Nombre: Isabella Guadalupe Salas Ramirez");
                    System.out.println("Matricula: 24170045");
                    break;
                case 5:
                    System.out.println("Saliendo de mi programitaaa");
                    System.exit(0);
                    break;
            }
            System.out.println("Desea continuar?: ");
            System.out.println("1. Sip");
            System.out.println("2. Nop");
            op = sc.nextInt();
        }while (op == 1);


    }
}
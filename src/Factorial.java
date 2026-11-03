public class Factorial {

    public static int contadorIterativo;
    public static int contadorRecursivo;

    public static long factorialIterativo(int n) {

        contadorIterativo = 0;

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            contadorIterativo++;
        }

        return factorial;
    }

    public static long factorialRecursivo(int n) {

        contadorRecursivo++;

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursivo(n - 1);
    }
}

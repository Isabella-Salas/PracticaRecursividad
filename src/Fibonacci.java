public class Fibonacci {

    public static int contadorIterativo;
    public static int contadorRecursivo;

    public static long fibonacciIterativo(int n) {

        contadorIterativo = 0;

        if (n == 0 || n == 1) {
            return n;
        }

        long s0 = 0;
        long s1 = 1;
        long sn = 0;

        for (int i = 2; i <= n; i++) {

            sn = s0 + s1;
            s0 = s1;
            s1 = sn;

            contadorIterativo++;
        }

        return sn;
    }

    public static long fibonacciRecursivo(int n) {

        contadorRecursivo++;

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacciRecursivo(n - 1)
                + fibonacciRecursivo(n - 2);
    }
}

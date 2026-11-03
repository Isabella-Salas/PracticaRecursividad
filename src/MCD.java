public class MCD {

    public static int contadorIterativo;
    public static int contadorRecursivo;

    public static int mcdIterativo(int m, int n) {

        contadorIterativo = 0;

        while (m % n != 0) {

            int res = m % n;

            m = n;
            n = res;

            contadorIterativo++;
        }

        return n;
    }

    public static int mcdRecursivo(int m, int n) {

        contadorRecursivo++;

        if (m % n == 0) {
            return n;
        }

        return mcdRecursivo(n, m % n);
    }
}

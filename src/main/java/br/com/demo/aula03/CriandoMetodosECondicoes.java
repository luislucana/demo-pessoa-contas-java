package br.com.demo.aula03;

public class CriandoMetodosECondicoes {

    /**
     * GCD (greatest common divisor)
     */
    int gcdRecursivo(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcdRecursivo(y, x % y);
    }

    /**
     * GCD (greatest common divisor)
     */
    /*int gcdIterativo(int x, int y) {
        var a = x;
        var b = y;
        while (b > 0) {
            a = a % b
            val t = a
            a = b
            b = t
        }
        a
    }*/

    public static void main(String[] args) {

    }
}

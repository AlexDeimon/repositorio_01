package fundaConcepts;

/**
 * Java Factorial Example This Java Factorial Example shows how to calculate factorial of a given
 * number using Java.
 */
public class NumberFactorial {
    public static void main(String[] args) {
        int number = 5;
        /*
         * Factorial of any number is !n.
         * For example, factorial of 4 is 4*3*2*1.
         */
        int factorial = number;
        for (int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is " + factorial);
    }
}
/*
 Output of the Factorial program would be
 Factorial of a number is 120
 */

// 1. Calcular el área de un tríangulo
// 2. Calcular el perímetro de un círculo
// 3. Calcular el perímetro de un rectángulo
// 4. Calcular de un arreglo cuáles valores son pares y cuáles impares


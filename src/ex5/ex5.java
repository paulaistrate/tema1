package ex5;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(21);

        System.out.println("Numarul generat: " + x);

        if (esteInFibonacci(x)) {
            System.out.println("Numarul " + x + " apartine sirului lui Fibonacci.");
        } else {
            System.out.println("Numarul " + x + " NU apartine sirului lui Fibonacci.");
        }
    }

    public static boolean esteInFibonacci(int x) {
        if (x == 0 || x == 1) {
            return true;
        }

        int a = 0, b = 1;
        while (b < x) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == x;
    }
}

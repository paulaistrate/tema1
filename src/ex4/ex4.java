package ex4;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(30);
        int b = random.nextInt(30);

        System.out.println("numere sunt " + a + " si " + b);
        int cmmdc;
        while (b != 0) {
            int x = a % b;
            a = b;
            b = x;
        }
        cmmdc = a;
        System.out.println("cmmdc este " + cmmdc);


    }
}

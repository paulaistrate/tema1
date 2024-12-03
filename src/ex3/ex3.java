package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("numarul dat: ");
        int n = scanner.nextInt();
        int x = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                x++;

        }
        if (x == 1)
            System.out.println("nr este prim");
        else {
            System.out.println("divizorii sunt: ");
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0)
                    System.out.print(i + " ");
            }
            System.out.print(+n);
        }
    }
}

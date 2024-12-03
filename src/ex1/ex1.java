package ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lungime= ");
        int lungime = scanner.nextInt();
        System.out.println("latime= ");
        int latime = scanner.nextInt();

        int arie=latime*lungime;
        int perimetru=2*latime+2*lungime;
        System.out.println("perimetrul este : " +perimetru);
        System.out.println("aria este : " +arie);
        scanner.close();
    }
}

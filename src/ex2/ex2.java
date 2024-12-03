package ex2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try{

            File f = new File("in.txt");
            Scanner scanner = new Scanner(f);

            int s=0;
            int x=0;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            double med=0;
            while(scanner.hasNext()){
                int n=scanner.nextInt();
                s=s+n;
                x++;

                if(n<min)
                    min=n;
                if(n>max)
                    max=n;
            }

            med=(x>0)?(double) s/x:0;

            PrintWriter writer = new PrintWriter("out.txt");
            writer.println("Suma: " + s);
            writer.println("medie: " + med);
            writer.println("min: " + min);
            writer.println("Max: " + max);
            writer.close();
            System.out.println("succes");

        }catch (Exception e){
            System.out.println("eroare" +e.getMessage());
        }
    }

}

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        int[] n = new int[a];
        int i, j , k;

        for (int l = 0; l < b; l++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();

            for (int m = i - 1; m < j; m++)
                n[m] = k;
        }

        for (int l = 0; l < a; l++) {
            System.out.print(n[l] + " ");
        }
    }
}
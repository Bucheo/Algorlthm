import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        int[] n = new int[a];
        int i, j;

        for (int k = 0; k < a; k++) {
            n[k] = k+1;
        }

        for (int l = 0; l < b; l++) {
            i = sc.nextInt();
            j = sc.nextInt();

            int temp = 0;
            temp = n[i-1];
            n[i-1] = n[j-1];
            n[j-1] = temp;
        }

        for (int l = 0; l < a; l++) {
            System.out.print(n[l] + " ");
        }
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String str = sc.next();
        String[] arr = str.split("");

        int sum = 0;

        for (int i = 0; i < a; i++)
            sum += Integer.parseInt(arr[i]);

        System.out.println(sum);
    }
}
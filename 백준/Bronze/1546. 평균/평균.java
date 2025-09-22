import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[sc.nextInt()];
        double sum = 0;

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        sc.close();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) 
            sum += (arr[i] / arr[arr.length - 1] * 100);
        
        System.out.print(sum / arr.length);
    }
}